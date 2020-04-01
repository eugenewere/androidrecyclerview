package com.example.grocify;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;

import com.example.Model.Hat;
import com.example.resources.Hats;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class SwipeViewPager extends AppCompatActivity {
    private ViewPager mViewPagger ;
    private TabLayout mTabLaout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swipe_view_pager);
        mViewPagger = findViewById(R.id.view_pager);
        mTabLaout = findViewById(R.id.tablayout);
        init();
    }

    private void init() {
        ArrayList<Fragment> fragments = new ArrayList<>();
        Hat[] hats = Hats.getHats();
        for (Hat hat: hats){

            ViewPagerItemFragment fragment = ViewPagerItemFragment.getInstance(hat);
            fragments.add(fragment);
        }
        MyPAggerAdapter pAggerAdapter = new MyPAggerAdapter(getSupportFragmentManager(), fragments) ;
        mViewPagger.setAdapter(pAggerAdapter);
        mTabLaout.setupWithViewPager(mViewPagger, true);
    }
}
