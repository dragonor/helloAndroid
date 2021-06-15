package com.dragon.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        Button button = findViewById(R.id.button3);
        button.setOnClickListener(v -> {
            //关闭活动
            finish();
        });
    }
}