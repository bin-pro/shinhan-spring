package com.example.springbootlecture.config;

import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI swagger(){
        return new OpenAPI().info(
                new io.swagger.v3.oas.models.info.Info()
                        .title("Spring Boot Lecture")
                        .description("Spring Boot 강의를 위한 API 문서입니다.")
                        .version("v1.0.0")
        );
    }
}
