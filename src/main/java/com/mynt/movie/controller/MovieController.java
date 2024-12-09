package com.mynt.movie.controller;

import com.mynt.movie.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.mynt.movie.service.MovieService;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
public class MovieController {

    @Autowired
    MovieService movieService;

    @GetMapping("/movie/{yearReleased}")
    public List<Movie> getMoviesByYearReleased(@PathVariable Integer yearReleased){
        return movieService.getMoviesByYearReleased(yearReleased);
    }


    @GetMapping("/movie")
    public List<Movie> getAllMovieByOrderByYearReleased(){
        return movieService.getAllMoviesByOrderByYearReleased();
    }

    @GetMapping("/movie/GenreAndIsSequel")
    public List<Movie> getMoviesByGenreAndIsSequel(@RequestParam List<Genre> genres, @RequestParam Boolean isSequel) {
        return movieService.getMoviesByGenreAndIsSequel(genres, isSequel);
    }
}