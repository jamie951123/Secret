package com.example.jamie.secret.DrawerLayout;

import android.app.Activity;
import android.content.Context;
import android.support.v4.widget.DrawerLayout;

/**
 * Created by jamie on 20/8/2017.
 */

public class DrawerLayoutModel {

    private Activity activity;
    private DrawerLayout drawer;


    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public DrawerLayout getDrawer() {
        return drawer;
    }

    public void setDrawer(DrawerLayout drawer) {
        this.drawer = drawer;
    }
}
