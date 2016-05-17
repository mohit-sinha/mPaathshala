package com.example.mohit.mpaathshala;

/**
 * Created by mohit on 17/5/16.
 */

import java.util.List;

import retrofit.Callback;
import retrofit.http.GET;

public interface LectAPI {

    @GET("/RetrofitExample/json_encode.php")
    public void getLects(Callback<List<Lect>> response);
}
