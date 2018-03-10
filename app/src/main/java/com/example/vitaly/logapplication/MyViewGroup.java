package com.example.vitaly.logapplication;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/**
 * Created by Vitaly on 05.03.2018.
 */

public class MyViewGroup extends LinearLayout {

    private static final String TAG = "MyViewGroup";


    public MyViewGroup(Context context) {
        super(context);
        Log.d(TAG, "ctor1");
    }

    public MyViewGroup(Context context, AttributeSet attrs) {
        super(context, attrs);
        Log.d(TAG, "ctor2");
    }

    public MyViewGroup(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        Log.d(TAG, "ctor3");
    }

    @Override
    public void onLayout(boolean x, int a, int b, int c, int d) {
        super.onLayout(x, a, b, c, d);
        Log.d(TAG, "onLayout");
    }

    @Override
    public void onViewAdded(View child){
        super.onViewAdded(child);
        Log.d(TAG, "onViewAdded");
    }

    @Override
    public void onViewRemoved(View child){
        super.onViewRemoved(child);
        Log.d(TAG, "onViewRemoved");
    }

    @Override
    public void finalize() {
        Log.d(TAG, "finalize");
    }

}
