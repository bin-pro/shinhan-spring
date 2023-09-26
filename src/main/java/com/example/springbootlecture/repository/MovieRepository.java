package com.example.springbootlecture.repository;

import com.example.springbootlecture.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MovieRepository extends JpaRepository<Movie, Long> {
}
