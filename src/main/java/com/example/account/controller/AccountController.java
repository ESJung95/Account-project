package com.example.account.controller;

import com.example.account.domain.Account;
import com.example.account.dto.AccountDto;
import com.example.account.dto.AccountInfo;
import com.example.account.dto.CreateAccount;
import com.example.account.dto.DeleteAccount;
import com.example.account.repository.AccountRepository;
import com.example.account.service.AccountService;
import com.example.account.service.RedisTestService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.hibernate.sql.Delete;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class AccountController {
    private final AccountService accountService;
    private final RedisTestService redisTestService;

    @PostMapping("/account") // 계좌 생성 API
    public CreateAccount.Response createAccount(
            @RequestBody @Valid CreateAccount.Request request
    ) {
        return CreateAccount.Response.from(
                accountService.createAccount(
                request.getUserId(),
                request.getInitialBalance())
        );
    }

    @DeleteMapping("/account") // 계좌 해지 API
    public DeleteAccount.Response deleteAccount(
            @RequestBody @Valid DeleteAccount.Request request
    ) {
        return DeleteAccount.Response.from(
                accountService.deleteAccount(
                    request.getUserId(),
                    request.getAccountNumber()
                )
        );
    }

    @GetMapping("/account") // 계좌 조회 API
    public List<AccountInfo> getAccountsByUserId(
            @RequestParam("user_id") Long userId
    ) {
        return accountService.getAccountsByUserId(userId)
                .stream().map(accountDto -> AccountInfo.builder()
                        .accountNumber(accountDto.getAccountNumber())
                        .balance(accountDto.getBalance())
                        .build())
                .collect(Collectors.toList());

    }

    @GetMapping("/get-lock")
    public String getLock() {
        return redisTestService.getLock();
    }

    @GetMapping("/account/{id}")
    public Account getAccount(
            @PathVariable Long id) {
        return accountService.getAccount(id);
    }
}
