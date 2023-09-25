package com.example.springbootlecture.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name="MovieController입니다")
@RequestMapping("/api")
@RestController
public class MovieController {
    @Deprecated(since = "2021-07-01", forRemoval = true)
    @GetMapping("/v1/movies")
    public List<String> get(){
        return List.of("test");
    }
    @GetMapping("/v2/movies")
    public List<String> gets(){
        return List.of("test");
    }

    @GetMapping("/v1/movies/{movieId}")
    public String get(
            @RequestParam(value = "v", required = false) Integer v,
            @PathVariable("movieId") Long movieId
    ){

        return String.valueOf(movieId + " " + v);
    }
    @PostMapping("/v1/movies")
    public void create(){
    }

    @PutMapping("/v1/put")
    public void put(){
    }

    @DeleteMapping("/api/v1/del")
    public void del(){
    }
}
