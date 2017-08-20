package com.example.jamie.secret.core.presenter;

import android.support.v4.app.Fragment;

import com.example.jamie.secret.core.model.MainModel;
import com.example.jamie.secret.core.view.MainView;

/**
 * Created by jamie on 21/8/2017.
 */

public class MainPresenter {

    private MainView mainView;
    private MainModel mainModel;

    public MainPresenter(MainView mainView, MainModel mainModel) {
        this.mainView = mainView;
        this.mainModel = mainModel;
    }

    public void onCreate(){
        mainView.setContentView();
        mainView.setSupportActionBar();
        mainView.setNav();
    }

    public void onClickNav(String msg){
        mainView.showToast(msg);
    }

    public void showFagment(Fragment fragment){
        mainView.showFagment(fragment);
    }

}
