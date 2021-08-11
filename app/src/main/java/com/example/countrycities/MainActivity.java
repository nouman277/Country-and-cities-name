package com.example.countrycities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button pak, ind, chi ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pak = findViewById(R.id.btnPakistan);
        ind = findViewById(R.id.btnIndia);
        chi = findViewById(R.id.btnChina);

        pak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Pakistan.class);
                startActivity(intent);
            }
        });
        ind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,India.class);
                startActivity(intent);
            }
        });
        chi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,China.class);
                startActivity(intent);
            }
        });

    }
}