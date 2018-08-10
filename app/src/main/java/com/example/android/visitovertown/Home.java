package com.example.android.visitovertown;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.provider.MediaStore;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;
import android.widget.VideoView;

//Welcome to "Visit Overtown" this app is the original work of Marie Heriveaux.
//This is the home page. it is designed to give the user a feel of what the app is about.
//There's a link to a video that give good information about the history of Overtown.

public class Home extends Fragment {
    public Home() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);


        //Message to the user once the page is loaded

        //Loads a text message letting the user know to click on any image on this page to watch a video.
        Context context = getActivity().getApplicationContext();
        CharSequence text = "Welcome to Visit Overtown, Click on any picture on this page to watch a video 1. then click play on YouTube " +
                "2. Click your back button to return to app when done. ";
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context, text, duration);
        toast.setGravity(Gravity.TOP, 0, 0);
        toast.show();

//Creates an array list for a changing image
        final ImageView mpImage = (ImageView) rootView.findViewById(R.id.wall_art_pic);
        final int[] photosArray = {R.drawable.historic_black_sign, R.drawable.three_crown_art,
                R.drawable.wall_art1, R.drawable.wall_art_2,
                R.drawable.wall_art_3, R.drawable.wall_art_4,
                R.drawable.dorsey,
                R.drawable.miami_overtown_3rd_ave, R.drawable.gibson_parkpool,};
//Set each image to change within 2 seconds
        final Handler handler = new Handler();
        Runnable runnable = new Runnable() {
            int i = 0;

            public void run() {
                mpImage.setImageResource(photosArray[i]);
                i++;
                if (i > photosArray.length - 1) {
                    i = 0;
                }
                handler.postDelayed(this, 2000);
            }
        };
        handler.postDelayed(runnable, 2000);

        //Set the a link to watch a Video when you click on the picture.
        ImageView videoView = (ImageView) rootView.findViewById(R.id.wall_art_pic);

        videoView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent videoClient = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/NCClmNGfzb0"));
                startActivity(videoClient);
            }
        });
        return rootView;
    }


}







