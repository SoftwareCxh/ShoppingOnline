package com.example.shopping.ui.common;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.shopping.utils.CLog;

import androidx.fragment.app.Fragment;

public abstract class BaseFragment extends Fragment{
    String TAG=this.getClass().getName();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        CLog.d(TAG,CLog.TEST,"onCreateView : layoutId = "+getLayoutId());
        View view=inflater.inflate(getLayoutId(),container,false);
        onCreateView(view);
        return super.onCreateView(inflater, container, savedInstanceState);
    }
    protected abstract void onCreateView(View view);

    protected abstract int getLayoutId();
}
