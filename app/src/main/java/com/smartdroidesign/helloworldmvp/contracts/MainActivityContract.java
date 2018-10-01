package com.smartdroidesign.helloworldmvp.contracts;

import android.view.View;

public interface MainActivityContract {

    interface View {
        void initView(); // initialize components
        void setViewData(String data); // setting data in the UI
    }

    interface Model {
        String getData(); // This wll be overridden in the (Model) MainActivityModel
    }

    interface Presenter {
        void onClick(android.view.View v); // exposes the methods to capture button clicks
    }
}
