package com.example.springbootlecture.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "actor")
@Getter @Builder @NoArgsConstructor @AllArgsConstructor
public class Actor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;
    @Column(name = "name") private String name;
    @ManyToOne(fetch = FetchType.LAZY) @JoinColumn(name = "movie_id") private Movie movie;
}