package com.doit.androidrecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class NewAdapter extends RecyclerView.Adapter<NewAdapter.ViewHolder> {

    List<NewData.Devices> list = new ArrayList<>();

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        private TextView textView;
        private TextView textView2;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            textView = itemView.findViewById(R.id.textView);
            textView2 = itemView.findViewById(R.id.textView2);
        }

        public void setItem(NewData.Devices devices) {
            textView.setText(devices.getDeviceName());
            textView2.setText(devices.getDeviceDesc());
            Picasso.get()
                    .load(devices.getImageUrl())
                    .into(imageView);
        }
    }
    public void addItem(NewData.Devices devices){
        list.add(devices);
    }
    public void addItems(List<NewData.Devices> list){
        this.list = list;
    }

    @NonNull
    @Override
    public NewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.person_item,parent,false);


        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull NewAdapter.ViewHolder holder, int position) {
        NewData.Devices devices = list.get(position);
        holder.setItem(devices);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

}
