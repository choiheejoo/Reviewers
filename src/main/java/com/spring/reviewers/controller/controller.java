package com.spring.reviewers.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class controller {
    @GetMapping("/")
        public String home(){return "home";}

    @GetMapping("/login")
    public String login(){return "login";}

    @GetMapping("/join")
    public String join(){
        return "join";
    }

    @GetMapping("/review")
    public String review(){
        return "review/review";
    }

    @GetMapping("/review/new")
    public String insertReview(){
        return "review/review";
    }

    @GetMapping("/communication")
    public String communication(){
        return "communication/communication";
    }

}
