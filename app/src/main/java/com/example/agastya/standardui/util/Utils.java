package com.example.agastya.standardui.util;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by AgastyA on 1/16/2018.
 */

public class Utils {
    public static void showToast(Context context, String text) {
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
    }
}