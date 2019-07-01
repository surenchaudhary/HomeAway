package com.expedia.homeaway;

import android.annotation.SuppressLint;
import android.content.Context;

import androidx.multidex.MultiDexApplication;


public class App extends MultiDexApplication {

    @SuppressLint("StaticFieldLeak")
    private static App app;
    private static AppDeligate delegate;

    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
        delegate = new AppDeligate();
        delegate.initialize(app);

    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
    }

    public static AppDeligate getDelegate() {
        return delegate;
    }

    /**
     * @return application instance.
     */
    public static App getInstance() {
        return app;
    }
}
