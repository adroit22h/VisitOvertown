package com.example.android.visitovertown;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.support.v4.app.Fragment;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class Historic extends Fragment {

    public Historic() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.outdoorplaces_list, container, false);



        // Create an ArrayList of OutdoorPlaces objects
        final ArrayList<OutdoorPlaces> outdoorPlaces = new ArrayList<OutdoorPlaces>();
        outdoorPlaces.add(new OutdoorPlaces(R.drawable.blackpolice_precint, "Historic Black Police Precint Courthouse and Museum (photo credit: Mayat)", "480 nw 11 Street, Miami, FL 33136"));
        outdoorPlaces.add(new OutdoorPlaces(R.drawable.dorsey, "Dorsey Park (photo credit: miamigov.com)", "1701 NW 1st Ave, Miami, FL 33136"));
        outdoorPlaces.add(new OutdoorPlaces(R.drawable.williamspark, "Williams Park (photo credit: miamigov.com)", "1717 NW 5 Ave, Miami, FL 33136"));


        // {@link OutdoorPlacesAdapter}s. The adapter knows how to create list item views for each item
        // in the list.
        OutdoorPlacesAdapter placesAdapter = new OutdoorPlacesAdapter(getActivity(), outdoorPlaces);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) rootView.findViewById(R.id.listview_outdoors);
        listView.setAdapter(placesAdapter);

//Set a click listerner
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //get the object at a given position when the user clicked on
                switch (position){
                    case 0:
                        Intent videoClient = new Intent(Intent.ACTION_VIEW);
                        videoClient.setData (Uri.parse("https://www.youtube.com/watch?v=WpUE8YAlNak"));
                        videoClient.setClassName("com.google.android.youtube", "com.google.android.youtube.WatchActivity");
                        startActivity(videoClient);



                     //This code bring up the Youtube video; however once there..it crashes.
//                        Intent i = new Intent(Intent.ACTION_VIEW,
//                                Uri.parse("https://www.youtube.com/watch?v=WpUE8YAlNak"));
//                        startActivity(i);
                        break;


                //OutdoorPlaces OutdoorPlaces = outdoorPlaces.get(position);

                }

            };
        });
        return rootView;
    }

}



