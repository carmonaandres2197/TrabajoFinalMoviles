package com.example.trabajofinalmoviles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.trabajofinalmoviles.ui.ListPendientesActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnAbrir = findViewById(R.id.button);
        btnAbrir.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ListPendientesActivity.class);
            startActivity(intent);
        });
    }
}