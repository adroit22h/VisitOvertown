package com.example.android.visitovertown;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class OutdoorsFragment extends Fragment {

    // Store instance variables
    private String title;
    private int page;

    // newInstance constructor for creating fragment with arguments
    public static Fragment newInstance(int page, String title) {
        OutdoorsFragment fragmentOutdoors = new OutdoorsFragment();
        Bundle args = new Bundle();
        args.putInt("someInt", page);
        args.putString("someTitle", title);
        fragmentOutdoors.setArguments(args);
        return fragmentOutdoors;
    }

    // Store instance variables based on arguments passed
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        page = getArguments().getInt("someInt", 0);
        title = getArguments().getString("someTitle");
    }

    // Inflate the view for the fragment based on layout XML
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_outdoors, container, false);
        TextView tvLabel = (TextView) view.findViewById(R.id.myOutdoorFragFirst);
        tvLabel.setText(page + " -- " + title);
        return view;
    }
}


// OTHER SET OF CODE
// In this case, the fragment displays simple text based on the page
//public class OutdoorsFragment extends Fragment {
//    public static final String ARG_PAGE = "ARG_PAGE";
//
//    private int mPage;
//
//    public static OutdoorsFragment newInstance(int page) {
//        Bundle args = new Bundle();
//        args.putInt(ARG_PAGE, page);
//        OutdoorsFragment fragment = new OutdoorsFragment();
//        fragment.setArguments(args);
//        return fragment;
//    }
//
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        mPage = getArguments().getInt(ARG_PAGE);
//    }
//
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        View view = inflater.inflate(R.layout.fragment_outdoors, container, false);
//        TextView textView = (TextView) view;
//        textView.setText("Fragment #" + mPage);
//        return view;
//    }
//}

//---one set

///**
// * A simple {@link Fragment} subclass.
// * Activities that contain this fragment must implement the
// * {@link OutdoorsFragment.OnFragmentInteractionListener} interface
// * to handle interaction events.
// * Use the {@link OutdoorsFragment#newInstance} factory method to
// * create an instance of this fragment.
// */
//public class OutdoorsFragment extends Fragment {
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
//    public OutdoorsFragment() {
//        // Required empty public constructor
//    }
//
//    /**
//     * Use this factory method to create a new instance of
//     * this fragment using the provided parameters.
//     *
//     * @param param1 Parameter 1.
//     * @param param2 Parameter 2.
//     * @return A new instance of fragment OutdoorsFragment.
//     */
//    // TODO: Rename and change types and number of parameters
//    public static OutdoorsFragment newInstance(String param1, String param2) {
//        OutdoorsFragment fragment = new OutdoorsFragment();
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
//
//            import android.support.v4.app.Fragment;
//...
//            public class ScreenSlidePageFragment extends Fragment {
//
//                @Override
//                public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                                         Bundle savedInstanceState) {
//                    ViewGroup rootView = (ViewGroup) inflater.inflate(
//                            R.layout.fragment_screen_slide_page, container, false);
//
//                    return rootView;
//                }
//            }
//
//        }
//    }
//
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_outdoors, container, false);
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
