package com.dragon.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/*
* 1 为什么一次安装，下一次可以不用安装apk，更新项目
* 2 Intent构造为什么需要两个参数？
* 3 Intent是什么？
* 4 View指的是什么？
* 5 为什么开启活动需要构造Intent对象
* 6 为什么现在的我明明休息好了，但是还是看资料会犯困？
*   这不仅仅是精神不好这么简单，我应该是对Android开发整体的认识还不够，所以无法集中精神在晦涩概念上
*   一方面对与许多概念理解很模糊，另一方面，没有可以直接上手的实践项目*/
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //开启活动，需要通过创建Intent意图
                Intent intent = new Intent(MainActivity.this,MyActivity.class);
                startActivity(intent);
            }
        });

        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //刷新当前avtivity????
                onCreate(null);
            }
        });

    }
}