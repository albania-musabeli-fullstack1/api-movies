package com.musabeli.apimovies.controllers;

import com.musabeli.apimovies.models.Movie;
import com.musabeli.apimovies.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController {

    // Inyección de dependencias (servicio)
    @Autowired
    private MovieService movieService;

    @GetMapping("/movies/getAllMovies")
    public List<Movie> getAllMovies(){
        return this.movieService.getAllMovies();
    }
}
