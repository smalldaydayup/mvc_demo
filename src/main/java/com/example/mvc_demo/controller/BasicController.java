package com.example.mvc_demo.controller;


import com.example.mvc_demo.annotation.NeedLogin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangkun
 */
@RestController
@NeedLogin
public class BasicController {
    @NeedLogin
    @GetMapping("/hello/world")
    public String sayHelloWorld() {
        return "Hello world";
    }

    @GetMapping("/book/desc")
    public String getBookInfo() {
        return "Bell on war";
    }
}
