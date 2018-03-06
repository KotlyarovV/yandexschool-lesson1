package com.example.vitaly.logapplication;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.TextView;

/**
 * Created by Vitaly on 05.03.2018.
 */

public class MyTextView extends AppCompatTextView {

    private static final String TAG = "MyTextView";

    public MyTextView(Context context) {
        super(context);
        Log.d(TAG, "ctor1");
    }

    public MyTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        Log.d(TAG, "ctor2");
    }

    public void finalize() {
        Log.d(TAG, "finalize");
    }


}
