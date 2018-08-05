//package com.example.android.visitovertown;
//
//import android.support.v4.app.Fragment;
//import android.support.v4.app.FragmentManager;
//import android.os.Bundle;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.TextView;
//
//public class HistoricFragment extends Fragment {
//
//    // Store instance variables
//    private String title;
//    private int page;
//
//    // newInstance constructor for creating fragment with arguments
//    public static HistoricFragment newInstance(int page, String title) {
//        HistoricFragment fragmentHistoric = new HistoricFragment();
//        Bundle args = new Bundle();
//        args.putInt("someInt", page);
//        args.putString("someTitle", title);
//        fragmentHistoric.setArguments(args);
//        return fragmentHistoric;
//    }
//
//    // Store instance variables based on arguments passed
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        page = getArguments().getInt("someInt", 0);
//        title = getArguments().getString("someTitle");
//    }
//
//    // Inflate the view for the fragment based on layout XML
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//
//        View view = inflater.inflate(R.layout.historic_frag, container, false);
//        TextView tvLabel = (TextView) view.findViewById(R.id.historicFragSecond);
//        tvLabel.setText(page + " -- " + title);
//        return view;
//    }
//}
//
