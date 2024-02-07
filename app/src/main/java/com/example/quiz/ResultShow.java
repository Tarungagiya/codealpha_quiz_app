package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultShow extends AppCompatActivity {

    TextView currect,wrong;
    Button play_again,home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_show);

        currect = findViewById(R.id.currect);
        wrong = findViewById(R.id.wrong);

        play_again = findViewById(R.id.play_again);
        home = findViewById(R.id.home);

        Intent intent = getIntent();
        int currectAns = intent.getIntExtra("currect",0);
        int wrongAns = 5 - currectAns;

        String currectAnswer = String.valueOf(currectAns);
        String wrongAnswer = String.valueOf(wrongAns);

        currect.setText(currectAnswer);
        wrong.setText(wrongAnswer);

        play_again.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(getApplicationContext(),EasyLevel.class);
                startActivity(intent1);
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(getApplicationContext(),DifficultyLevel.class);
                startActivity(intent1);
            }
        });

    }
}