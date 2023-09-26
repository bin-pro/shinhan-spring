package com.example.springbootlecture.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "log")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Log {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="message")
    private String message;

    @Column(name="created_at")
    private Timestamp createdAt;
}
