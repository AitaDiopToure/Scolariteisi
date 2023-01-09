package com.groupeisi.Scolariteisi.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class Login {
    @GetMapping("/")
    public String home(){
        return "home";
    }
}
