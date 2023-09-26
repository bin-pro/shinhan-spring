package com.example.springbootlecture.repository;

import com.example.springbootlecture.entity.Log;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LogRepository extends JpaRepository<Log, Long> {
}
