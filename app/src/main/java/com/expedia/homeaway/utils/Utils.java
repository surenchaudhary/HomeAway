package com.expedia.homeaway.utils;

import android.location.Location;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created by Surendra Singh on 7/1/2019.
 */
public class Utils {

    private Utils() {
    }

 /*   public static double getDistance(double lat1, double lon1, double lat2, double lon2) {
        double theta = lon1 - lon2;
        double dist = Math.sin(deg2rad(lat1))
                * Math.sin(deg2rad(lat2))
                + Math.cos(deg2rad(lat1))
                * Math.cos(deg2rad(lat2))
                * Math.cos(deg2rad(theta));
        dist = Math.acos(dist);
        dist = rad2deg(dist);
        dist = dist * 60 * 1.1515;
        dist =  dist * 0.621371;

        return dist;
    }*/

    public static String getDistance(double lat1, double lon1, double lat2, double lon2) {
        Location mylocation = new Location("");
        Location dest_location = new Location("");

        dest_location.setLatitude(lat2);
        dest_location.setLongitude(lon2);

        mylocation.setLatitude(lat1);
        mylocation.setLongitude(lon1);
        float distance = mylocation.distanceTo(dest_location);//in meters
        return new BigDecimal(distance *0.00062137119).setScale(1, RoundingMode.HALF_UP).toString();

    }

    private static double deg2rad(double deg) {
        return (deg * Math.PI / 180.0);
    }

    private static double rad2deg(double rad) {
        return (rad * 180.0 / Math.PI);
    }
}
