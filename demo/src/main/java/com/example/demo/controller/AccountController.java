package com.example.demo.controller;

import com.example.demo.entity.Account;
import com.example.demo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    public AccountService accountService;
//    crate the account
    @PostMapping("/create")
    public ResponseEntity<Account> createAccount(@RequestBody Account account){
        Account account1 = accountService.createAccount(account);

        return ResponseEntity.status(HttpStatus.CREATED).body(account1);
    }
    @GetMapping("/{accountNumber}")
    public ResponseEntity<Account> getDetails(@PathVariable Long accountNumber){
        Account account = accountService.getccountDetailsByAccountNumber(accountNumber);
        return ResponseEntity.ok(account);
    }
}
