package com.example.listviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView unitlist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        unitlist = findViewById(R.id.unitlist);
        //add items
        String[] strings = {"Monash","FIT2081"};
        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this,R.layout.listview_layout,R.id.txt_data,strings);
        //set adapter
        unitlist.setAdapter(adapter);
    }
}