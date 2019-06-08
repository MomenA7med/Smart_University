package com.example.momen.smart_university.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.momen.smart_university.fragment.Mon;
import com.example.momen.smart_university.fragment.Sun;
import com.example.momen.smart_university.fragment.Thurs;
import com.example.momen.smart_university.fragment.Tues;
import com.example.momen.smart_university.fragment.Wed;

public class PageAdapter extends FragmentPagerAdapter {
    private   int numoftab;
    public PageAdapter(FragmentManager fm,int numoftab ) {
        super(fm);

        this.numoftab=numoftab;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new Sun();


            case 1:
                return new Mon();
            case 2:
                return new Tues();
            case 3:
                return new Thurs();
            case 4:
                return new Wed();
            default:
                return null;
        }
    }
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "sun";
            case 1:
                return "Mon";
            case 2:
                return "Tues";
            case 3:
                return "Thurs" ;
            case 4:
                return "Wed";


        }
        return "";
    }
    @Override
    public int getCount() {
        return numoftab;
    }
}
