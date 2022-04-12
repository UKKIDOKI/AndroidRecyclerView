package com.doit.androidrecyclerview;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiService {
    @GET("/bucheon-api/api/pub/v1/bt-devices")
    Call<List<Data>> getData();


}


