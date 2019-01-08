package com.transcend.lab.services;

import com.transcend.lab.domain.Account;
import com.transcend.lab.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Profile("middle")
public class AccountService {

    AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public Account getAccountById(Long id) {
        return accountRepository.findById(id).orElse(null);
    }

    public List<Account> getAllAccounts() {
        List<Account> userList = new ArrayList<>();
        accountRepository.findAll().forEach(userList::add);
        return userList;
    }

    public Account saveAccount(Account user) {
        return accountRepository.save(user);
    }

    public void deleteAccount(Account user) {
        accountRepository.delete(user);
    }

    public void deleteAccountById(Long id) {
        accountRepository.deleteById(id);
    }
}
