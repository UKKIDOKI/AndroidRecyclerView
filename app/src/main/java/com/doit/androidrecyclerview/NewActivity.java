package com.doit.androidrecyclerview;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class NewActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvSetting();
        rvDataSetting();
    }

    private void rvSetting() {
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
    }

    private void rvDataSetting() {
        final NewAdapter adapter = new NewAdapter();

        ApiService apiService = ApiService.retrofit.create(ApiService.class);
        Call<NewData> call = apiService.repoContributors("체성분 측정기","체성분 측정 장치");
        call.enqueue(new Callback<NewData>() {
            @Override
            public void onResponse(Call<NewData> call, Response<NewData> response) {
                NewData data = response.body();
                Log.e(TAG, data.getDevices().toString());
                adapter.addItems(data.getDevices());
                recyclerView.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<NewData> call, Throwable t) {
                Log.e(TAG, "request Error");
            }
        });

    }
}
