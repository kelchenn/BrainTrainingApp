package com.example.braintraining.ui.play;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.braintraining.MainActivity;
import com.example.braintraining.R;
import com.example.braintraining.Reference;
import com.example.braintraining.ui.learn.LearnActivity;

import java.util.*;

public class ReactionActivity extends AppCompatActivity {

    Button backButton;
    Button yesButton;
    Button noButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reaction);

        backButton = (Button)findViewById(R.id.backButton5);
        yesButton= (Button)findViewById(R.id.yesButton);
        noButton= (Button)findViewById(R.id.noButton);

        TextView wordColour = (TextView)findViewById(R.id.wordColour);
        TextView wordMeaning = (TextView)findViewById(R.id.wordMeaning);

        Random random = new Random();

        final MediaPlayer mp = MediaPlayer.create(this, R.raw.byebye);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Reference.switchState){
                    mp.start();
                }
                Intent intent = new Intent(ReactionActivity.this,
                        PlayActivity.class);
                startActivity(intent);
            }
        });

        int randomColourA = random.nextInt(5);
        int randomColourB = random.nextInt(5);

        int randomMeaningA = random.nextInt(5);
        int randomMeaningB = random.nextInt(5);


        switch(randomColourA)
        {
            case 0:
                wordColour.setText("blue");
                break;
            case 1:
                wordColour.setText("red");
                break;
            case 2:
                wordColour.setText("green");
                break;
            case 3:
                wordColour.setText("yellow");
                break;
            default:
                wordColour.setText("black");
        }

        switch(randomMeaningA)
        {
            case 0:
                wordColour.setTextColor(Color.BLUE);
                break;
            case 1:
                wordColour.setTextColor(Color.RED);
                break;
            case 2:
                wordColour.setTextColor(Color.GREEN);
                break;
            case 3:
                wordColour.setTextColor(Color.YELLOW);
                break;
            default:
                wordColour.setTextColor(Color.BLACK);
        }

        switch(randomColourB)
        {
            case 0:
                wordMeaning.setText("blue");
                break;
            case 1:
                wordMeaning.setText("red");
                break;
            case 2:
                wordMeaning.setText("green");
                break;
            case 3:
                wordMeaning.setText("yellow");
                break;
            default:
                wordMeaning.setText("black");
        }

        switch(randomMeaningB)
        {
            case 0:
                wordMeaning.setTextColor(Color.BLUE);
                break;
            case 1:
                wordMeaning.setTextColor(Color.RED);
                break;
            case 2:
                wordMeaning.setTextColor(Color.GREEN);
                break;
            case 3:
                wordMeaning.setTextColor(Color.YELLOW);
                break;
            default:
                wordMeaning.setTextColor(Color.BLACK);
        }


    }
}