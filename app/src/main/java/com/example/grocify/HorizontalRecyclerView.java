package com.example.grocify;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class HorizontalRecyclerView extends AppCompatActivity {
    private ArrayList<String> mNames = new ArrayList<>();
    private  ArrayList<String> mImageUrlss = new ArrayList<>();
    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainactivityfile);
        initImageBitmaps();
    }
    private void initImageBitmaps(){
        mImageUrlss.add("https://zdnet2.cbsistatic.com/hub/i/2020/03/09/53a31682-ecaa-48df-9fd5-f4527f73ea11/brave.png");
        mNames.add("Eugene");

        mImageUrlss.add("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcR53CBhvZAV7TLh3Wiic2FACtcM8IJ4Q9_3UlpzAopeK8SEGKvq");
        mNames.add("were");

        mImageUrlss.add("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcTYJpFVcJI4Ez5WLpeFOu57dGF7MONyuiHaGxyZvt4O1I02hSWR");
        mNames.add("angolo");

        mImageUrlss.add("https://pbs.twimg.com/profile_images/378800000636806304/5b032055504cd08a4c07979589d0710d_400x400.png");
        mNames.add("is");

        mImageUrlss.add("https://zdnet2.cbsistatic.com/hub/i/2020/03/09/53a31682-ecaa-48df-9fd5-f4527f73ea11/brave.png");
        mNames.add("comimng");

        mImageUrlss.add("https://zdnet2.cbsistatic.com/hub/i/2020/03/09/53a31682-ecaa-48df-9fd5-f4527f73ea11/brave.png");
        mNames.add("home");

        mImageUrlss.add("https://zdnet2.cbsistatic.com/hub/i/2020/03/09/53a31682-ecaa-48df-9fd5-f4527f73ea11/brave.png");
        mNames.add("todya");

        initRecyclerView();


    }
    private void initRecyclerView(){
        LinearLayoutManager layoutmanager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false);
        RecyclerView rec = findViewById(R.id.recycler_view_horizontal);
        rec.setLayoutManager(layoutmanager);
        HorizonatalRecyclerViewAdapter adapter = new HorizonatalRecyclerViewAdapter(this, mNames, mImageUrlss);
        rec.setAdapter( adapter);

    }
}
