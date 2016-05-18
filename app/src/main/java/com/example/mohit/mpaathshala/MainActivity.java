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

import retrofit2.Callback;
import retrofit2.RestAdapter;
import retrofit2.RetrofitError;
import retrofit2.client.Response;


public class MainActivity extends AppCompatActivity implements ListView.OnItemClickListener {

    public static final String ROOT_URL = "http://dev.eu5.org/";

    public static final String KEY_LECT_SUB = "key_lect_sub";
    public static final String KEY_LECT_NAME = "key_lect_name";
    public static final String KEY_LECT_COM = "key_lect_com";
    public static final String KEY_LECT_LINK = "key_lect_link";

    private ListView listView;

    private List<Lect> lects;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listViewLects);

        getLects();

        listView.setOnItemClickListener(this);
    }

    private void getLects(){

        final ProgressDialog loading = ProgressDialog.show(this,"Fetching Data","Please wait...",false,false);


        RestAdapter adapter = new RestAdapter.Builder()
                .setEndpoint(ROOT_URL)
                .build();


        LectAPI api = adapter.create(LectAPI.class);


        api.getLects(new Callback<List<Lect>>() {
            @Override
            public void success(List<Lect> list, Response response) {

                loading.dismiss();


                lects = list;


                showList();
            }

            @Override
            public void failure(RetrofitError error) {
                //error handling agar man hua toh
            }
        });
    }

    private void showList(){

        String[] items = new String[lects.size()];


        for(int i=0; i<lects.size(); i++){

            items[i] = lects.get(i).getName();
        }


        ArrayAdapter adapter = new ArrayAdapter<String>(this,R.layout.simple_list,items);


        listView.setAdapter(adapter);
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent = new Intent(this, ShowLectDetails.class);


        Lect lect = lects.get(position);


        intent.putExtra(KEY_LECT_NAME,lect.getName());
        intent.putExtra(KEY_LECT_SUB,lect.getSubject());
        intent.putExtra(KEY_LECT_COM,lect.getComment());
        intent.putExtra(KEY_LECT_LINK,lect.getLink());


        startActivity(intent);

    }
}
