package com.example.foodhubapplicationspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login(){
        return"login";
    }

    @GetMapping("/")
    public String home(){
        return"index";
    }

    @GetMapping("/index")
    public String index(){
        return"index";
    }
}
