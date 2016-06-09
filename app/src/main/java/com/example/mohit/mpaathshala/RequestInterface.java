package com.example.mohit.mpaathshala;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by mohit on 8/6/16.
 */
public interface RequestInterface {
    @GET("json_encode.php")
    Call<JSONResponse> getJSON();
}
