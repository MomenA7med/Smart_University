package com.example.momen.smart_university.Adapter;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.momen.smart_university.fragment.Students;

/**
 * Created by Momen on 3/18/2019.
 */

public class AdminPageAdapter extends FragmentPagerAdapter {
    private int numOfTab;
    public AdminPageAdapter(FragmentManager fm,int numOfTab) {
        super(fm);
        this.numOfTab = numOfTab;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0 :
                return new Students();
            case 1:
                return new Students();
            case 2:
                return new Students();
            default:
                return null;
        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0 :
                return "Students";
            case 1:
                return "Doctors";
            case 2:
                return "Table";
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numOfTab;
    }
}