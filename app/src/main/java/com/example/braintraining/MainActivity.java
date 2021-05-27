package com.example.braintraining;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.braintraining.ui.play.PlayActivity;

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
        PlayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,
                        PlayActivity.class);
                startActivity(intent);
            }
        });
    }
}