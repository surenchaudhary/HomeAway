package com.expedia.homeaway.manager;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;


import com.expedia.homeaway.App;
import com.expedia.homeaway.utils.NetworkUtils;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import io.reactivex.annotations.NonNull;


@SuppressWarnings("unused")
public final class NetworkConnectivityObserver {


    private static NetworkConnectivityObserver instance;

    private static final String HANDLER_THREAD_NAME = "network_task_handler";
    private static final String SOCKET_HOST_URL = "https://www.google.com/";
    private static final int SOCKET_HOST_PORT = 80;
    private static final int CONNECTION_TIME_OUT = 2000; //ms
    private static final int READ_TIME_OUT = 8000; //ms

    private final List<NetworkConnectivityChangeListener> changeListeners;
    private final Handler workerHandler;
    private final Handler uiHandler;

    private boolean internetAvailable;

    /**
     * To check and compare internet current fetched state with this previous state.
     * If state is same, prevent unwanted call of <code>NetworkConnectivityChangeListener.onInternetConnectivityChanged()</code>.
     */
    private boolean internetPreviousState;
    private boolean shouldCompareInternetState;
    private URL siteURL;

    private NetworkConnectivityObserver(Application app) {
        changeListeners = new ArrayList<>(3);
        uiHandler = new Handler(Looper.getMainLooper());
        HandlerThread handlerThread = new HandlerThread(HANDLER_THREAD_NAME);
        handlerThread.start();
        try {
            siteURL = new URL(SOCKET_HOST_URL);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        workerHandler = new Handler(handlerThread.getLooper());
        internetAvailable = NetworkUtils.IsNetworkConnected(app); //Initialization time, check at least connection status.
        internetPreviousState = internetAvailable;
        app.registerReceiver(new NetworkChangeReceiver(), new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION));
    }

    /**
     * @param app Application context
     * @return Singleton instance of manager
     */
    public static NetworkConnectivityObserver init(Application app) {
        if (instance == null) {
            instance = new NetworkConnectivityObserver(app);
        }
        return instance;
    }

    /**
     * Allow internet to be compared with previous state to prevent unwanted call of <code>NetworkConnectivityChangeListener.onInternetConnectivityChanged()</code>.
     */
    public void setCompareInternetWithPreviousState(Boolean shouldCompare) {
        shouldCompareInternetState = shouldCompare;
    }

    /**
     * Register Network connectivity change listener and trigger network checking now
     *
     * @param networkConnectivityChangeListener callback listener
     */
    @SuppressWarnings("WeakerAccess")
    public synchronized void registerCallbackListener(@NonNull NetworkConnectivityChangeListener networkConnectivityChangeListener) {
        registerCallbackListener(networkConnectivityChangeListener, true); //true for legacy implementation, otherwise false would be great.
    }

    /**
     * Register Network connectivity change listener, manage request checking based on parameter requestCheckNow value.
     *
     * @param networkConnectivityChangeListener callback listener
     * @param requestCheckNow                   flag true to enforce checking now, false to register callback just for future state changes.
     */
    @SuppressWarnings({"WeakerAccess", "SameParameterValue"})
    public synchronized void registerCallbackListener(@NonNull NetworkConnectivityChangeListener networkConnectivityChangeListener, boolean requestCheckNow) {
        changeListeners.add(networkConnectivityChangeListener);
        if (requestCheckNow) {
            checkInternetConnectivityNow(changeListeners);
        }
    }

    /**
     * Unregister Network connectivity change listener
     *
     * @param networkConnectivityChangeListener callback listener
     */
    public synchronized void unregisterCallbackListener(@NonNull NetworkConnectivityChangeListener networkConnectivityChangeListener) {
        changeListeners.remove(networkConnectivityChangeListener);
    }

    /**
     * Request connectivity check now, specifically for given parameter callback listener only.
     *
     * @param networkConnectivityChangeListener callback listener
     */
    public void requestCheckInternetConnectivityNow(@NonNull NetworkConnectivityChangeListener networkConnectivityChangeListener) {
        checkInternetConnectivityNow(Collections.singletonList(networkConnectivityChangeListener));
    }

