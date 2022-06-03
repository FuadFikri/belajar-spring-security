package com.syamsudin.springsecurity.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {


    @PreAuthorize("hasAuthority('EDIT_TRANSAKSI')")
    @GetMapping("/home")
    public String home() {
        return "home.html";
    }
}
