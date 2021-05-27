package com.example.braintraining.ui.settings;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.braintraining.MainActivity;
import com.example.braintraining.R;
import com.example.braintraining.ui.play.PlayActivity;

public class SettingsActivity extends AppCompatActivity {

    Button BackButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        BackButton = (Button)findViewById(R.id.backButton3);

        BackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SettingsActivity.this,
                        MainActivity.class);
                startActivity(intent);
            }
        });
    }
}