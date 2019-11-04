package com.example.myassignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView txtshow;
    private CheckBox chk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtshow = (TextView) findViewById(R.id.txtshowform);
        chk = (CheckBox) findViewById(R.id.checkBoxForm);

        chk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //  boolean checked = ((CheckBox) v).isChecked();
                // Check which checkbox was clicked
                if (chk.isChecked()){

                    txtshow.setText("Yes, I'm An Android Developer. ");
                }
                else{
                    txtshow.setText("No, I'm Not An Android Developer.");
                }
            }
        });

    }
}
