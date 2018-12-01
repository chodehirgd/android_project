package com.example.tsaohanwen.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {


    private EditText Et1;
    private TextView title1;
    private Button button1;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button)findViewById(R.id.button1);
        title1 = (TextView)findViewById(R.id.title1);
        Et1 = (EditText)findViewById(R.id.Et1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                title1.setText(Et1.getText().toString());
                //test branch
            }
        });
    }
}
