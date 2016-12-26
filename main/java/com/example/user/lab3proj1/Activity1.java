package com.example.user.lab3proj1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity1 extends AppCompatActivity {
    public static final String ACTION_SECOND_ACTIVITY = "com.example.user.lab3proj1.Activity2";
    public static final String ACTION_THIRD_ACTIVITY = "com.example.user.lab3proj1.Activity3";
    public static final String ACTION_FORTH_ACTIVITY = "com.example.user.lab3proj1.Activity4";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity1);
    }

    public void onClick1(View view) {
        startActivity(new Intent(ACTION_SECOND_ACTIVITY));
    }

    public void onClick2(View view) {
        startActivity(new Intent(ACTION_THIRD_ACTIVITY));
    }

    public void onClick3(View view) {
        startActivity(new Intent(ACTION_FORTH_ACTIVITY));
    }

    public void onClick4(View view) {
        android.os.Process.killProcess(android.os.Process.myPid());
    }
}
