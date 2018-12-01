package com.example.tsaohanwen.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    private Button button1;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //取得此Button的實體
       button1 = (Button)findViewById(R.id.button1);

        //實做OnClickListener界面
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //初始化Intent物件
                Intent intent = new Intent();
                //從MainActivity 到Main2Activity
                intent.setClass( Main2Activity.this,MainActivity.class );
                //開啟Activity
                startActivity(intent);
            }
        });
    }
}
