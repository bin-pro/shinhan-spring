package com.example.springbootlecture.entity;

import lombok.Getter;
import javax.persistence.*;

@Entity
@Table(name = "actor")
@Getter
public class Actor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;
    @Column(name = "name") private String name;
    @ManyToOne(fetch = FetchType.LAZY) @JoinColumn(name = "movie_id") private Movie movie;
}