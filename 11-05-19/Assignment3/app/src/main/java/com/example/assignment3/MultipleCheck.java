package com.example.assignment3;

import android.app.ListActivity;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;


public class MultipleCheck extends ListActivity {

    private String[] items;
     Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiple_check);

        btn = (Button) findViewById(R.id.btnselcet);
        final ListView list = (ListView)findViewById(android.R.id.list);

        final Resources resources = getResources();
        items = resources.getStringArray(R.array.items);
        setListAdapter(new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_checked,
                items));

        list.setChoiceMode(AbsListView.CHOICE_MODE_MULTIPLE);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = list.getCount();
                String selected = "";
                SparseBooleanArray sba = list.getCheckedItemPositions();
        for(int i = 0; i < a; i++){
            if(sba.get(i)){
            selected += list.getItemAtPosition(i).toString() +"\n";
            }
        }
        Toast.makeText(MultipleCheck.this,
                "Your Selected Data"+ "\n" +
                selected,
                Toast.LENGTH_LONG).show();
     }
    });
   }
}
