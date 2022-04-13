/*
package com.doit.androidrecyclerview;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

// 데이터를 가져와 리사이클러뷰에 뿌려줄 어댑터클래스 생성
// 리사이클러뷰 어댑터와 뷰홀더를 상속
public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.ViewHolder> {

    // 갖고 온 데이터를 담아줄 items arraylist를 생성
   ArrayList<Person1> items = new ArrayList<Person1>();  // Person1클래스의 데이터를 ArrayList에 담기

    public PersonAdapter(ArrayList<Person1> items) {
        this.items = items;
    }

    public PersonAdapter() {

    }
// 뷰홀더 객체가 만들어질때 자동호출 각 아이템을 위해 정의된 xml레이아웃을 이용해 뷰 객체를 만들어줌 그리고 뷰객체를 새로만든 뷰홀더 객체에 담아 반환
    // 뷰타입을 위한 정수값이 파라미터로 전달됨

    // 뷰홀더를 사용할때 필요한 필수메서드 생성

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) { // 뷰홀더를 생성
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.person_item,parent,false);

        return new ViewHolder(view);  // 새로운 뷰홀더 객체를 생성과 동시에 파라미터로 아이템뷰를 넘겨줌

        //LayoutInflater inflater = LayoutInflater.from(parent.getContext()); //레이아웃을 객체화할수있게 인플레이터 객체를 선언후 컨텍스트를 호출
        // View itemView = inflater.inflate(R.layout.person_item, parent, false); //xml파일을 객체로만들수있게해줌
    }


    // 뷰홀더가 재사용될때 호출되며 뷰객체는 기존것을 그대로 사용하고 데이터만 바꿔줌
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {  // 리사이클러뷰를 재사용하기위해 사용되는 메서드
        Person1 item = items.get(position);// 사용할 데이터클래스타입의 변수를 생성후안에 재사용될 arraylist를 가져옴

        holder.setItems(item);  //파라미터로 가져온 데이터에 재사용될 뷰홀더를 셋
    }





    // 리사이클러뷰에서 어댑터가 관리하는 아이템의 개수를 확인하는 메서드
    @Override
    public int getItemCount() {  // 리사이클러뷰에서 어댑터가 관리하는 아이템의 개수를 확인하는 메서드
        return items.size();                // arraylist의 길이를 인트타입으로 돌려줌
    }


    public void addItem(Person1 item) {               // 데이터를 가져와 arraylist에 저장할 메서드
        items.add(item);         //list안에 가져온 파라미터  추가
    }


    // 뷰홀더 클래스 생성 후 리사이클러뷰상속
    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView; //사용할 텍스트뷰 변수 선언
        TextView textView2;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.textView);   //받아온 아이템뷰 객체에 들어있는 name텍스트뷰를 변수에 연결,참조하기
            textView2 = itemView.findViewById(R.id.textView2);  //받아온 아이템뷰 객체에 들어있는 number텍스트뷰를 변수에 연결,참조하기

        }


        public void setItems(Person1 item) {                         // 뷰홀더에 들어있는 뷰객체를 텍스트뷰와 연결
            textView.setText(item.getName()); // 뷰홀더안의 이름을 연결
            textView2.setText(item.getMobile()); // 뷰홀더안의 번호를 연결

        }
    }

}
*/
