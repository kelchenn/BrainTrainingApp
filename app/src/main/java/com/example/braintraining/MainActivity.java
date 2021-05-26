package com.example.braintraining;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.braintraining.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity{

    TextView AppName;
    Button PlayButton;
    Button LearnButton;
    Button SettingsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppName = findViewById(R.id.appName);
        PlayButton = findViewById(R.id.playButton);
        LearnButton = findViewById(R.id.learnButton);
        SettingsButton = findViewById(R.id.settingsButton);

        PlayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppName.setText("The Button was Clicked!");

            }
        });
    }

}