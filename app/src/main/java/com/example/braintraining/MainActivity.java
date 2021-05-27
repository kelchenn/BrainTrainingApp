package com.example.braintraining;

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

    TextView AppName;
    Button PlayButton;
    Button LearnButton;
    Button SettingsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PlayButton = (Button)findViewById(R.id.playButton);
        LearnButton = (Button)findViewById(R.id.learnButton);
        SettingsButton = (Button)findViewById(R.id.settingsButton);

        PlayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,
                        PlayActivity.class);
                startActivity(intent);
            }
        });

        LearnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,
                        LearnActivity.class);
                startActivity(intent);
            }
        });

        SettingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,
                        SettingsActivity.class);
                startActivity(intent);
            }
        });
    }
}