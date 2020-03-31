package com.example.grocify;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

public class MyPAggerAdapter extends FragmentStatePagerAdapter {
    private ArrayList<Fragment> mFr = new ArrayList<>();


    public MyPAggerAdapter(@NonNull FragmentManager fm , ArrayList<Fragment> Frg) {
        super(fm);
        mFr = Frg;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return mFr.get(position);
    }

    @Override
    public int getCount() {
        return mFr.size();
    }
}
