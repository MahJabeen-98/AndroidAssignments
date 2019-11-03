package com.example.assignment4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
//    private TextView selection;
    String[] items;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        selection=(TextView)findViewById(R.id.selection);

        Spinner spin=(Spinner)findViewById(R.id.spinner);
        spin.setOnItemSelectedListener( this);

        final Resources resources = getResources();
        items = resources.getStringArray(R.array.items);

        ArrayAdapter<String> aa=new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item,
                items);
        aa.setDropDownViewResource(
                android.R.layout.simple_list_item_single_choice);
        spin.setAdapter(aa);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//        selection.setText(items[position]);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

//        selection.setText("");
    }
}
