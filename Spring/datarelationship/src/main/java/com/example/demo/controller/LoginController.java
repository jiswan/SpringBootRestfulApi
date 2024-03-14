package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login()
    {
        return "login.html";
    }

    @PostMapping("/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password)
    {
        if(username.equals("user")&&password.equals("password"))
        {
            return "redirect:/home";
        }
        else
        {
            return "redirect:/login";
        }
    }

    @RequestMapping("/home")
    public String home() {
        return "home.html";
    }
}
