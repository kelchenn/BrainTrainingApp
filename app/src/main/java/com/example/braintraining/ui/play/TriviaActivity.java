package com.example.braintraining.ui.play;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.braintraining.MainActivity;
import com.example.braintraining.R;
import com.example.braintraining.ui.settings.SettingsActivity;

import java.util.*;

public class TriviaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trivia);

        Button backButton;
        Random random = new Random();

        String[] triviaQuestions = new String[5];
        triviaQuestions[0] = "question 1";
        triviaQuestions[1] = "question 2";
        triviaQuestions[2] = "question 3";
        triviaQuestions[3] = "question 4";
        triviaQuestions[4] = "question 5";

        int triviaQuestionNumber = random.nextInt(5);

        TextView textTrivia = (TextView)findViewById(R.id.textTrivia);
        textTrivia.setText(triviaQuestions[triviaQuestionNumber]);

        EditText triviaInput = (EditText) findViewById(R.id.triviaEditText);
        String triviaAnswer = triviaInput.getText().toString();

        backButton = (Button)findViewById(R.id.backButton4);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TriviaActivity.this,
                        PlayActivity.class);
                startActivity(intent);
            }
        });
    }
}