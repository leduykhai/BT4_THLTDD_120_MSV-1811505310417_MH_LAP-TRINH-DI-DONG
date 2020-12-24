package com.duykhai.btth4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Click extends AppCompatActivity {

    ImageView imageView,img_trove;
    TextView textView,textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_click);

        imageView = findViewById(R.id.img_anhmau_click);
        textView = findViewById(R.id.tv_tsp_click);
        textView1 = findViewById(R.id.tv_gia_click);

        img_trove = findViewById(R.id.img_back);
        img_trove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Click.this, MainActivity.class);
                startActivity(i);
            }
        });


        Bundle bundle = getIntent().getExtras();
        Integer logo = bundle.getInt("logo");
        String name = bundle.getString("name");
        String gia = bundle.getString("gia");

        imageView.setImageResource(logo);
        textView.setText(name);
        textView1.setText(gia);
    }
}