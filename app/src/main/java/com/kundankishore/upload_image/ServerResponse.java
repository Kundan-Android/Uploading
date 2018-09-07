package com.kundankishore.upload_image;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Caliber on 07-09-2018.
 */

public class ServerResponse {
    @SerializedName("success")
    boolean success;
    @SerializedName("message")
    String message;

    String getMessage(){
        return message;
    }
    boolean getSuccess(){
        return success;
    }
}
