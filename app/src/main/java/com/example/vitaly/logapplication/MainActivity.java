package com.example.vitaly.logapplication;

import android.content.Intent;
import android.support.annotation.LayoutRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static String TAG = "MainActivity";

    public MainActivity() {
        super();
        Log.d(TAG, "ctor");
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate");
    }

    @Override
    public void startActivity(Intent intent) {
        super.startActivity(intent);
        Log.d(TAG, "startActivity");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
    }

    @Override
    protected void onStop() {
        Log.d(TAG, "onStop");
        super.onStop();
    }

    @Override
    protected void onPause() {
        Log.d(TAG, "onPause");
        super.onPause();
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent keyEvent) {
        boolean result = super.onKeyDown(keyCode, keyEvent);
        Log.d(TAG, "onKeyDown");
        return result;
    }

    @Override
    public void onContentChanged() {
        super.onContentChanged();
        Log.d(TAG, "onContentChanged");
    }

    @Override
    public void setContentView(@LayoutRes int layoutResID) {
        super.setContentView(layoutResID);
        Log.d(TAG, "setContentView with layoutResID");
    }

    @Override
    public void setContentView(View view) {
        super.setContentView(view);
        Log.d(TAG, "setContentView with view");
    }

    @Override
    public void finish() {
        Log.d(TAG, "finish");
        super.finish();
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG, "onDestroy");
        super.onDestroy();
    }

    public void finalize() {
        Log.d(TAG, "finalize");
    }
}
