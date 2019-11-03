package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private EditText txt;
    private CheckBox chk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form2);

        btn = (Button) findViewById(R.id.btnFormOk);
        txt = (EditText) findViewById(R.id.txtNameForm);
        chk = (CheckBox) findViewById(R.id.checkBoxForm);

        chk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean checked = ((CheckBox) v).isChecked();
                // Check which checkbox was clicked
                if (checked){
                    Toast.makeText(v.getContext(),"Yes",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(v.getContext(),"No",Toast.LENGTH_SHORT).show();
                }
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),txt.getText().toString(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}
