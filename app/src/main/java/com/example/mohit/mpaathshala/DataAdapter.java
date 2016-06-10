package com.example.mohit.mpaathshala;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
/**
 * Created by mohit on 8/6/16.
 */
public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {
    private ArrayList<AndroidVersion> android;



    public DataAdapter(ArrayList<AndroidVersion> android) {
        this.android = android;
    }

    @Override
    public DataAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_row, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final DataAdapter.ViewHolder viewHolder, int i) {

        viewHolder.tv_name.setText(android.get(i).getName());
        viewHolder.tv_version.setText(android.get(i).getTopic());
        viewHolder.tv_api_level.setText(android.get(i).getContent());
        //viewHolder.tv_link.setText(android.get(i).getLink());
        //uri=android.get(i).getLink();
        viewHolder.button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v)
            {
                viewHolder.button.setText("CLicked");


            }
        });

    }


    @Override
    public int getItemCount() {
        return android.size();
    }



    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView tv_name,tv_version,tv_api_level,tv_link;
        private Button button;
        public ViewHolder(View view) {
            super(view);

            tv_name = (TextView)view.findViewById(R.id.tv_name);
            tv_version = (TextView)view.findViewById(R.id.tv_version);
            tv_api_level = (TextView)view.findViewById(R.id.tv_api_level);
            //tv_link= (TextView)view.findViewById(R.id.tv_link);
            button= (Button)view.findViewById(R.id.button);
        }
    }



}