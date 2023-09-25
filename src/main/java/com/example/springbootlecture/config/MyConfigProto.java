package com.example.springbootlecture.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@Component
public class MyConfigProto {
    @Bean
    public void config(){};
}
