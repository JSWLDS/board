package com.example.board.domain.dto;

import com.example.board.domain.entity.BaseTimeEntity;
import groovyjarjarantlr4.v4.runtime.misc.NotNull;
import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;

@Entity
@Table(name = "member")
@Data
public class Member{

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @Column(name="id")
    private Long id;

    @NotNull
    @Column(name = "username")
    private String username;


    @NotNull
    @Column(name = "password")
    private String password;

    @NotNull
    @Column(name="name")
    private String name;

    @NotNull
    @Column(name="email")
    private String email;

}
