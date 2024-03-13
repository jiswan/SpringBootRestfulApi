package com.bankname.banknameweb.service;

import com.bankname.banknameweb.dto.UserResponse;
import com.bankname.banknameweb.entity.User;
import com.bankname.banknameweb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImp implements AccountService {

    @Autowired
    private UserRepository userRepository;
    @Override
    public User registerUser(User user) {
        User savedUser =userRepository.save(user);
        UserResponse
    }
}
