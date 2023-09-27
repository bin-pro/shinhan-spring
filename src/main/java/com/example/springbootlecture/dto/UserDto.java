package com.example.springbootlecture.dto;

import lombok.Data;

public class UserDto {
    @Data
    public static class UserJoinRequestDto{
        String username;
        String password;
        String role;
    }
}
