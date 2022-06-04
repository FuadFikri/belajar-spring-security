package com.syamsudin.springsecurity.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Slf4j
@Controller
@RequestMapping()
public class HomeController {


    @PreAuthorize("hasAnyAuthority('EDIT_TRANSAKSI','VIEW_TRANSAKSI')")
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home(Authentication authentication) {
        log.info("user {}", authentication.getPrincipal());
        log.info("jenis auth {}", authentication.getClass().getSimpleName());
        log.info("user authorities {}", authentication.getAuthorities());

        return "home";
    }
}
