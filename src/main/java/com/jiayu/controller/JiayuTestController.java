package com.jiayu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/test")
public class JiayuTestController {
    @GetMapping("/sayHello")
    public String sayHello() {
        return "hello";
    }
}
