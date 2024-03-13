package com.bankname.banknameweb.controller;

import com.bankname.banknameweb.dto.UserResponse;
import com.bankname.banknameweb.entity.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @PostMapping("/register")
    public ResponseEntity<UserResponse> register(@RequestBody User user)
    {

    }
}
