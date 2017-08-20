package com.example.jamie.secret.core.view;

import android.support.v4.app.Fragment;

/**
 * Created by jamie on 21/8/2017.
 */

public interface MainView {
    void setContentView();
    void setNav();
    void setSupportActionBar();
    void showToast(String msg);
    void showFagment(Fragment fragment);
}
