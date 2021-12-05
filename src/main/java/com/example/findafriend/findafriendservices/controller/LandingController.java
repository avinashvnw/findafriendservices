package com.example.findafriend.findafriendservices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hey")
public class LandingController {

    @GetMapping("/v1/welcome")
    public String welcomeMessage(){
        return "Success";
    }
}
