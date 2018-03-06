package com.example.vitaly.logapplication;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

/**
 * Created by Vitaly on 05.03.2018.
 */

public class MyView extends View {

    private static final String TAG = "MyView";

    protected MyView(Context context){
        super(context);
        Log.d(TAG, "ctor1");
    }

    protected MyView(Context context, AttributeSet attrSet){
        super(context, attrSet);
        Log.d(TAG, "ctor2");
    }

    protected MyView(Context context, AttributeSet attrSet, int defStyleAttr){
        super(context, attrSet, defStyleAttr);
        Log.d(TAG, "ctor3");
    }

    public void finalize() {
        Log.d(TAG, "finalize");
    }

}
