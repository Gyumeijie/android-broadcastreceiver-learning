package com.github.gyumeijie.broadcastreceiver;

import android.app.Activity;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {
    static final String TAG = "MAIN_ACTIVITY_BROADCAST_RECEIVER";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.github.gyumeijie.MY_RECEIVER");
        registerReceiver(new MyReceiver(), intentFilter);
        Log.d(TAG, "onCreate()");
    }
}