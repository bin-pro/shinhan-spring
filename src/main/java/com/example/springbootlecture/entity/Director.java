package com.example.springbootlecture.entity;

import lombok.Getter;
import javax.persistence.*;

@Entity
@Table(name = "director") @Getter
public class Director {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;
    @Column(name = "name")
    private String name; }