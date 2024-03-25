# 💰 계좌 및 거래 관련 기본적인 기능을 구현한 프로젝트
: 계좌를 생성, 조회, 해지 & 거래를 생성, 취소, 조회 하는 기능 구현하기

## 💸 프로젝트 기간 : 2024.03.20 ~ 2024.03.25

## 💸 주요 기능
1. 계좌 생성하기 (사용자당 최대 10개 이하의 계좌 생성 가능) 
2. 계좌 해지하기
3. 계좌 정보 확인하기
4. 거래 생성하기 (중복거래 방지하기)
5. 거래 취소하기 (1년이 넘은 거래는 사용 취소 불가능)
6. 거래 내역 조회하기 (성공, 실패 상관없이 거래 내역 남기기) 

## 💸 STACKS
<div align=center> 
  <img src="https://img.shields.io/badge/java-007396?style=for-the-badge&logo=java&logoColor=white">
  <img src="https://img.shields.io/badge/springboot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white">
  <img src="https://img.shields.io/badge/gradle-02303A?style=for-the-badge&logo=gradle&logoColor=white">
  <img src="https://img.shields.io/badge/github-181717?style=for-the-badge&logo=github&logoColor=white">
  <img src="https://img.shields.io/badge/git-F05032?style=for-the-badge&logo=git&logoColor=white">
</div>

## 💸 개발 환경
- IDE : IntelliJ Ultimate
- Framework : Spring Boot 3.2.3
- Build Tool : Gradle
- Language : Java 17
- DataBase : Redis, H2 Database, (JPA)
- 라이브러리 : Lombok, Validation, JUnit5, Mockito

## 💸ERD
<img width="100%" src="https://github.com/ESJung95/Account-project/assets/155522048/d1c1f160-0e02-4db2-92fd-b65ad806675e"/>

## 💸 기능 한눈에 보기 (영상 추가하기)
### 1. 계좌 생성하기

### 2. 계좌 해지하기

### 3. 계좌 정보 확인하기

### 4. 거래 생성하기

### 5. 거래 취소하기

### 6. 거래 내역 조회하기

## 💸 개선 사항
- Spring AOP (Aspect-Oriented Programming) 공부하기
- 전반적인 구조와 패턴에 대해서 공부하기
- 리팩토링에 대해서 알아보자!
    
## 💸 프로젝트 후 느낀점
- 수동으로 하나하나 테스트를 했었는데, JUnit, Mockito를 이용한 테스트의 편리성과 알게 되었다.<br>
하지만, Mockito 사용법에 대해서 공부가 필요하다.

- 예외처리가 자세할 수록 직관적으로 에러를 확인할 수 있어서 편리했다.
 
- Lombok의 편리함 & 위대함을 느낌과 동시에 <br> 코드의 전체적인 복잡도가 올라갔을 때 위험성(?)을 깨달았다.<br>
  코드 리팩토링 중에 Lombok이 꼬여서 2시간을 헤메다 해결한 경험을 했다.
  
  
