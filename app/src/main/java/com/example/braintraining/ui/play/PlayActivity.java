package com.example.braintraining.ui.play;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.braintraining.MainActivity;
import com.example.braintraining.R;

public class PlayActivity extends AppCompatActivity {

    Button BackButton;
    Button TriviaButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        BackButton = (Button)findViewById(R.id.backButton);
        TriviaButton = (Button)findViewById(R.id.triviaButton);

        BackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlayActivity.this,
                        MainActivity.class);
                startActivity(intent);
            }
        });

        TriviaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlayActivity.this,
                        TriviaActivity.class);
                startActivity(intent);
            }
        });
    }
}