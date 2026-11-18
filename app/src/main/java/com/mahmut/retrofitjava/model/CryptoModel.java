package com.mahmut.retrofitjava.model;

import com.google.gson.annotations.SerializedName;

public class CryptoModel {

    @SerializedName("currency")
    String currency;
    @SerializedName("price")
    String price;


}
