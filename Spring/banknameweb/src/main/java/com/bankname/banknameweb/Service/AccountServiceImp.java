package com.bankname.banknameweb.service;

import com.bankname.banknameweb.dto.UserResponse;
import com.bankname.banknameweb.entity.Account;
import com.bankname.banknameweb.entity.User;
import com.bankname.banknameweb.repository.AccountRepository;
import com.bankname.banknameweb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class AccountServiceImp implements AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public Account createAccount(User savedUser) {
        String accountNumber = generarteaccountNumber();
        Account account = new Account();
        account.setAccountNumber(accountNumber);
        account.setBalance(0.0);
        Account savedaccount = accountRepository.save(account);
        return savedaccount;

    }

    public String generarteaccountNumber() {
        String accountNumber;
        do {
            accountNumber = UUID.randomUUID().toString().replace("-", "").substring(0, 7);
        }
        while (accountRepository.findByAccountNumber(accountNumber) != null);
        return accountNumber;
    }
}
