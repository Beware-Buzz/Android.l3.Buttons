package com.example.user.lab3proj1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity4 extends AppCompatActivity {

    Button b;
 @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity4);
     b = (Button)findViewById(R.id.button);
     View.OnClickListener onClickListener = new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             v.setBackgroundResource(R.drawable.buttoncli);
         }
     };
     b.setOnClickListener(onClickListener);
    }

}
