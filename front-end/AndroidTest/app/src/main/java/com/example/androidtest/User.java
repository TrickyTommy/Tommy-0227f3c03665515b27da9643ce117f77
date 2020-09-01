package com.example.androidtest;

import com.google.gson.annotations.SerializedName;

public class User {
    @SerializedName("response")
    private String Response;

    @SerializedName("username")
    private String username;

    public String getResponse() {
        return Response;
    }

    public String getUsername() {
        return username;
    }
}
