package com.kaplan.pdma.fitpro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityPushup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pushup);

        Button button1 = (Button) findViewById(R.id.buttonBack1);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                finish(); //terminates the screen
            }
        });
    }
}
