package com.example.android.visitovertown;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {
    private Context mContext;

    public PagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                Home home = new Home();
                return home;
            case 1:
                Historic historic = new Historic();
                return historic;
            case 2:
                Outdoors outdoors = new Outdoors();
                return outdoors;
            case 3:
                Food food = new Food();
                return food;
            case 4:
                Events events = new Events();
                return events;
            case 5:
                GettingAround gettingAround = new GettingAround();
                return gettingAround;
            case 6:
                Resources resources = new Resources();
                return resources;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 7;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "home";
            case 1:
                return "historic";
            case 2:
                return "Outdoors";
            case 3:
                return "Food";
            case 4:
                return "Events";
            case 5:
                return "Getting Around";
            case 6:
                return "Resources";
            default:
                return null;

        }
    }
}




