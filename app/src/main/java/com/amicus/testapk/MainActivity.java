package com.amicus.testapk;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    PaintView paintView;
    Button save;
    Button clear;
    Button change;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        save = findViewById(R.id.btnSave);
        clear = findViewById(R.id.btnClear);
        change = findViewById(R.id.btnColor);
        paintView = findViewById(R.id.paintView);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paintView.saveToGallery(MainActivity.this);
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paintView.clearCanvas();
            }
        });


        change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paintView.changeColor(change);
            }
        });

    }
}