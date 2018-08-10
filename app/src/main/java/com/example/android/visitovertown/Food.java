package com.example.android.visitovertown;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

//This food page highlights two local restaurant in Overtown.

public class Food extends Fragment {
    public Food() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.outdoorplaces_list, container, false);

        // Create an ArrayList of OutdoorPlaces objects
        final ArrayList<OutdoorPlaces> outdoorPlaces = new ArrayList<OutdoorPlaces>();
        outdoorPlaces.add(new OutdoorPlaces(R.drawable.jackson_soul_food, "Jackson Soul Food (photo credit:https://www.facebook.com/JacksonSoulFood950/)",
                "950 nw 3nd Avenue, Miami, FL 33136", "Experience the soul food at Jackson dating back to 1946. " +
                "delicious soul food, if you're visiting definitely stop here."));
        outdoorPlaces.add(new OutdoorPlaces(R.drawable.lil_green_house_grill, "Lil Greenhouse Grill (photo credit: http://places.singleplatform.com/lil-greenhouse-grill/menu)",
                "480 NW 11 Street, Miami, FL 33162", "From a food truck to brick and motor, the meals are simply amazing " +
                "coupled with a wonderful selection of craft beer and fine wines."));

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
                //get the detail page of a card when the user clicks on it
                switch (position) {
                    case 0:
                        Intent i = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.jacksonsoulfood.com/"));
                        startActivity(i);
                        break;
                    case 1:
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.lilgreenhousegrill.com/")));
                        break;

                }

            }

            ;
        });
        return rootView;
    }

}