/*
package com.doit.androidrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Person;
import android.os.Bundle;

import java.time.chrono.JapaneseChronology;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // 리사이클러뷰 선언후 id 연결
        RecyclerView recyclerView = findViewById(R.id.recyclerView);


        recyclerView.setHasFixedSize(true);
        // 리니어 레이아웃매니저타입 객체 생성 생성자로 this,버티컬 ,펄스값전달
        LinearLayoutManager layoutManager = new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        LinearLayoutManager layoutManager1 = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false);

        //리사이클러뷰 셋레이아웃매니저 메서드 호출 파라미터로 레이아웃매니저 전달
        recyclerView.setLayoutManager(layoutManager1);

        // 펄슨어댑터클래스타입의 어댑터 객체생성
        PersonAdapter adapter = new PersonAdapter();


        //새로운 객체생성후 안에 아이템추가후 어댑터에 추가

*/
/*
        adapter.addItem(new Person1("ㅂ",*//*
"010"));
        adapter.addItem(new Person1("ㅅ","010"));


        // 리사이클러뷰 셋어뎁터 메서드 호출 파라미터로 어댑터 전달
        recyclerView.setAdapter(adapter);

    }
}
*/
