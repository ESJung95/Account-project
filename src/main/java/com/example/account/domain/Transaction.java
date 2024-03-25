package com.example.account.domain;

// table이랑 1:1로 매칭되는 Entity 객체

import com.example.account.type.AccountStatus;
import com.example.account.type.TransactionResultType;
import com.example.account.type.TransactionType;
import jakarta.persistence.*;
import lombok.*;
import lombok.extern.java.Log;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Transaction extends BaseEntity{

    @Enumerated(EnumType.STRING)
    private TransactionType transactionType;
    @Enumerated(EnumType.STRING)
    private TransactionResultType transactionResultType;

    @ManyToOne
    private Account account;
    private Long amount;
    private Long balanceSnapshot;

    private String transactionId;
    private LocalDateTime transactedAt;
}
