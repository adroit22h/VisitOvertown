package com.example.android.visitovertown;

public class OutdoorPlaces {
    //Names of Outdoor Places
    private String mOutdoorPlaceName;

    //Drawable resource reference
    private int mImageResource;

    //Description
    private String mDescription;

    /**
     * @param placeName is the name of the outdoor location
     * @param imageResource the name of the corresponding image
     * @param iDescription a description of the the location
     */

    public OutdoorPlaces(String placeName, int imageResource, String iDescription) {
        mOutdoorPlaceName = placeName;
        mImageResource = imageResource;
        mDescription = iDescription;
    }

    /**
     * pulls the name of the place
     */
    public String getmOutdoorPlaceName() {
        return mOutdoorPlaceName;
    }

    /**
     *
     * pulls the Image
     */
    public int getmImageResource () {
        return mImageResource;
    }

    /**
     *
     * pulls the description
     */
    public String getmDescription (){
        return mDescription;
    }
}
