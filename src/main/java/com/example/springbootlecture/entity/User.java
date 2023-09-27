package com.example.springbootlecture.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
@Entity
@Table(name = "user")
@Builder @NoArgsConstructor @AllArgsConstructor @Getter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;
    @Column(name = "username") @NotNull
    private String username;
    @Column(name = "password") private String password;
    @Column(name = "role") private String role;

}
