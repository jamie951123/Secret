package com.example.jamie.secret.Integrate;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jamie.secret.R;

import butterknife.ButterKnife;

/**
 * Created by jamie on 20/8/2017.
 */

public class IntegrateContainer extends Fragment{

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.integrate_container, container, false);
        ButterKnife.bind(this, rootView);
        return rootView;
    }

}