package com.duykhai.btth4;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyHolder extends RecyclerView.ViewHolder{

    ImageView img_anhmau_list;
    TextView tv_tsp_list, tv_ts_list;
    Button bt_mua_list;

    public MyHolder(@NonNull View itemView) {
        super(itemView);

        this.img_anhmau_list = itemView.findViewById(R.id.img_anhmau_list);
        this.tv_tsp_list = itemView.findViewById(R.id.tv_tsp_list);
        this.tv_ts_list = itemView.findViewById(R.id.tv_ts_list);
        this.bt_mua_list = itemView.findViewById(R.id.bt_mua_list);
    }
}
