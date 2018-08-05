package com.example.android.visitovertown;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ToggleButton;
import android.widget.VideoView;

public class Home extends Fragment {
    public Home() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
        return rootView;
    }

    ;
}

    //video code




//Plays the page song
//    final MediaPlayer mp = MediaPlayer.create(this, R.raw.take_five);
//    ToggleButton toggle = (ToggleButton) findViewById(R.id.playButton);
//        toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//        if (isChecked) {
//        mp.start();
//        } else {
//        // The toggle is disabled
//        mp.pause();
//        }
//        }
//        });
//
//        TextView texthome = findViewById(R.id.textHome);
//        texthome.setOnClickListener(new View.OnClickListener() {
//public void onClick(View v) {
//        Intent i = new Intent(Dave.this, MainActivity.class);
//        startActivity(i);
//        finish();
//        mp.release();
//        }
//        });
