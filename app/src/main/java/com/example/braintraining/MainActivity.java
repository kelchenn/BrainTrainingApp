package com.example.braintraining;

// Imports
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.braintraining.ui.learn.LearnActivity;
import com.example.braintraining.ui.play.PlayActivity;
import com.example.braintraining.ui.settings.SettingsActivity;

public class MainActivity extends AppCompatActivity{

    TextView appName;
    Button playButton;
    Button learnButton;
    Button settingsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playButton = (Button)findViewById(R.id.playButton);
        learnButton = (Button)findViewById(R.id.learnButton);
        settingsButton = (Button)findViewById(R.id.settingsButton);

        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,
                        PlayActivity.class);
                startActivity(intent);
            }
        });

        learnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,
                        LearnActivity.class);
                startActivity(intent);
            }
        });

        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,
                        SettingsActivity.class);
                startActivity(intent);
            }
        });
    }
}