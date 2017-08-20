package com.example.jamie.secret.structure.settings;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jamie.secret.R;

import butterknife.ButterKnife;

/**
 * Created by jamie on 21/8/2017.
 */

public class SettingContainer extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.settings_container, container, false);
        ButterKnife.bind(this, rootView);
        return rootView;
    }
}
