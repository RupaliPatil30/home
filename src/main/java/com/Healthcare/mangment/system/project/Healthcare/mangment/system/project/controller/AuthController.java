package com.Healthcare.mangment.system.project.Healthcare.mangment.system.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {

    @GetMapping("/login")
    public String login() {
        return "login";  // return login.html view
    }

    @GetMapping("/logout")
    public String logout() {
        return "logout";  // return logout.html view
    }
}

