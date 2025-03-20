package com.musabeli.apimovies.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {

    private int id;
    private String title;
    private int year;
    private String director;
    private String genre;
    private String synopsis;
}