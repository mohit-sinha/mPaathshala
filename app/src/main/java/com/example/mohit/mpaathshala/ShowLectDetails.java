package com.example.mohit.mpaathshala;

/**
 * Created by mohit on 17/5/16.
 */
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ShowLectDetails extends AppCompatActivity {

    //Defining views
    private TextView textViewLectname;
    private TextView textViewLectsub;
    private TextView textViewLectcom;
    private TextView textViewLectlink;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_lect_details);

        //Initializing Views
        textViewLectname = (TextView) findViewById(R.id.textViewLectname);
        textViewLectsub = (TextView) findViewById(R.id.textViewLectsub);
        textViewLectcom = (TextView) findViewById(R.id.textViewLectcom);
        textViewLectlink = (TextView) findViewById(R.id.textViewLectlink);

        //Getting intent
        Intent intent = getIntent();

        //Displaying values by fetching from intent
        textViewLectname.setText(String.valueOf(intent.getIntExtra(MainActivity.KEY_BOOK_ID, 0)));
        textViewLectsub.setText(intent.getStringExtra(MainActivity.KEY_BOOK_NAME));
        textViewLectcom.setText(intent.getStringExtra(MainActivity.KEY_BOOK_PRICE));
        textViewLectlink.setText(String.valueOf(intent.getIntExtra(MainActivity.KEY_BOOK_STOCK,0)));
    }
}
