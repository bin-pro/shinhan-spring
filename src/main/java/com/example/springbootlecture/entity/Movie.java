package com.example.springbootlecture.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "movie")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;
    @Column(name = "name") private String name;
    @Column(name = "production_year") private int productionYear;
    @OneToOne(fetch = FetchType.LAZY) @JoinColumn(name = "director_id") private Director director;
    @OneToMany(mappedBy = "movie", fetch = FetchType.LAZY)
    private List<Actor> actors;
}