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
import com.example.braintraining.ui.learn.LearnActivity;

public class ReactionActivity extends AppCompatActivity {

    Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reaction);

        backButton = (Button)findViewById(R.id.backButton5);
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
    }
}