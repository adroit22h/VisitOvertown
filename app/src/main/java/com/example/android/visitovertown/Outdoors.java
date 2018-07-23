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

import java.util.ArrayList;
import java.util.zip.Inflater;

public class Outdoors extends Fragment {

    public Outdoors() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.outdoorplaces_list, container, false);


        /** TODO: Insert all the code from the NumberActivity’s onCreate() method after the setContentView method call */

        //return rootView;

        // Create an ArrayList of OutdoorPlaces objects
        final ArrayList<OutdoorPlaces> outdoorPlaces = new ArrayList<OutdoorPlaces>();
        outdoorPlaces.add(new OutdoorPlaces(R.drawable.google_map_overtown, "Map of Overtown", "123 West Main St, Miami, FL 33136"));
        outdoorPlaces.add(new OutdoorPlaces(R.drawable.miami_overtown_3rd_ave, "Pictures of Overtown", "452 Happy Cow Road, Miami, FL 33132"));

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
                OutdoorPlaces OutdoorPlaces = outdoorPlaces.get(position);
            }
        });



        return rootView;
    }
}



//Set a click listener
//   listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//         @Override
//           public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

//get the name
//                String title = outdoorPlaces.getmOutdoorPlaceName();
//                get the image
//                int imageResourceID= outdoorPlaces.getmImageResource();
//
//                String firstParagraph= outdoorPlaces.getmDescription();
//
//                //Intent outdoorPlacesDetail = new Intent(getActivity())


