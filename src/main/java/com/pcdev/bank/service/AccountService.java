package com.pcdev.bank.service;

import com.pcdev.bank.model.Account;
import com.pcdev.bank.repository.AccountRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    private final AccountRepository repository;

    public AccountService(AccountRepository repository) {
        this.repository = repository;
    }

    public Account create(Account account) {
        return repository.save(account);
    }

    public List<Account> listAll() {
        return repository.findAll();
    }
}