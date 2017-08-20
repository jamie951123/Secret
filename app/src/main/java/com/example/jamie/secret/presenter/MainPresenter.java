package com.example.jamie.secret.presenter;

import com.example.jamie.secret.model.MainModel;
import com.example.jamie.secret.view.MainView;

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

}
