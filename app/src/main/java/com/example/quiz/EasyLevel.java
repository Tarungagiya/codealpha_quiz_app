package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class EasyLevel extends AppCompatActivity {

    TextView question,opt1,opt2,opt3,opt4,timer,number_of_question;
    CardView cardview1,cardview2,cardview3,cardview4;
    LinearLayout opt1Ans,opt2Ans,opt3Ans,opt4Ans,opt1_Ans,opt2_Ans,opt3_Ans,opt4_Ans;
    Boolean ansIs;
    int currectAns = 0;
    private int currentQuestionPosition = 0;

    private final List<QuizList> quizLists = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy_level);

        question = findViewById(R.id.question);

        opt1 = findViewById(R.id.opt1);
        opt2 = findViewById(R.id.opt2);
        opt3 = findViewById(R.id.opt3);
        opt4 = findViewById(R.id.opt4);

        cardview1 = findViewById(R.id.cardview1);
        cardview2 = findViewById(R.id.cardview2);
        cardview3 = findViewById(R.id.cardview3);
        cardview4 = findViewById(R.id.cardview4);

        opt1Ans = findViewById(R.id.opt1Ans);
        opt2Ans = findViewById(R.id.opt2Ans);
        opt3Ans = findViewById(R.id.opt3Ans);
        opt4Ans = findViewById(R.id.opt4Ans);

        opt1_Ans = findViewById(R.id.opt1_Ans);
        opt2_Ans = findViewById(R.id.opt2_Ans);
        opt3_Ans = findViewById(R.id.opt3_Ans);
        opt4_Ans = findViewById(R.id.opt4_Ans);

        timer = findViewById(R.id.timer);
        number_of_question = findViewById(R.id.number_of_question);

        quizLists.addAll(QuizData.getEasyLevelQuizList());

        setQuiz();
        number_of_question.setText(String.valueOf(currentQuestionPosition+1));

        new CountDownTimer(50000,1000){

            @Override
            public void onTick(long l) {
                timer.setText("" +l / 1000);
            }
            @Override
            public void onFinish() {
                Toast.makeText(EasyLevel.this, "Time out", Toast.LENGTH_SHORT).show();
                Intent intent1 = new Intent(getApplicationContext(),ResultShow.class);
                startActivity(intent1);
            }
        }.start();

        cardview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String option1 = opt1.getText().toString();
                if (option1.equals(quizLists.get(currentQuestionPosition).getAns())){
                    ansIs = true;
                }else {
                    ansIs = false;
                }

                if (ansIs){
                    opt1Ans.setBackgroundColor(Color.GREEN);
                    opt1_Ans.setBackgroundColor(Color.GREEN);
                    currectAns++;
                    Toast.makeText(EasyLevel.this, "Answer is right", Toast.LENGTH_SHORT).show();
                }else {
                    opt1Ans.setBackgroundColor(Color.RED);
                    opt1_Ans.setBackgroundColor(Color.RED);
                    Toast.makeText(EasyLevel.this, "Answer is wrong", Toast.LENGTH_SHORT).show();
                }

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        currentQuestionPosition++;

                        opt1Ans.setBackgroundColor(Color.BLACK);
                        opt2Ans.setBackgroundColor(Color.BLACK);
                        opt3Ans.setBackgroundColor(Color.BLACK);
                        opt4Ans.setBackgroundColor(Color.BLACK);

                        opt1_Ans.setBackgroundColor(Color.WHITE);
                        opt2_Ans.setBackgroundColor(Color.WHITE);
                        opt3_Ans.setBackgroundColor(Color.WHITE);
                        opt4_Ans.setBackgroundColor(Color.WHITE);

                        if (currentQuestionPosition <= 4){
                            setQuiz();
                            number_of_question.setText(String.valueOf(currentQuestionPosition+1));
                        }else {
                            Intent intent = new Intent(getApplicationContext(),ResultShow.class);
                            intent.putExtra("currect",currectAns);
                            startActivity(intent);
                        }
                    }
                },1000);
            }
        });

        cardview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String option2 = opt2.getText().toString();
                if (option2.equals(quizLists.get(currentQuestionPosition).getAns())){
                    ansIs = true;
                }else {
                    ansIs = false;
                }

                if (ansIs){
                    opt2Ans.setBackgroundColor(Color.GREEN);
                    opt2_Ans.setBackgroundColor(Color.GREEN);
                    currectAns++;
                    Toast.makeText(EasyLevel.this, "Answer is right", Toast.LENGTH_SHORT).show();
                }else {
                    opt2Ans.setBackgroundColor(Color.RED);
                    opt2_Ans.setBackgroundColor(Color.RED);
                    Toast.makeText(EasyLevel.this, "Answer is wrong", Toast.LENGTH_SHORT).show();
                }

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        currentQuestionPosition++;

                        opt1Ans.setBackgroundColor(Color.BLACK);
                        opt2Ans.setBackgroundColor(Color.BLACK);
                        opt3Ans.setBackgroundColor(Color.BLACK);
                        opt4Ans.setBackgroundColor(Color.BLACK);

                        opt1_Ans.setBackgroundColor(Color.WHITE);
                        opt2_Ans.setBackgroundColor(Color.WHITE);
                        opt3_Ans.setBackgroundColor(Color.WHITE);
                        opt4_Ans.setBackgroundColor(Color.WHITE);

                        if (currentQuestionPosition <= 4){
                            setQuiz();
                            number_of_question.setText(String.valueOf(currentQuestionPosition+1));
                        }else {
                            Intent intent = new Intent(getApplicationContext(),ResultShow.class);
                            intent.putExtra("currect",currectAns);
                            startActivity(intent);
                        }
                    }
                },1000);
            }
        });

        cardview3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String option3 = opt3.getText().toString();
                if (option3.equals(quizLists.get(currentQuestionPosition).getAns())){
                    ansIs = true;
                }else {
                    ansIs = false;
                }

                if (ansIs){
                    opt3Ans.setBackgroundColor(Color.GREEN);
                    opt3_Ans.setBackgroundColor(Color.GREEN);
                    currectAns++;
                    Toast.makeText(EasyLevel.this, "Answer is right", Toast.LENGTH_SHORT).show();
                }else {
                    opt3Ans.setBackgroundColor(Color.RED);
                    opt3_Ans.setBackgroundColor(Color.RED);
                    Toast.makeText(EasyLevel.this, "Answer is wrong", Toast.LENGTH_SHORT).show();
                }

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        currentQuestionPosition++;

                        opt1Ans.setBackgroundColor(Color.BLACK);
                        opt2Ans.setBackgroundColor(Color.BLACK);
                        opt3Ans.setBackgroundColor(Color.BLACK);
                        opt4Ans.setBackgroundColor(Color.BLACK);

                        opt1_Ans.setBackgroundColor(Color.WHITE);
                        opt2_Ans.setBackgroundColor(Color.WHITE);
                        opt3_Ans.setBackgroundColor(Color.WHITE);
                        opt4_Ans.setBackgroundColor(Color.WHITE);

                        if (currentQuestionPosition <= 4){
                            setQuiz();
                            number_of_question.setText(String.valueOf(currentQuestionPosition+1));
                        }else {
                            Intent intent = new Intent(getApplicationContext(),ResultShow.class);
                            intent.putExtra("currect",currectAns);
                            startActivity(intent);
                        }
                    }
                },1000);
            }
        });

        cardview4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String option4 = opt4.getText().toString();
                if (option4.equals(quizLists.get(currentQuestionPosition).getAns())){
                    ansIs = true;
                }else {
                    ansIs = false;
                }

                if (ansIs){
                    opt4Ans.setBackgroundColor(Color.GREEN);
                    opt4_Ans.setBackgroundColor(Color.GREEN);
                    currectAns++;
                    Toast.makeText(EasyLevel.this, "Answer is right", Toast.LENGTH_SHORT).show();
                }else {
                    opt4Ans.setBackgroundColor(Color.RED);
                    opt4_Ans.setBackgroundColor(Color.RED);
                    Toast.makeText(EasyLevel.this, "Answer is wrong", Toast.LENGTH_SHORT).show();
                }

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        currentQuestionPosition++;

                        opt1Ans.setBackgroundColor(Color.BLACK);
                        opt2Ans.setBackgroundColor(Color.BLACK);
                        opt3Ans.setBackgroundColor(Color.BLACK);
                        opt4Ans.setBackgroundColor(Color.BLACK);

                        opt1_Ans.setBackgroundColor(Color.WHITE);
                        opt2_Ans.setBackgroundColor(Color.WHITE);
                        opt3_Ans.setBackgroundColor(Color.WHITE);
                        opt4_Ans.setBackgroundColor(Color.WHITE);

                        if (currentQuestionPosition <= 4){
                            setQuiz();
                            number_of_question.setText(String.valueOf(currentQuestionPosition+1));
                        }else {
                            Intent intent = new Intent(getApplicationContext(),ResultShow.class);
                            intent.putExtra("currect",currectAns);
                            startActivity(intent);
                        }
                    }
                },1000);
            }
        });

    }

    private void setQuiz(){
        question.setText(quizLists.get(currentQuestionPosition).getQuestion());
        opt1.setText(quizLists.get(currentQuestionPosition).getOpt1());
        opt2.setText(quizLists.get(currentQuestionPosition).getOpt2());
        opt3.setText(quizLists.get(currentQuestionPosition).getOpt3());
        opt4.setText(quizLists.get(currentQuestionPosition).getOpt4());
    }
}