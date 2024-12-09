package com.mynt.movie.repository;

import com.mynt.movie.model.*;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MovieRepository extends CrudRepository<Movie, Long> {

    List<Movie> getMoviesByYearReleased(Integer yearReleased);
    List<Movie> findAllMoviesByOrderByYearReleased();
    List<Movie> findMoviesByGenreAndIsSequel(List<Genre> genre, Boolean isSequel);

}
