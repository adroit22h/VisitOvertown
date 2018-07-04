package com.example.android.visitovertown;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {
    int aQuantityTabs;
    public PagerAdapter(FragmentManager fm, int NumberOfTabs){
        super (fm);
        this.aQuantityTabs = NumberOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:
                Historic historic = new Historic();
                return historic;
            case 1:
                Outdoors outdoors = new Outdoors();
                return outdoors;
            case 2:
                Food food = new Food();
                return food;
            case 3:
                Events events = new Events();
                return events;
            case 4:
                GettingAround gettingAround = new GettingAround();
                return gettingAround;
            case 5:
                Resources resources=new Resources();
                return resources;

                default:
                    return null;

        }

    }

    @Override
    public int getCount() {
        return aQuantityTabs;
    }
}
