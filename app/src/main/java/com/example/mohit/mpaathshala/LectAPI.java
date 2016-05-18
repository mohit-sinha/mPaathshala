package com.example.mohit.mpaathshala;

/**
 * Created by mohit on 17/5/16.
 */

import java.util.List;

import retrofit2.Callback;
import retrofit2.http.GET;

public interface LectAPI {

    @GET("/RetrofitExample/json_encode.php")
    public void getLects(Callback<List<Lect>> response);
}
