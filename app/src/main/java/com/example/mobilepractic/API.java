package com.example.mobilepractic;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface API {
    @POST("user/login")
    Call<Mask> createUser(@Body UserModelMask modelUser);
}
