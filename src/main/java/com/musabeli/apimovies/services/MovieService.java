package com.musabeli.apimovies.services;

import com.musabeli.apimovies.models.Movie;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieService {

    private List<Movie> movieList = new ArrayList<>();

    //constructor
    public MovieService(){
        this.addMovie(new Movie(1, "Titanic", 1997, "James Cameron", "Romance", "Historia de amor previa al hundimiento del Titanic"));
        this.addMovie(new Movie(2, "Volver al Futuro", 1985, "Robert Zemeckis", "Ciencia Ficción", "Marty McFly viaja al pasado en un DeLorean"));
        this.addMovie(new Movie(3, "Terminator 2", 1991, "James Cameron", "Ciencia Ficción", "El T-1000 viaja al pasado para salvar a John Connor"));
        this.addMovie(new Movie(4, "Jurassic Park", 1993, "Steven Spielberg", "Ciencia Ficción", "John Hammon crea un parque con dinosaurios"));
        this.addMovie(new Movie(5, "The Matrix", 1999, "Lana y Lily Wachowski", "Ciencia Ficción", "Thomas Anderson/Neo descubre que vive en una simulación digital llamada Matrix"));
    }

    private void addMovie(Movie movie){
        this.movieList.add(movie);
    }

    public List<Movie> getAllMovies(){
        return this.movieList;
    }

    public Movie getMovieById(int id){
        for (Movie movie : this.movieList){
            if (movie.getId() == id){
                return movie;
            }
        }
        return null;
    }

}
