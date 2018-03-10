package com.example.vitaly.logapplication;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by Vitaly on 05.03.2018.
 */

public class MyApplication extends Application {

    public static final String TAG = "MyApplication";

    public MyApplication() {
        super();
        Log.d(TAG,"ctor");
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG,"onCreate");
    }

    @Override
    public void onTrimMemory(int x) {
        super.onTrimMemory(x);
        Log.d(TAG,"onTrimMemory");
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        Log.d(TAG,"onLowMemory");
    }

    public void finalize()
    {
        Log.d(TAG, "finalize");
    }

}
