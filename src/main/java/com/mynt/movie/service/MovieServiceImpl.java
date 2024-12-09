package com.mynt.movie.service;

import com.mynt.movie.model.*;
import jakarta.websocket.OnError;
import org.springframework.beans.factory.annotation.Autowired;
import com.mynt.movie.repository.MovieRepository;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.*;


@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    MovieRepository movieRepository;

    @Override
    public List<Movie> getMoviesByYearReleased(Integer yearReleased){
        List<Movie> moviesForYear = movieRepository.getMoviesByYearReleased(yearReleased);
        return moviesForYear;
    }

    @Override
    public List<Movie> getAllMoviesByOrderByYearReleased(){
        List<Movie> moviesByOrder = movieRepository.findAllMoviesByOrderByYearReleased();

        return moviesByOrder;
    }

    @Override
    public List<Movie> getMoviesByGenreAndIsSequel(List<Genre> genres, Boolean isSequel) {
//        List<Movie> movieList = new ArrayList<>();
//        List<Movie> categorizedList = new ArrayList<>();
//
//        movieRepository.findAll().forEach(movieList::add);
//
//        for (Movie movie : movieList) {
//            if (movie.getIsSequel().equals(isSequel) && movie.getGenre().containsAll(genres)) {
//                categorizedList.add(movie);
//            }
//        }
//        return categorizedList;

        return movieRepository.findMoviesByGenreAndIsSequel(genres, isSequel);
    }

    @Override
    public String getSecurity(){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        return "" + auth;
    }
}