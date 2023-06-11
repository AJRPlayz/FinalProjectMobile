package com.example.finalprojectmobile.api;

import com.example.finalprojectmobile.respons.MovieResponse;
import com.example.finalprojectmobile.respons.TVResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface APIService {
    @GET("movie/now_playing?")
    Call<MovieResponse> getMovies(@Query("api_key") String key);

    @GET("tv/popular?")
    Call<TVResponse> getTvs (@Query("api_key") String key);
}
