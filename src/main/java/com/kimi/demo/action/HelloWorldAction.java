package com.kimi.demo.action;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldAction {

    @RequestMapping("/")
    public String hello() {
        return "hello world!";
    }
}
