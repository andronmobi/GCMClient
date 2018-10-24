package com.andronblog.gcmclient;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.gcm.GcmListenerService;

public class LequipeGcmNotificationListenerService extends GcmListenerService {

    @Override
    public void onMessageReceived(String from, Bundle data) {
        Log.d("GcmListenerService", "onMessageReceived from: " + from);
        Log.d("GcmListenerService", "onMessageReceived bundle: " + data.toString());
    }
}
