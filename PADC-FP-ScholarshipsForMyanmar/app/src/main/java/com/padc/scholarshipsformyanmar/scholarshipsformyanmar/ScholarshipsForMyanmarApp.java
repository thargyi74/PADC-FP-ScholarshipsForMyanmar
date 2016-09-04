package com.padc.scholarshipsformyanmar.scholarshipsformyanmar;

import android.app.Application;
import android.content.Context;

/**
 * Created by Dell on 04-Sep-16.
 */
public class ScholarshipsForMyanmarApp extends Application {

    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }

    public static Context getContext() {
        return context;
    }
}
