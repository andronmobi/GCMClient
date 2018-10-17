package com.andronblog.gcmclient;

import android.content.Context;
import com.wonderpush.sdk.WonderPush;
import com.wonderpush.sdk.WonderPushInitializer;

public class WonderPushInitializerImpl implements WonderPushInitializer {

    @Override
    public void initialize(Context context) {
        WonderPush.initialize(context,
                context.getString(R.string.wonderpush_client_id),
                context.getString(R.string.wonderpush_secret));
    }
}
