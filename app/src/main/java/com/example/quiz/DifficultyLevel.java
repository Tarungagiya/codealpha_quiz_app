package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DifficultyLevel extends AppCompatActivity {

    CardView easy_level,normal_level,hard_level;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_difficulty_level);

        easy_level = findViewById(R.id.easy_level);
        normal_level = findViewById(R.id.normal_level);
        hard_level = findViewById(R.id.hard_level);

        easy_level.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),EasyLevel.class);
                startActivity(intent);
            }
        });

        normal_level.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),NormalLevel.class);
                startActivity(intent);
            }
        });

        hard_level.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),HardLevel.class);
                startActivity(intent);
            }
        });

    }
}