package com.kaplan.pdma.fitpro;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;

public class ActivityStart extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.running);

        Switch sw = (Switch) findViewById(R.id.switch1);
        //  https://developer.android.com/guide/topics/ui/controls/togglebutton.html
        sw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b) {
                    mediaPlayer.start();
                } else {
                    mediaPlayer.pause();
                }
            }
        });

        Button situp = (Button) findViewById(R.id.situp);
        situp.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intentSit = new Intent(getApplicationContext(),
                        ActivitySit.class);
                startActivity(intentSit);

            }
        });

        Button pushup = (Button) findViewById(R.id.pushup);
        pushup.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intentPushUp = new Intent(getApplicationContext(),
                        ActivityPushup.class);
                startActivity(intentPushUp);

            }
        });

        Button jumpjack = (Button) findViewById(R.id.jumpjack);
        jumpjack.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intentJumpjack = new Intent(getApplicationContext(),
                        ActivityJumpjack.class);
                startActivity(intentJumpjack);

            }
        });

        Button legraise = (Button) findViewById(R.id.legraise);
        legraise.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intentLegraise = new Intent(getApplicationContext(),
                        ActivityLegraise.class);
                startActivity(intentLegraise);

            }
        });
    }
}
