package com.example.springbootlecture.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;

import java.util.Map;

@Getter
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseDto {
    private Map<String, ?> payload;
    private Map<String, ?> error;
}
