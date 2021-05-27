package com.example.braintraining.ui.learn;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.braintraining.MainActivity;
import com.example.braintraining.R;
import com.example.braintraining.ui.play.PlayActivity;

public class LearnActivity extends AppCompatActivity {

    Button BackButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);

        BackButton = (Button)findViewById(R.id.backButton2);

        BackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LearnActivity.this,
                        MainActivity.class);
                startActivity(intent);
            }
        });
    }
}