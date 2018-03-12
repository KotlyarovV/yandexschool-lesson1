package com.example.vitaly.logapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Parcelable;
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
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Log.d(TAG, "onAttachedToWindow");
    }

    @Override
    public void onMeasure(int width, int height) {
        super.onMeasure(width, height);
        Log.d(TAG, "onMeasure");
    }

    @Override
    public Parcelable onSaveInstanceState() {
        Log.d(TAG, "onSaveInstanceState");
        return super.onSaveInstanceState();
    }

    @Override
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(parcelable);
        Log.d(TAG, "onRestoreInstanceState");
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Log.d(TAG, "dispatchDraw");
    }

    @Override
    public void draw(Canvas canvas) {
        super.draw(canvas);
        Log.d(TAG, "draw");
    }

    @Override
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Log.d(TAG, "onDraw");
    }

    @Override
    public void finalize() {
        Log.d(TAG, "finalize");
    }

}
