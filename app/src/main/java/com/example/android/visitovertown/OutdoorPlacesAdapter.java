package com.example.android.visitovertown;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.view.menu.ListMenuItemView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


/*
 * OutdoorPlacesAdapter is an {@link ArrayAdapter} that can provide the layout for each list
 * based on a data source, which is a list of {@link OutdoorPlaces} objects.
 * */
public class OutdoorPlacesAdapter extends ArrayAdapter<OutdoorPlaces> {

    private static final String LOG_TAG = OutdoorPlacesAdapter.class.getSimpleName();


    public OutdoorPlacesAdapter(Activity context, ArrayList<OutdoorPlaces> outdoorPlaces) {

        super(context, 0, outdoorPlaces);
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position    The position in the list of data that should be displayed in the
     *                    list item view.
     * @param convertView The recycled view to populate.
     * @param parent      The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.fragment_outdoors, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        OutdoorPlaces currentOutdoorPlaces = getItem(position);

        // Find the ImageView in the list_item.xml layout with the Image for the location
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.location_image);
        // Get the image resource ID from the current OutdoorPlaces object and
        // set the image to iconView
        iconView.setImageResource(currentOutdoorPlaces.getLocationImage());

        // Find the TextView in the list_item.xml layout with the location_name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.location_name);
        // Get the version name from the current OutdoorPlaces object and
        // set this text on the name TextView
        nameTextView.setText(currentOutdoorPlaces.getLocationName());

        // Find the TextView in the list_item.xml layout with the ID location_address
        TextView numberTextView = (TextView) listItemView.findViewById(R.id.location_address);
        // Get the version number from the current OutdoorPlaces object and
        // set this text on the number TextView
        numberTextView.setText(currentOutdoorPlaces.getLocationAddress());

        // Find the TextView in the list_item.xml layout with the location_description
        TextView desCriptionView = (TextView) listItemView.findViewById(R.id.location_description);
        // Get the version name from the current OutdoorPlaces object and
        // set this text on the name TextView
        desCriptionView.setText(currentOutdoorPlaces.getLocationDescription());


        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }

}