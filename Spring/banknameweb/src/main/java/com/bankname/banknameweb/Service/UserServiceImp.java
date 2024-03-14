package com.bankname.banknameweb.service;

import com.bankname.banknameweb.entity.Account;
import com.bankname.banknameweb.entity.User;
import com.bankname.banknameweb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements  UserService{
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private AccountService accountService;
    @Override
    public User registerUser(User user) {
        User savedUser =userRepository.save(user);
        Account account =accountService.createAccount(savedUser);
        savedUser.setAccount(account);
        userRepository.save(savedUser);
        System.out.print("Account Number :"+savedUser.getAccount().getAccountNumber());
        System.out.print("Account Holder Name :"+account.getUser().getName());
        return savedUser;
    }
}
