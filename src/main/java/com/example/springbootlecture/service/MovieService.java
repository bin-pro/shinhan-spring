package com.example.springbootlecture.service;

import com.example.springbootlecture.dto.MovieDto;
import com.example.springbootlecture.dto.ResponseDto;
import com.example.springbootlecture.entity.Log;
import com.example.springbootlecture.repository.MovieRepository;
import com.example.springbootlecture.entity.Movie;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.springbootlecture.repository.LogRepository;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Map;

import static java.lang.String.valueOf;

@Service
@Slf4j
@RequiredArgsConstructor
public class MovieService {
    private final MovieRepository movieRepository;
    private final LogRepository logRepository;

    @Transactional
    public MovieDto.MovieCreateResponseDto createMovie(MovieDto.MovieCreateRequestDto movieCreateRequestDto){
        try {
            Movie movie = Movie.builder()
                    .name(movieCreateRequestDto.getName())
                    .productionYear(movieCreateRequestDto.getProductionYear())
                    .build();

            movieRepository.save(movie);

        }catch (Exception e){
            String errorMessage = valueOf(e.getMessage());
            log.error("영화 등록 중 오류가 발생했습니다. : {}", e.getMessage());

            Log log = Log.builder()
                    .message("영화 등록 중 오류가 발생했습니다. : " + errorMessage)
                    .createdAt(Timestamp.valueOf(LocalDateTime.now()))
                    .build();

            logRepository.save(log);
            throw e;
        }
        Log log = Log.builder()
                .message("영화가 등록되었습니다.")
                .createdAt(Timestamp.valueOf(LocalDateTime.now()))
                .build();
        logRepository.save(log);

        ResponseDto.builder()
                .payload(Map.of("message", "영화가 등록되었습니다."))
                .build();

        return MovieDto.MovieCreateResponseDto.builder()
                .name(movieCreateRequestDto.getName())
                .createdAt(Timestamp.valueOf(LocalDateTime.now()))
                .build();
    }
}
