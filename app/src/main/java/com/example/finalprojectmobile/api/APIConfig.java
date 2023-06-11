package com.example.finalprojectmobile.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class APIConfig {

    private static String key = "a6cad5f4d5620270a09574d0fbafd3ad";

    public static APIService getApiService(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.themoviedb.org/3/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit.create(APIService.class);
    }

    public static String getKey(){
        return key;
    }
}


