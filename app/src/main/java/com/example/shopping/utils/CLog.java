package com.example.shopping.utils;

import android.util.Log;

public class CLog {
    public static final int DEV = 0;
    public static final int TEST = 1;
    public static final int USER = 3;
    static int mLevel = DEV;

    public static void d(String tag, int level, String msg) {
        if (level >= mLevel) {
            Log.d(tag, msg);
        }
    }

    public static void d(String tag, String msg) {
        d(tag, DEV, msg);
    }

    public static void e(String tag, int level, String msg) {
        if (level >= mLevel) {
            Log.e(tag, msg);
        }
    }

    public static void e(String tag, String msg) {
        e(tag, DEV, msg);
    }


}
