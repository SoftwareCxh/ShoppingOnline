package com.example.shopping.ui.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.example.shopping.R;
import com.example.shopping.ui.common.BaseActivity;


public class MainActivity extends BaseActivity {

    private final static int INDEX=0;
    private final static int CART=1;
    private final static int MINE=2;

    public static void start(Activity activity){
        Intent intent=new Intent(activity,MainActivity.class);
        activity.startActivity(intent);
        activity.finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
