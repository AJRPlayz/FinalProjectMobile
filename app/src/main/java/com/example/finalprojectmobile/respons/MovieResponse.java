package com.example.finalprojectmobile.respons;

import com.example.finalprojectmobile.model.MovieModel;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MovieResponse {
    @SerializedName("results")
    private final List<MovieModel> movies;

    public MovieResponse(List<MovieModel> movies) {
        this.movies = movies;
    }

    public List<MovieModel> getMovies() {
        return movies;
    }
}
