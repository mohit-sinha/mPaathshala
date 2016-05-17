package com.example.mohit.mpaathshala;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;


public class MainActivity extends AppCompatActivity implements ListView.OnItemClickListener {

    public static final String ROOT_URL = "http://dev.eu5.org/";

    public static final String KEY_LECT_SUB = "key_lect_sub";
    public static final String KEY_LECT_NAME = "key_lect_name";
    public static final String KEY_LECT_COM = "key_lect_com";
    public static final String KEY_LECT_LINK = "key_lect_link";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}
