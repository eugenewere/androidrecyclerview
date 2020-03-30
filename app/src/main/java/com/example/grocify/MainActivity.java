package com.example.grocify;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    private ArrayList<String> mNames = new ArrayList<>();
    private  ArrayList<String> mImageUrlss = new ArrayList<>();
    private Context mContext;
    public Button mButton, mStaggeredBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton = findViewById(R.id.nextbutton);
        mStaggeredBtn = findViewById(R.id.staggerdlayoutbtn);
        mStaggeredBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToStaggerdLayout();
            }
        });
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToNextLayout();
            }
        });
        initImageBitmaps();
    }

    private void goToStaggerdLayout() {
        Intent i = new Intent(MainActivity.this, StaggeredActivity.class);
        startActivity(i);
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
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(mNames, mImageUrlss, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
    private void goToNextLayout(){
        Intent i = new Intent(MainActivity.this, HorizontalRecyclerView.class);
        startActivity(i);
    }
}
