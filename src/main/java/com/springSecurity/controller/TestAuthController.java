package com.springSecurity.controller;


import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@PreAuthorize("denyAll()")
public class TestAuthController {

    @GetMapping("/hello")
    @PreAuthorize("permitAll()")
    public String hello(){
        return "Hello Word";
    }

    @PreAuthorize("hasAuthority('READ')")
    @GetMapping("/hello-secured")
    public String helloSecured(){
        return "Hello world Secured";
    }

    @GetMapping("/hello-secured2")
    public String helloSecured2(){
        return "Hello world Secured";
    }

}
