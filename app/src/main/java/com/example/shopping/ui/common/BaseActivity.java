package com.example.shopping.ui.common;

import android.os.Bundle;
import android.view.View;

import com.example.shopping.utils.CLog;
import com.gyf.barlibrary.ImmersionBar;

import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity {
    String TAG=this.getClass().getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        CLog.d(TAG,CLog.TEST,"onCreate");
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onStart() {
        CLog.d(TAG,CLog.TEST,"onStart");
        super.onStart();
        initImmersionBar();
    }

    @Override
    protected void onDestroy() {
        CLog.d(TAG, CLog.TEST, "onDestroy");
        super.onDestroy();
        ImmersionBar.with(this).destroy();
    }

    protected  void initImmersionBar(){
        ImmersionBar.with(this).statusBarDarkFont(true).titleBar(getTitleBar()).init();
    }

    private View getTitleBar() {
        return null;
    }
}
