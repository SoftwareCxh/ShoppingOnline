package com.example.shopping.ui.common;

import android.os.Bundle;
import android.view.View;

import com.example.shopping.ui.common.BaseActivity;

public class BaseTitleActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getContentView());
        initToolbar();
    }


    private void initToolbar() {

    }

    private View getContentView() {
        return null;
    }
}
