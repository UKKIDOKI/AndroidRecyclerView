package com.doit.androidrecyclerview;

import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class TestActivity extends AppCompatActivity {
    final String I = "https://senior.bucheon.go.kr";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Retrofit retrofit = new Retrofit.Builder()
                //.baseUrl("https://senior.bucheon.go.kr")
                .baseUrl(I)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        //Data data = retrofit.create(Data.class);
        ApiService apiService = retrofit.create(ApiService.class);
        Call<List<Data>> call = apiService.getData();
        call.enqueue(new Callback<List<Data>>() {
            @Override
            public void onResponse(Call<List<Data>> call, Response<List<Data>> response) {

            }

            @Override
            public void onFailure(Call<List<Data>> call, Throwable t) {

            }
        });

    }
}