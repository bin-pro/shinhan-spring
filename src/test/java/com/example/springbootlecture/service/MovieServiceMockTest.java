package com.example.springbootlecture.service;

import com.example.springbootlecture.dto.MovieDto;
import com.example.springbootlecture.dto.ResponseDto;
import com.example.springbootlecture.entity.Actor;
import com.example.springbootlecture.entity.Actor.ActorBuilder;
import com.example.springbootlecture.entity.Director;
import com.example.springbootlecture.entity.Movie;
import com.example.springbootlecture.repository.MovieRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class MovieServiceMockTest {
    @Mock
    private MovieRepository movieRepository;

    @Mock
    private LogService logService;

    @InjectMocks
    MovieService movieService;

    @BeforeAll
    public static void beforeAll(){
        System.out.println("beforeAll");
    }

    @BeforeEach
    public void beforeEach(){
        System.out.println("beforeEach");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("afterAll");
    }

    @AfterEach
    public void afterEach(){
        System.out.println("afterEach");
    }



    @Test
    @DisplayName("영화 단건조회 테스트")
    public void getMovieTest() throws Exception{
        // given
        List<Actor> actors = List.of(
                Actor.builder().name("박보검").build(),
                Actor.builder().name("송강호").build(),
                Actor.builder().name("이정재").build()
        );

        Long movieId = 12312312L;
        Movie movie = Movie.builder().name("HI").director(Director.builder().build()).actors(actors).build();

        // when
        when(movieRepository.findById(anyLong())).thenReturn(Optional.of(movie));
        //when(movieRepository.findById(anyLong())).thenReturn(null);
        // then
        MovieDto.MovieResponseDto result = movieService.getMovie(movieId);
        assertNotNull(result);
        //assertThrows(NullPointerException.class, () -> movieService.getMovie(movieId));
    }

    @Test
    public void 영화단건조회_불가_테스트(){
        // given
        Long movieId = 12312312L;
        Movie.builder().name("HI").director(Director.builder().build()).actors(List.of()).build();
        // when
        when(movieRepository.findById(anyLong())).thenReturn(null);
        // then
        assertThrows(NullPointerException.class, () -> movieService.getMovie(movieId));
    }
}
