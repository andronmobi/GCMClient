package com.andronblog.gcmclient;

import android.app.Application;
import com.wonderpush.sdk.WonderPush;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        WonderPush.setUserId(null);
        WonderPush.initialize(this);
        WonderPush.setLogging(true);
    }
}
