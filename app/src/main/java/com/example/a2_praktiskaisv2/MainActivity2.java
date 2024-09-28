package com.example.a2_praktiskaisv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button back = findViewById(R.id.btnBack);
        back.setOnClickListener(v -> {

            finish();
            Log.d("My","Clicked on back");
        });
    }

}