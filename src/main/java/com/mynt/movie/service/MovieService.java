package com.mynt.movie.service;

import com.mynt.movie.model.*;
import org.springframework.security.access.prepost.PreAuthorize;

import java.util.List;

public interface MovieService {
    List<Movie> getMoviesByYearReleased(Integer yearReleased);
    List<Movie> getAllMoviesByOrderByYearReleased();
    List<Movie> getMoviesByGenreAndIsSequel(List<Genre> genre, Boolean isSequel);

//    @PreAuthorize("isAuthenicated()")
    @PreAuthorize("hasAnyRole('USER')")
    String getSecurity();
}
