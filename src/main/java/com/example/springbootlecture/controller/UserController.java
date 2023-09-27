package com.example.springbootlecture.controller;

import com.example.springbootlecture.dto.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.springbootlecture.service.UserService;
@RestController
@RequiredArgsConstructor
public class UserController{

    private final UserService userService;

    @PostMapping("/join")
    public void joinUser(@RequestBody UserDto.UserJoinRequestDto userJoinRequestDto){
        userService.joinUser(userJoinRequestDto);
    }
    @GetMapping("/home")
    public String home(){
        return "home";
    }

    @GetMapping("/admin")
    public String admin(){
        return "admin";
    }

    @GetMapping("/manager")
    public String manager(){
        return "manager";
    }

}
