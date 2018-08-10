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
//This is the event page.  It list some events happening in Overtown.

public class Events extends Fragment {
    public Events() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.outdoorplaces_list, container, false);


        // Create an ArrayList of OutdoorPlaces objects
        final ArrayList<OutdoorPlaces> outdoorPlaces = new ArrayList<OutdoorPlaces>();
        outdoorPlaces.add(new OutdoorPlaces(R.drawable.lyric_live_event, "Lyric Live (Photo Credit:  https://www.bahlt.org/events)",
                "819 nw 2nd Avenue, Miami, FL 33136", "Happens every first Friday of the month. " +
                "It is an interactive talent showcase. Features a comedian, live band, DJ and a chance to go home with $500!"));
        outdoorPlaces.add(new OutdoorPlaces(R.drawable.folklife_friday_flyer, "Folklife Friday (Photo Credit: http://www.bloggingblackmiami.com)",
                "9th Street and 2nd Avenue", "Want to enjoy the best local food? From fried conch fritters, barbecue ribs, jamaican jerk " +
                "chicken to soul food. You don't want to miss this monthly festival, happening the first Friday of every month."));


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
                                Uri.parse("https://www.bahlt.org/events"));
                        startActivity(i);
                        break;
                    case 1:
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://experienceovertown.com/event/folklife/")));
                        break;

                }

            }

            ;
        });
        return rootView;
    }

}
