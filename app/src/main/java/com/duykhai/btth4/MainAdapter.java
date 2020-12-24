package com.duykhai.btth4;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {
    ArrayList<MainModel> mainModels;
    Context context;

    public MainAdapter(Context context,ArrayList<MainModel> mainModels){
        this.context = context;
        this.mainModels = mainModels;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_list2,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imageView.setImageResource(mainModels.get(position).getLangLogo());
        holder.textView.setText(mainModels.get(position).getLangName());
        holder.textView1.setText(mainModels.get(position).getLangGia());
        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, Click.class);
                intent.putExtra("logo",mainModels.get(position).getLangLogo());
                intent.putExtra("name",mainModels.get(position).getLangName());
                intent.putExtra("gia",mainModels.get(position).getLangGia());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mainModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView,textView1;
        LinearLayout linearLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.img_anhmau_list2);
            textView = itemView.findViewById(R.id.tv_tsp_list2);
            textView1 = itemView.findViewById(R.id.tv_gia_list2);
            linearLayout = itemView.findViewById(R.id.linear_layout);
        }
    }
}