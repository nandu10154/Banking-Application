package com.example.demo.service;

import com.example.demo.entity.Account;
import com.example.demo.repo.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AccountServiceImpl implements AccountService{
    @Autowired
    AccountRepository accountRepository;
    @Override
    public Account createAccount(Account account) {
        Account save = accountRepository.save(account);
        return save;

    }

    @Override
    public Account getccountDetailsByAccountNumber(Long accountNumber) {
        return null;
    }

    @Override
    public List<Account> getAllAccountDetails() {
        return null;
    }

    @Override
    public Account depositMoney(Long accountNumber, Double money) {
        return null;
    }

    @Override
    public Account withdrawAmount(Long accountNumber, Double money) {
        return null;
    }

    @Override
    public void closeAccount(Long accountNumber) {

    }
}
