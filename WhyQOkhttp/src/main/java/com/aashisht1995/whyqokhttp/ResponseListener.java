package com.aashisht1995.whyqokhttp;

public interface ResponseListener {
    void onResponse(int requestCode, int responseCode, String response);

    void onFailed(int requestCode);
}