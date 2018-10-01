package com.smartdroidesign.helloworldmvp.presenter;

import android.view.View;

import com.smartdroidesign.helloworldmvp.contracts.MainActivityContract;
import com.smartdroidesign.helloworldmvp.models.MainActivityModel;

public class MainActivityPresenter implements MainActivityContract.Presenter {

    private MainActivityContract.View mView;
    private MainActivityContract.Model mModel;


    public MainActivityPresenter (MainActivityContract.View v) {
        mView = v;

        initPresenter();
    }

    private void initPresenter() {
        mModel = new MainActivityModel();
        mView.initView();
    }

    @Override
    public void onClick(View v) {
        String data = mModel.getData();
        mView.setViewData(data);
    }
}
