package com.example.assignment6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class AutoCompleteActivity extends AppCompatActivity implements TextWatcher {

    private String[] items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.auto_complete);

        Resources resources = getResources();
        items = resources.getStringArray(R.array.items);

        AutoCompleteTextView auto = (AutoCompleteTextView) findViewById(R.id.txt);

        auto.addTextChangedListener(this);

        auto.setAdapter(new ArrayAdapter<String>(
                this,
                android.R.layout.simple_dropdown_item_1line , items));

    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

    }

    @Override
    public void afterTextChanged(Editable s) {

    }
}