    /**
     * Return last stored status of internet connectivity check
     *
     * @return true if connected, false otherwise
     */
    public boolean isInternetAvailable() {
        return internetAvailable;
    }

    @SuppressWarnings("SameParameterValue")
    private void checkHostAvailable(final List<NetworkConnectivityChangeListener> callbacks) {
        workerHandler.post(new Runnable() {
            @Override
            public void run() {
            /*    try (Socket socket = new Socket()) {
                    socket.connect(new InetSocketAddress(SOCKET_HOST_URL, SOCKET_HOST_PORT), CONNECTION_TIME_OUT);
                    log.d("checkHostAvailable : Connection Available: " + socket.isConnected());
                    postCallbackUpdates(callbacks, socket.isConnected());
                    try {
                        socket.close(); //clean up
                    } catch (Throwable ignore) {
                    }
                } catch (IOException e) {
                    // Either we have a timeout or unreachable host or failed DNS lookup
                    //noinspection ConstantConditions
                    log.d("checkHostAvailable : Connection Not Available, Reason: " + (e == null ? "Unknown" : e.getMessage()));
                    postCallbackUpdates(callbacks, false);
                }
*/
                try {
                    HttpURLConnection connection = (HttpURLConnection) siteURL
                            .openConnection();
                    connection.setRequestMethod("GET");
                    connection.setConnectTimeout(CONNECTION_TIME_OUT);
                    connection.setReadTimeout(READ_TIME_OUT);
                    connection.connect();
                    int code = connection.getResponseCode();
                    if (code >= 200 && code < 300) {
                        postCallbackUpdates(callbacks, true);
                    } else {
                        postCallbackUpdates(callbacks, false);
                    }
                    connection.disconnect();
                } catch (Exception e) {
                    // Either we have a timeout or unreachable host or failed DNS lookup
                    postCallbackUpdates(callbacks, false);
                }
            }
        });
    }

    private synchronized void postCallbackUpdates(final List<NetworkConnectivityChangeListener> callbacks, final boolean connectivityAvailable) {
        internetAvailable = connectivityAvailable;
        if (callbacks.size() > 0) {
            uiHandler.post(new Runnable() {
                @Override
                public void run() {

                    for (NetworkConnectivityChangeListener networkConnectivityChangeListener : callbacks) {
                        try {
                            if (networkConnectivityChangeListener != null) {
                                if (shouldCompareInternetState) {
                                    if (connectivityAvailable != internetPreviousState)
                                        networkConnectivityChangeListener.onInternetConnectivityChanged(connectivityAvailable);
                                } else {
                                    networkConnectivityChangeListener.onInternetConnectivityChanged(connectivityAvailable);
                                }
                            }
                        } catch (Exception ignore) {
                        }
                    }

                    internetPreviousState = internetAvailable;
                }
            });
        } else {
            internetPreviousState = internetAvailable;
        }
    }

    private class NetworkChangeReceiver extends BroadcastReceiver {
        @Override
        public void onReceive(final Context context, final Intent intent) {
            if (TextUtils.equals(ConnectivityManager.CONNECTIVITY_ACTION, intent.getAction())) {
                checkInternetConnectivityNow(changeListeners);
            }
        }
    }

    /**
     * Forcefully checking internet connectivity, callback will be given to registered listener.
     */
    private void checkInternetConnectivityNow(List<NetworkConnectivityChangeListener> callbacks) {
        if (NetworkUtils.IsNetworkConnected(App.getInstance())) {
            checkHostAvailable(callbacks);
        } else {
            postCallbackUpdates(callbacks, false);
        }
    }

    /**
     * Forcefully checking internet connectivity manually when user wants to retry again, callback will be given to registered listener.
     */
    public void checkInternetConnectivityManually() {
        checkInternetConnectivityNow(changeListeners);
    }

    public interface NetworkConnectivityChangeListener {
        void onInternetConnectivityChanged(boolean internetAvailable);
    }
}