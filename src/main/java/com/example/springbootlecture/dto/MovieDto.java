package com.example.springbootlecture.dto;

import lombok.Builder;
import lombok.Getter;

import java.sql.Timestamp;

public class MovieDto {

    @Getter
    public static class MovieCreateRequestDto {
        private String name;
        private int productionYear;
    }

    @Getter
    @Builder
    public static class MovieCreateResponseDto {
        private String name;
        private Timestamp createdAt;
    }

}
