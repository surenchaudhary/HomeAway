package com.expedia.homeaway.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

/**
 * Created by Surendra Singh.
 * Network related methods
 */
@SuppressWarnings("unused")
public class NetworkUtils {

    private static boolean networkConnect;
    private static String networkType = "";

    private NetworkUtils() {
    }

    public static void init(Context context) {
        _registerNetworkStateReceiver(context);
    }

    /**
     * @param context Context
     * @return true if Network is available on device, otherwise false.
     */
    public static boolean IsNetworkConnected(Context context) {
        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo ni = null;
        if (cm != null) {
            ni = cm.getActiveNetworkInfo();
        }
        return ni != null;
    }

    /**
     * Get network state from device, connectivity and type of network being connected.
     *
     * @param context Calling context
     */
    private static void updateNetworkState(Context context) {
        boolean isConnected = false;
        String typeName = "";
        try {
            ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo activeNetwork = null;
            if (cm != null) {
                activeNetwork = cm.getActiveNetworkInfo();
            }
            if (activeNetwork != null) {
                String type = activeNetwork.getTypeName();
                String subType = activeNetwork.getSubtypeName();
                isConnected = activeNetwork.isConnectedOrConnecting();
                if (activeNetwork.getType() == ConnectivityManager.TYPE_MOBILE) { //for mobile, lets show subtype like EDGE etc
                    typeName = subType;
                } else {
                    typeName = type;
                }
            }
        } catch (Exception ignore) {
        }
        networkConnect = isConnected;
        networkType = typeName;
    }

    /**
     * @return true if Network connected (or connecting), otherwise false.
     */
    public static boolean isNetworkConnect() {
        return networkConnect;
    }

    /**
     * @return Network type (WIFI/EDGE//LTE etc)
     */
    public static String getNetworkType() {
        return networkType;
    }

    /**
     * Register Network state change receiver listener.
     *
     * @param context context
     */
    private static void _registerNetworkStateReceiver(Context context) {
        IntentFilter intentFilter = new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION);
        context.registerReceiver(new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                if (TextUtils.equals(ConnectivityManager.CONNECTIVITY_ACTION, intent.getAction())) {
                    updateNetworkState(context);
                }
            }
        }, intentFilter);
    }

    /**
     * Get the device's local ip address (ipv4)
     *
     * @return String ip address if found, otherwise empty String.
     */
    public static String getLocalIpAddress() {
        try {
            for (Enumeration<NetworkInterface> en = NetworkInterface.getNetworkInterfaces(); en.hasMoreElements(); ) {
                NetworkInterface networkInterface = en.nextElement();
                for (Enumeration<InetAddress> enumIpAddress = networkInterface.getInetAddresses(); enumIpAddress.hasMoreElements(); ) {
                    InetAddress inetAddress = enumIpAddress.nextElement();
                    if (!inetAddress.isLoopbackAddress() && inetAddress instanceof Inet4Address) {
                        return inetAddress.getHostAddress();
                    }
                }
            }
        } catch (SocketException ignore) {
        }
        return "";
    }
}
