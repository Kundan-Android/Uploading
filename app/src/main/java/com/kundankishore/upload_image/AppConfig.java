package com.kundankishore.upload_image;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Caliber on 07-09-2018.
 */

public class AppConfig {
    private static String BASE_URL = "http://mushtaq.16mb.com/";
    static Retrofit getRetrofit(){
        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
}
