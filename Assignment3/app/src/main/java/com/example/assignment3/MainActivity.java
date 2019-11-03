package com.example.assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends ListActivity {

    String[] items;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiple_check);
        final Resources resources = getResources();
        items = resources.getStringArray(R.array.items);
        setListAdapter(new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_checked,
                items));

    }
    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {

    }
}
