package com.mynt.movie.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Entity
@Table
@Getter
@Setter

public class Movie {

    @Column //defining id as primary key
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    @Column
    public String name;

    @Column
    public Integer yearReleased;

    @Column
    public Boolean isSequel ;

    @Column
    private List<String> genre; // Store genres as a comma-separated string

    @Column
    private String castList;
}