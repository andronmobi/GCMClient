package com.andronblog.gcmclient;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.gcm.GcmListenerService;
import com.wonderpush.sdk.WonderPushGcmListenerService;

public class LequipeGcmNotificationListenerService extends GcmListenerService {

    @Override
    public void onMessageReceived(String from, Bundle data) {
        handleNotification(getApplicationContext(), from, data);
    }

    public void handleNotification(Context context, String from, Bundle data) {
        boolean isWonderPushNotification = WonderPushGcmListenerService.onMessageReceived(context, from, data);
        if (!isWonderPushNotification) {
            // If we receive a notification from the "old" system, we still need to process it ourselves.
            handleOldNotification(context, data);
        }
    }

    private void handleOldNotification(Context context, Bundle data) {
        String message = data.getString("message");
        if (message == null) {
            return;
        }

        int notificationId = message.hashCode();
        buildAndNotify(notificationId, message);
    }

    public void buildAndNotify(int notificationId, String jsonNotification) {
        Log.d("LequipeGcmNotification", "buildAndNotify");
    }
}
