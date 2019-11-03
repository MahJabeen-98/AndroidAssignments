package com.example.assignment6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    private String[] items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.auto_complete);

        Resources resources = getResources();
        items = resources.getStringArray(R.array.items);

        AutoCompleteTextView auto = (AutoCompleteTextView) findViewById(R.id.txt);

        ArrayAdapter<String> aa =new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1 , items);
        auto.setAdapter(aa);
    }
}
