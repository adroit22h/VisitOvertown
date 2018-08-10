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

    //This page highlights some historic places in Overtown.

    public Historic() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.outdoorplaces_list, container, false);

        // Create an ArrayList of OutdoorPlaces objects
        final ArrayList<OutdoorPlaces> outdoorPlaces = new ArrayList<OutdoorPlaces>();
        outdoorPlaces.add(new OutdoorPlaces(R.drawable.lyric_theatre, "Lyric Theatre (photo credit:http://amusements-parks.com/Florida/Miami/Black_Archives__Historic_Lyric_Theater)",
                "819 nw 2nd Avenue, Miami, FL 33136", "This theatre has been a major entertainment center for black in Miami since 1913. " +
                "Registered as a U.S. National Register of Historic Places since 1989. It features high quality performances in its 400 seat theatre and multifacet facility."));
        outdoorPlaces.add(new OutdoorPlaces(R.drawable.blackpolice_precint, "Black Police Precint and Courthouse Museum (photo credit: https://historicalblackprecinct.org/#)",
                "480 NW 11 Street, Miami, FL 33162", "Explore the first African American police officers in the City of Miami as they served during pre-Civil Rights eras of 1940s,50s, and 60s." +
                "Getting married, checkout the Ball & Chain Wedding for a quick and frugal wedding in the courthouse or a drive-through ceremony."));

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
                                Uri.parse("https://www.bahlt.org/"));
                        startActivity(i);
                        break;
                    case 1:
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://historicalblackprecinct.org/")));
                        break;

                }

            }

            ;
        });
        return rootView;
    }

}

