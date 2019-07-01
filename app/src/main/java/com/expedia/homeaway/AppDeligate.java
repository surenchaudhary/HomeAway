package com.expedia.homeaway;

import com.expedia.homeaway.manager.NetworkConnectivityObserver;
import com.expedia.homeaway.ui.BaseAppCompatActivity;

import java.lang.ref.WeakReference;

/**
 * Created by Surendra Singh on 7/1/2019.
 */
public class AppDeligate {
    private NetworkConnectivityObserver networkConnectivityObserver;
    private WeakReference<BaseAppCompatActivity> activeActivityRef = new WeakReference<>(null);
    private String token;

    public void initialize(App app) {
        _initNetworkConnectivityObserver(app);
    }

    private void _initNetworkConnectivityObserver(App app) {
        networkConnectivityObserver = NetworkConnectivityObserver.init(app);
    }

    public NetworkConnectivityObserver getNetworkConnectivityObserver() {
        return networkConnectivityObserver;
    }

}
