package com.example.grocify;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class GalleryActivity extends AppCompatActivity {
    private static final String TAG = "GalleryActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        getIncominIntent();
    }
    private void getIncominIntent(){
        if(getIntent().hasExtra("image_name") && getIntent().hasExtra("image_url")){
           String image_url = getIntent().getStringExtra("image_url") ;
           String image_name = getIntent().getStringExtra("image_name") ;
           setImage(image_url, image_name);
        }
    }
    private void setImage(String imageUrl, String image_name){
        TextView name = findViewById(R.id.image_description);
        name.setText(image_name);
        ImageView image = findViewById(R.id.image);

        Glide.with(this)
                .asBitmap()
                .load(imageUrl)
                .into(image);
    }

}
