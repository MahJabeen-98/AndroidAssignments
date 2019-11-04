package com.example.assignment4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

public class Spinner extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    String[] items;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spinner);

        android.widget.Spinner spin=(android.widget.Spinner)findViewById(R.id.spinner);
        spin.setOnItemSelectedListener( this);

        final Resources resources = getResources();
        items = resources.getStringArray(R.array.items);

        ArrayAdapter<String> aa=new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item,
                items);
        aa.setDropDownViewResource(
                android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(aa);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
