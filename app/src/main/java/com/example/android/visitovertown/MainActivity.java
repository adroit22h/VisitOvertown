package com.example.android.visitovertown;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


public class MainActivity extends AppCompatActivity {
    //for c
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //testing recylcler view



        //set the activity content
        setContentView(R.layout.activity_main);

        //locates the viewpager that allows the user move from screen to screen
        ViewPager viewPager = findViewById(R.id.vpPager);

        //Creates an adapter tha knows which fragment to show on what page
        PagerAdapter adapter = new PagerAdapter(this, getSupportFragmentManager());

        //Puts the adapter on the ViewPager
        viewPager.setAdapter(adapter);

        //Locates the tabLayout to show the tabs
        TabLayout tabLayout = findViewById(R.id.tabLayout);

        //Updates the tab layout when swiped
        tabLayout.setupWithViewPager(viewPager);
    }


}

