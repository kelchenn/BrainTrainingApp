package com.example.braintraining.ui.play;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.braintraining.MainActivity;
import com.example.braintraining.R;
import com.example.braintraining.Reference;

public class PlayActivity extends AppCompatActivity {

    Button backButton;
    Button triviaButton;
    Button riddlesButton;
    Button reactionButton;
    Button colourButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        backButton = (Button)findViewById(R.id.backButton);
        triviaButton = (Button)findViewById(R.id.triviaButton);
        reactionButton = (Button)findViewById(R.id.reactionButton);
        colourButton = (Button)findViewById(R.id.colourButton);


        riddlesButton = findViewById(R.id.riddlesButton);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.byebye);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Reference.switchState){
                    mp.start();
                }
                Intent intent = new Intent(PlayActivity.this,
                        MainActivity.class);
                startActivity(intent);
            }
        });

        triviaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlayActivity.this,
                        TriviaActivity.class);
                startActivity(intent);
            }
        });

        reactionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlayActivity.this,
                        ReactionActivity.class);
                startActivity(intent);
            }
        });

        riddlesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlayActivity.this,
                        RiddleActivity.class);
                startActivity(intent);
            }
        });

        colourButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlayActivity.this,
                        ColourActivity.class);
                startActivity(intent);
            }
        });
    }
}