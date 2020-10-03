package com.personal.springboot.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @RequestMapping("/welcome")
    public String getWelcomePage() {
        return  "Welcome to Springboot Applciation";
    }
}
