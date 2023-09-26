package com.example.springbootlecture.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.example.springbootlecture.dto.MovieDto;
import com.example.springbootlecture.dto.ResponseDto;
import com.example.springbootlecture.service.MovieService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Tag(name="MovieController입니다")
@RequestMapping("/api")
@RestController
@RequiredArgsConstructor
public class MovieController {
    private final ObjectMapper objectMapper;
    private final MovieService movieService;
    @PostMapping("/v1/movies")
    public ResponseEntity<ResponseDto> createMovie(@RequestBody MovieDto.MovieCreateRequestDto movieCreateRequestDto){

        MovieDto.MovieCreateResponseDto movieCreateResponseDto;
        try {
            movieCreateResponseDto = movieService.createMovie(movieCreateRequestDto);

            ResponseDto responseDto = ResponseDto.builder().payload(
                    objectMapper.convertValue(movieCreateResponseDto, Map.class)).build();

            return ResponseEntity.status(HttpStatus.CREATED).body(responseDto);

        }catch(Exception e){
            String errorMessage = String.valueOf(e.getMessage());
            ResponseDto responseDto = ResponseDto.builder().error(Map.of("error", errorMessage)).build();

            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(responseDto);
        }
    }
}
