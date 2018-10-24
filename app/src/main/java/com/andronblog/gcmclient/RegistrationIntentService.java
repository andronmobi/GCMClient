package com.andronblog.gcmclient;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

import com.google.android.gms.gcm.GoogleCloudMessaging;
import com.google.android.gms.iid.InstanceID;

import java.io.IOException;

public class RegistrationIntentService extends IntentService {

    private static final String TAG = "RegIntentService";

    public RegistrationIntentService() {
        super(TAG);
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        // Get token
        InstanceID instanceID = InstanceID.getInstance(this);
        try {
            String token = instanceID.getToken("119007590842", GoogleCloudMessaging.INSTANCE_ID_SCOPE);
            Log.i(TAG, "GCM Registration Token: " + token);
        } catch (IOException e) {
            e.printStackTrace();
            Log.d(TAG, "Failed to complete token refresh", e);
        }
    }

}