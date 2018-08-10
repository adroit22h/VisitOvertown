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

public class Outdoors extends Fragment {

    public Outdoors() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.outdoorplaces_list, container, false);


        // Create an ArrayList of OutdoorPlaces objects
        final ArrayList<OutdoorPlaces> outdoorPlaces = new ArrayList<OutdoorPlaces>();
        outdoorPlaces.add(new OutdoorPlaces(R.drawable.gibson_park, "Gibson Park (photo credit: Mayat)", "401 NW 12 Street, Miami, FL 33136", "Enjoy a full-sized swimming pool year round. " +
                "while in town workout at the gym for just a $1/day. Also available a first come first serve Basketball court.  There also a restaurant outside"));
        outdoorPlaces.add(new OutdoorPlaces(R.drawable.dorsey, "Dorsey Park (photo credit: miamigov.com)", "1701 NW 1st Ave, Miami, FL 33136", "Complete your trip with an art walk along side the park and the beauty of being outdoors at the same time. " +
                "There's a playground area and an open baseball field."));
        outdoorPlaces.add(new OutdoorPlaces(R.drawable.williamspark, "Williams Park (photo credit: miamigov.com)", "1717 NW 5 Ave, Miami, FL 33136", "With tennis, basketball and swimming facilities, this is your one stop " +
                "stop for fitness and relaxation."));


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
                                Uri.parse("http://www.miamigov.com/parks/park_gibson.html"));
                        startActivity(i);
                        break;
                    case 1:
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.miamigov.com/parks/park_dorsey.html")));
                        break;
                    case 2:
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.miamigov.com/parks/park_Williams.html")));
                        break;


                }

            }

            ;
        });
        return rootView;
    }

}




