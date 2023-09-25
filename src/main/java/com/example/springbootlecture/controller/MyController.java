package com.example.springbootlecture.controller;

import com.example.springbootlecture.config.MyConfig;
import com.example.springbootlecture.service.MyService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class MyController {

    private final MyService myService;
    private final MyConfig myConfig;

    @GetMapping("/hello")
    public String test(){
        return "hello";
    }

    @PostMapping("/hello")
    public String test2(){
        return "hello";
    }

    @PutMapping("/hello")
    public String test3(){
        return "hello";
    }

    @DeleteMapping("/hello")
    public String test4(){
        return "hello";
    }
}
