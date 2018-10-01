package com.smartdroidesign.helloworldmvp.models;

import com.smartdroidesign.helloworldmvp.contracts.MainActivityContract;

public class MainActivityModel implements MainActivityContract.Model {

    private int counter = 0;

    @Override
    public String getData() {
        String message = "Hello World! \n";
        if (counter == 0) {
            counter++;
        } else {
            message += counter++;
        }
        return message;
    }
}
