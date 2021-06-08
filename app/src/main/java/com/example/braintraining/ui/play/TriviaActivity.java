package com.example.braintraining.ui.play;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Handler;

import com.example.braintraining.MainActivity;
import com.example.braintraining.R;
import com.example.braintraining.Reference;

import java.util.*;

public class TriviaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trivia);

        Button backButton;
        Button enterButton;
        Random random = new Random();
        final Handler handler = new Handler();

        String[] triviaQuestions = new String[5];
        triviaQuestions[0] = "question 1";
        triviaQuestions[1] = "question 2";
        triviaQuestions[2] = "question 3";
        triviaQuestions[3] = "question 4";
        triviaQuestions[4] = "question 5";

        String[] triviaAnswers = new String[5];
        triviaAnswers[0] = "answer 1";
        triviaAnswers[1] = "answer 2";
        triviaAnswers[2] = "answer 3";
        triviaAnswers[3] = "answer 4";
        triviaAnswers[4] = "answer 5";

        final boolean[] clickedButton = {false};

        int triviaQuestionNumber = random.nextInt(5);

        TextView textTrivia = (TextView)findViewById(R.id.textTrivia);
        textTrivia.setText(triviaQuestions[triviaQuestionNumber]);

        EditText triviaInput = (EditText) findViewById(R.id.triviaEditText);

        TextView responseText = (TextView)findViewById(R.id.responseText);

        enterButton = (Button)findViewById(R.id.enterButton);

        String response = getString(R.string.text_incorrect) + " " + triviaAnswers[triviaQuestionNumber];

        enterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String triviaUserAnswer = triviaInput.getText().toString();
                if (triviaUserAnswer.equals(triviaAnswers[triviaQuestionNumber])) {
                    responseText.setText(R.string.text_correct);
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            finish();
                            startActivity(getIntent());
                        }
                    }, 2000);
                } else {
                    responseText.setText(response);
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            finish();
                            startActivity(getIntent());
                        }
                    }, 4000);
                }
            }
        });

        backButton = (Button)findViewById(R.id.backButton4);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.byebye);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Reference.switchState){
                    mp.start();
                }
                Intent intent = new Intent(TriviaActivity.this,
                        PlayActivity.class);
                startActivity(intent);
            }
        });
    }
}