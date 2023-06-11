package com.example.finalprojectmobile.respons;

import com.example.finalprojectmobile.model.TVShowModel;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TVResponse {
    @SerializedName("results")
    private final List<TVShowModel> movies;

    public TVResponse(List<TVShowModel> movies) {
        this.movies = movies;
    }

    public List<TVShowModel> getTvs() {
        return movies;
    }
}
