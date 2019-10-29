package com.github.gyumeijie.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {
    static final String TAG = "MyReceiver";

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "BroadcastReceiver", Toast.LENGTH_LONG).show();
        Log.d(TAG, "onReceive");
    }
}
