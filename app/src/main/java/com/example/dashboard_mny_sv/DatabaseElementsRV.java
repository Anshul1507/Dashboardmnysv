package com.example.dashboard_mny_sv;


import android.widget.ImageView;

public class DatabaseElementsRV {
    private ImageView appIcon;
    private String transactionAmount;
    private String date;

    public DatabaseElementsRV(ImageView appIcon, String transactionAmount, String date) {
        this.appIcon = appIcon;
        this.transactionAmount = transactionAmount;
        this.date = date;
    }

    public ImageView getAppIcon() {
        return appIcon;
    }

    public String getTransactionAmount() {
        return transactionAmount;
    }

    public String getDate() {
        return date;
    }
}
