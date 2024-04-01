package com.example.demo.service;

import com.example.demo.entity.Account;

import java.util.List;

public interface AccountService {
    public Account createAccount(Account account);
    public Account getccountDetailsByAccountNumber(Long accountNumber);
    public List<Account> getAllAccountDetails();
    public Account depositMoney(Long accountNumber,Double money);
    public Account withdrawAmount(Long accountNumber,Double money);
    public  void closeAccount(Long accountNumber);
}
