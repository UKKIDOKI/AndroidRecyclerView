package com.doit.androidrecyclerview;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiService {
    @GET("/bucheon-api/api/pub/v1/bt-devices")
    Call<NewData> repoContributors(
            @Query("deviceName") String deviceName,
            @Query("deviceDesc") String deviceDesc

    );

    public static final Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://senior.bucheon.go.kr")
            .addConverterFactory(GsonConverterFactory.create())
            .build();
}



