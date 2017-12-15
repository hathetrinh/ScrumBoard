package com.trinhha.scrumboard.scrumboardserver.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @RequestMapping("api/hello")
    public String getGreeting() {
        return "HELLO THE WORLD!";
    }
}
