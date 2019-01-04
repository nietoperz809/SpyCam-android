package com.example.android.SpyCam;

import android.app.Application;
import android.content.Context;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_LONG;

/**
 *
 */

public class TheApp extends Application
{
    private static Context context;

    public static void showInfo (String s)
    {
        Toast.makeText(context, s, LENGTH_LONG).show();
    }

    public void onCreate()
    {
        super.onCreate();
        TheApp.context = getApplicationContext();
    }

    public static Context getAppContext()
    {
        return TheApp.context;
    }
}
