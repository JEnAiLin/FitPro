package com.kaplan.pdma.fitpro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityJumpjack extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jumpjack);

        Button button4 = (Button) findViewById(R.id.buttonBack4);
        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                finish(); //terminates the screen
            }
        });

    }
}
