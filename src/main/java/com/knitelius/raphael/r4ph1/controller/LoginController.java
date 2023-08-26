package com.knitelius.raphael.r4ph1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping("/login")
    String login() {
        return "login";
    }
}
