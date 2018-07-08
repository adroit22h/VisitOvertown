package com.example.android.visitovertown;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.view.menu.ListMenuItemView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class OutdoorPlacesAdapter extends ArrayAdapter<OutdoorPlaces> {
    private Context mContext;

    public OutdoorPlacesAdapter(Activity Context, ArrayList<OutdoorPlaces> outdoorPlaces) {
        super(Context, 0,outdoorPlaces);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View ListItemView = convertView;

        if (ListItemView == null) {
            ListItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.outdoorplaces_list, parent, false);

            OutdoorPlaces currentOutdoorPlaces = getItem(position);
            TextView nameTextView = (TextView) ListItemView.findViewById(R.id.myOutdoorFragFirst);
        }
        return ListItemView; }

}



