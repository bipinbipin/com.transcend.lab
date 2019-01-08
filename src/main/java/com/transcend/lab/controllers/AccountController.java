package com.transcend.lab.controllers;

import com.transcend.lab.domain.Account;
import com.transcend.lab.services.AccountService;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Profile("middle")
public class AccountController {

    AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("/api/accounts/")
    public List<Account> getAccounts() {
        return accountService.getAllAccounts();
    }
    @GetMapping("/api/accounts/{id}")
    public Account getAccounts(@PathVariable Long id) {
        return accountService.getAccountById(id);
    }
}
