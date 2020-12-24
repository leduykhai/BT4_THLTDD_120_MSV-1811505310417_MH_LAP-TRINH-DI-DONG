package com.duykhai.btth4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ViewFlipper;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ViewFlipper viewFlipper;
    RecyclerView recyclerView_list, recyclerView_list2;
    MyAdapter myAdapter;
    ArrayList<MainModel> mainModels;
    MainAdapter mainAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView_list2 = findViewById(R.id.recyclerview_list2);
        Integer[] langLogo = {R.drawable.sach,R.drawable.ao,R.drawable.quan,R.drawable.giay,
                R.drawable.sach,R.drawable.balo,R.drawable.quan};

        String[] langName = {"Mắt Biếc...","Áo Da Trơn...","Quần Thời Trang...","Giày Thể Thao...",
                "Tắt Đèn...","Balo Thời Trang...","Quần Jocker..."};

        String[] langGia = {"100.000VNĐ","240.000VNĐ","410.000VNĐ","620.000VNĐ",
                "210.000VNĐ","150.000VNĐ","200.000VNĐ"};

        mainModels = new ArrayList<>();
        for (int i=0;i<langLogo.length;i++){
            MainModel model = new MainModel(langLogo[i],langName[i],langGia[i]);
            mainModels.add(model);
        }

        LinearLayoutManager layoutManager = new LinearLayoutManager(
                MainActivity.this,LinearLayoutManager.HORIZONTAL,false
        );
        recyclerView_list2.setLayoutManager(layoutManager);
        recyclerView_list2.setItemAnimator(new DefaultItemAnimator());
        mainAdapter = new MainAdapter(MainActivity.this,mainModels);
        recyclerView_list2.setAdapter(mainAdapter);


        recyclerView_list = findViewById(R.id.recyclerview_list);
        recyclerView_list.setLayoutManager(new LinearLayoutManager(this));
        myAdapter = new MyAdapter(this, getMyList());
        recyclerView_list.setAdapter(myAdapter);

        int[] image_1 = {R.drawable.km1, R.drawable.km2, R.drawable.km3};
        viewFlipper = findViewById(R.id.flip);

        for (int image: image_1){
            flipImage(image);
        }
    }

    public void flipImage(int image_1){
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image_1);
        viewFlipper.addView(imageView);
        viewFlipper.setFlipInterval(2500);
        viewFlipper.setAutoStart(true);
        viewFlipper.setInAnimation(this, android.R.anim.slide_in_left);
    }

    private ArrayList<Model> getMyList(){

        ArrayList<Model> models = new ArrayList<>();
        Model m = new Model();
        m.setImg_anhmau_list(R.drawable.balo);
        m.setTv_tsp_list("Balo B12...");
        m.setTv_ts_list("Shop Đà Nẵng");
        m.setBt_mua_list("Mua");
        models.add(m);

        m = new Model();
        m.setImg_anhmau_list(R.drawable.ao);
        m.setTv_tsp_list("Áo Da ...");
        m.setTv_ts_list("Shop Hồ Chí Minh");
        m.setBt_mua_list("Mua");
        models.add(m);

        m = new Model();
        m.setImg_anhmau_list(R.drawable.quan);
        m.setTv_tsp_list("Quần jean ...");
        m.setTv_ts_list("Shop Đà Lạt");
        m.setBt_mua_list("Mua");
        models.add(m);

        m = new Model();
        m.setImg_anhmau_list(R.drawable.sach);
        m.setTv_tsp_list("Sách Mắt Biếc...");
        m.setTv_ts_list("Shop Hà Nội");
        m.setBt_mua_list("Mua");
        models.add(m);

        m = new Model();
        m.setImg_anhmau_list(R.drawable.giay);
        m.setTv_tsp_list("Giày Thể Thao...");
        m.setTv_ts_list("Shop Nước Ngoài");
        m.setBt_mua_list("Mua");
        models.add(m);

        return models;
    }
}