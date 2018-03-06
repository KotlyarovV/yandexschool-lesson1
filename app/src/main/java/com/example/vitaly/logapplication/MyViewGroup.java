package com.example.vitaly.logapplication;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup;

/**
 * Created by Vitaly on 05.03.2018.
 */

public class MyViewGroup extends ViewGroup {

    private static final String TAG = "MyViewGroup";


    public MyViewGroup(Context context) {
        super(context);
}

    public MyViewGroup(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public void onLayout(boolean x, int a, int b, int c, int d) {
        Log.d(TAG, "onLayout");
    }
}
