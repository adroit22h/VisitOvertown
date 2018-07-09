package com.example.android.visitovertown;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class outdoorsActivity extends AppCompatActivity {


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.fragment_outdoors);
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.listview_outdoors, new Outdoors())
                    .commit();
        }
    }


}
//
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//      super.onCreate(savedInstanceState);
//      setContentView(R.layout.activity_outdoors);
//
//
//        // Create an ArrayList of OutdoorPlaces objects
//        ArrayList<OutdoorPlaces> outdoorPlaces = new ArrayList<OutdoorPlaces>();
//        outdoorPlaces.add(new OutdoorPlaces(R.drawable.google_map_overtown, "Map of Overtown", "123 West Main St, Miami, fL 33136"));

//        androidFlavors.add(new AndroidFlavor("Donut", "1.6", R.drawable.donut));
//        androidFlavors.add(new AndroidFlavor("Eclair", "2.0-2.1", R.drawable.eclair));
//        androidFlavors.add(new AndroidFlavor("Froyo", "2.2-2.2.3", R.drawable.froyo));
//        androidFlavors.add(new AndroidFlavor("GingerBread", "2.3-2.3.7", R.drawable.gingerbread));
//        androidFlavors.add(new AndroidFlavor("Honeycomb", "3.0-3.2.6", R.drawable.honeycomb));
//        androidFlavors.add(new AndroidFlavor("Ice Cream Sandwich", "4.0-4.0.4", R.drawable.icecream));
//        androidFlavors.add(new AndroidFlavor("Jelly Bean", "4.1-4.3.1", R.drawable.jellybean));
//        androidFlavors.add(new AndroidFlavor("KitKat", "4.4-4.4.4", R.drawable.kitkat));
//        androidFlavors.add(new AndroidFlavor("Lollipop", "5.0-5.1.1", R.drawable.lollipop));
//        androidFlavors.add(new AndroidFlavor("Marshmallow", "6.0-6.0.1", R.drawable.marshmallow));

        // Create an {@link AndroidFlavorAdapter}, whose data source is a list of
        // {@link AndroidFlavor}s. The adapter knows how to create list item views for each item
        // in the list.
        OutdoorPlacesAdapter placesAdapter = new OutdoorPlacesAdapter(this, outdoorPlaces);

        // Get a reference to the ListView, and attach the adapter to the listView.

//        ListView listView = (ListView) findViewById(R.id.listview_outdoors);
//        listView.setAdapter(placesAdapter);
//    }
//}

