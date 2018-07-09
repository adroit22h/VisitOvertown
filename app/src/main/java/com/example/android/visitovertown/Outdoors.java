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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_outdoors, container, false);

        /** TODO: Insert all the code from the NumberActivity’s onCreate() method after the setContentView method call */

        return rootView;
    }

 // @Override
//    //protected void onCreate(Bundle savedInstanceState) {
//      //  super.onCreate(savedInstanceState);
//    //  setContentView(R.layout.fragment_outdoors);
      //  public View onCreateView(LayoutInflater inflater, ViewGroup container,
        //        Bundle savedInstanceState) {
        //return inflater.inflate(R.layout.activity_outdoors, container, false);
//
          // Create an ArrayList of OutdoorPlaces objects
  ArrayList<OutdoorPlaces> outdoorPlaces = new ArrayList<OutdoorPlaces>();
        outdoorPlaces.add(new OutdoorPlaces(R.drawable.google_map_overtown, "Map of Overtown", "123 West Main St, Miami, fL 33136"));



        //        androidFlavors.add(new AndroidFlavor("Donut", "1.6", R.drawable.donut));

        // Create an {@link AndroidFlavorAdapter}, whose data source is a list of
        // {@link AndroidFlavor}s. The adapter knows how to create list item views for each item
        // in the list.
   OutdoorPlacesAdapter placesAdapter = new OutdoorPlacesAdapter (getActivity(), outdoorPlaces);

        // Get a reference to the ListView, and attach the adapter to the listView.
 ListView listView = (ListView) rootView.findViewById(R.id.listview_outdoors);
       listView.setAdapter(placesAdapter);
    }
}




//public class Outdoors extends Fragment {
//    public Outdoors() {
//        //Required empty public constructor
//    }
//
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        View rootView = inflater.inflate(R.layout.outdoorplaces_list, container, false);
//        //Makes an ArrayList of Category Objects
//        final ArrayList<OutdoorPlaces> outdoorplaces = new ArrayList<OutdoorPlaces>();
//        outdoorplaces.add(new OutdoorPlaces(getString(R.string.dorsey_park), R.drawable.google_map_overtown2, getString(R.string.app_name)));
//
//        //Makes a
//        OutdoorPlacesAdapter outdoorPlacesAdapter = new OutdoorPlacesAdapter(getActivity(), outdoorplaces );
//
//        //get a reference to the listview
//        ListView listView = (ListView) rootView.findViewById(R.id.list);
//        listView.setAdapter(outdoorPlacesAdapter);
//
//        //Set a click listener
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                //retrieves the category
//
//                OutdoorPlaces outdoorPlaces = outdoorplaces.get(position);
//                //get the name
//                String title = outdoorPlaces.getmOutdoorPlaceName();
//                //get the image
//                int imageResourceID= outdoorPlaces.getmImageResource();
//                //
//                String firstParagraph= outdoorPlaces.getmDescription();
//
//                //Intent outdoorPlacesDetail = new Intent(getActivity())
//            }
//        });
//              return rootView;
//
//
//    }
//}
//
//


///**
// * A simple {@link Fragment} subclass.
// * Activities that contain this fragment must implement the
// * {@link Outdoors.OnFragmentInteractionListener} interface
// * to handle interaction events.
// * Use the {@link Outdoors#newInstance} factory method to
// * create an instance of this fragment.
// */

//    // TODO: Rename parameter arguments, choose names that match
//    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
//    private static final String ARG_PARAM1 = "param1";
//    private static final String ARG_PARAM2 = "param2";
//
//    // TODO: Rename and change types of parameters
//    private String mParam1;
//    private String mParam2;
//
//    private OnFragmentInteractionListener mListener;
//
//    public Outdoors() {
//        // Required empty public constructor
 //   }
//
//    /**
//     * Use this factory method to create a new instance of
//     * this fragment using the provided parameters.
//     *
//     * @param param1 Parameter 1.
//     * @param param2 Parameter 2.
//     * @return A new instance of fragment Outdoors.
//     */
//    // TODO: Rename and change types and number of parameters
//    public static Outdoors newInstance(String param1, String param2) {
//        Outdoors fragment = new Outdoors();
//        Bundle args = new Bundle();
//        args.putString(ARG_PARAM1, param1);
//        args.putString(ARG_PARAM2, param2);
//        fragment.setArguments(args);
//        return fragment;
//    }
//
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        if (getArguments() != null) {
//            mParam1 = getArguments().getString(ARG_PARAM1);
//            mParam2 = getArguments().getString(ARG_PARAM2);
//        }
//    }
//
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_outdoors2, container, false);
//    }
//
//    // TODO: Rename method, update argument and hook method into UI event
//    public void onButtonPressed(Uri uri) {
//        if (mListener != null) {
//            mListener.onFragmentInteraction(uri);
//        }
//    }
//
//    @Override
//    public void onAttach(Context context) {
//        super.onAttach(context);
//        if (context instanceof OnFragmentInteractionListener) {
//            mListener = (OnFragmentInteractionListener) context;
//        } else {
//            throw new RuntimeException(context.toString()
//                    + " must implement OnFragmentInteractionListener");
//        }
//    }
//
//    @Override
//    public void onDetach() {
//        super.onDetach();
//        mListener = null;
//    }
//
//    /**
//     * This interface must be implemented by activities that contain this
//     * fragment to allow an interaction in this fragment to be communicated
//     * to the activity and potentially other fragments contained in that
//     * activity.
//     * <p>
//     * See the Android Training lesson <a href=
//     * "http://developer.android.com/training/basics/fragments/communicating.html"
//     * >Communicating with Other Fragments</a> for more information.
//     */
//    public interface OnFragmentInteractionListener {
//        // TODO: Update argument type and name
//        void onFragmentInteraction(Uri uri);
//    }
//}
