package com.example.braintraining.ui.play;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

import com.example.braintraining.R;
import com.example.braintraining.Reference;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class RiddleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_riddle);

        Button backButton;
        Button answer1;
        Button answer2;
        Button answer3;
        Button answer4;
        Random random = new Random();

        String[] riddleQuestions = new String[5];
        riddleQuestions[0] = "question 1";
        riddleQuestions[1] = "question 2";
        riddleQuestions[2] = "question 3";
        riddleQuestions[3] = "question 4";
        riddleQuestions[4] = "question 5";

        String[][] riddleAnswers = new String[5][4];
        riddleAnswers[0][0] = "q1a1";
        riddleAnswers[0][1] = "q1a2";
        riddleAnswers[0][2] = "q1a3";
        riddleAnswers[0][3] = "q1a4";
        riddleAnswers[1][0] = "q2a1";
        riddleAnswers[1][1] = "q2a2";
        riddleAnswers[1][2] = "q2a3";
        riddleAnswers[1][3] = "q2a4";
        riddleAnswers[2][0] = "q3a1";
        riddleAnswers[2][1] = "q3a2";
        riddleAnswers[2][2] = "q3a3";
        riddleAnswers[2][3] = "q3a4";
        riddleAnswers[3][0] = "q4a1";
        riddleAnswers[3][1] = "q4a2";
        riddleAnswers[3][2] = "q4a3";
        riddleAnswers[3][3] = "q4a4";
        riddleAnswers[4][0] = "q5a1";
        riddleAnswers[4][1] = "q5a2";
        riddleAnswers[4][2] = "q5a3";
        riddleAnswers[4][3] = "q5a4";

        int riddleQuestionNumber = random.nextInt(5);
        TextView textRiddle = findViewById(R.id.textRiddles);
        textRiddle.setText(riddleQuestions[riddleQuestionNumber]);
        answer1 = findViewById(R.id.buttonRiddlesA1);
        answer1.setText(riddleAnswers[riddleQuestionNumber][0]);
        answer2 = findViewById(R.id.buttonRiddlesA2);
        answer2.setText(riddleAnswers[riddleQuestionNumber][1]);
        answer3 = findViewById(R.id.buttonRiddlesA3);
        answer3.setText(riddleAnswers[riddleQuestionNumber][2]);
        answer4 = findViewById(R.id.buttonRiddlesA4);
        answer4.setText(riddleAnswers[riddleQuestionNumber][3]);



        backButton = (Button)findViewById(R.id.backButton4);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.byebye);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Reference.switchState){
                    mp.start();
                }
                Intent intent = new Intent(RiddleActivity.this,
                        PlayActivity.class);
                startActivity(intent);
            }
        });

    }
}