package com.example.jamie.secret.DrawerLayout;

import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;

import com.example.jamie.secret.R;

/**
 * Created by jamie on 20/8/2017.
 */

public class DrawerLayoutServiceImpl implements DrawerLayoutService {

    @Override
    public void open(DrawerLayoutModel drawerLayoutModel) {
        drawerLayoutModel.getDrawer().openDrawer(GravityCompat.START);
    }

    @Override
    public void close(DrawerLayoutModel drawerLayoutModel) {
        drawerLayoutModel.getDrawer().closeDrawer(GravityCompat.START);
    }
}
