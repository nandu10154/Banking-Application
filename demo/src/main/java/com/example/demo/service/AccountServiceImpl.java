package com.example.demo.service;

import com.example.demo.entity.Account;
import com.example.demo.repo.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

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
        Optional<Account> account = accountRepository.findById(accountNumber);
        if(account.isEmpty()){
            throw new RuntimeException("Account is not Exists");
        }
        Account found = account.get();
        return found;
    }

    @Override
    public List<Account> getAllAccountDetails() {
        List<Account> accounts = accountRepository.findAll();
        if(accounts.isEmpty()){
            throw new RuntimeException("Account is not Exists");
        }
        return accounts;
    }

    @Override
    public Account depositMoney(Long accountNumber, Double money) {
        Optional<Account> account = accountRepository.findById(accountNumber);
        if(account.isEmpty()){
            throw new RuntimeException("Account is not Exists");
        }
        Account deposit = account.get();
        double v = deposit.getAccount_balance() + money;
        deposit.setAccount_balance(v);
        accountRepository.save(deposit);
        return deposit;
    }

    @Override
    public Account withdrawAmount(Long accountNumber, Double money) {
        Optional<Account> account = accountRepository.findById(accountNumber);
        if (account.isEmpty()){
            throw new RuntimeException("account not found");
        }
        Account withdraw = account.get();
        Double balance = withdraw.getAccount_balance();
        if(balance<money){
            throw new RuntimeException("Aount entered is lessthan balance");
        }
        Double total = balance-money;
        withdraw.setAccount_balance(total);
        accountRepository.save(withdraw);

        return withdraw;
    }

    @Override
    public void closeAccount(Long accountNumber) {

    }
}
