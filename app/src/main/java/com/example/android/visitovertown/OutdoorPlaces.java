package com.example.android.visitovertown;

public class OutdoorPlaces {
            // Image of the location
        private int mLocationImage;

        // Name of the location
        private String mLocationName;

        // address of the location
        private String mLocationAddress;

        /*
         * Create a new OutdoorPlaces object.
         *
         * @param iImage is the drawable image
         * @param vName is the corresponding Android version number (e.g. 2.3-2.7)
         * @param vAddress is drawable reference ID that corresponds to the Android version
         * */
        public OutdoorPlaces(int iImage, String vName, String vAddress)
        {
            mLocationImage = iImage;
            mLocationName = vName;
            mLocationAddress= vAddress;
        }

    /**
     * Get the image location
     */
    public int getLocationImage() {
        return mLocationImage;
    }

        /**
         * Get the name of the location
         */
        public String getLocationName() {
            return mLocationName;
        }

        /**
         * Get the address of the location
         */
        public String getLocationAddress() {
            return mLocationAddress;
        }




    }
