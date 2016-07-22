package com.kaplan.pdma.fitpro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ActivityLegraise extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legraise);

        Toast.makeText(ActivityLegraise.this, "Leg Raise", Toast.LENGTH_SHORT).show();

        Button button3 = (Button) findViewById(R.id.buttonBack3);
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                finish(); //terminates the screen
            }
        });
    }
}
