package com.kaplan.pdma.fitpro;

import android.app.ActivityOptions;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button options = (Button) findViewById(R.id.options1);
        options.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intentOptions = new Intent(getApplicationContext(),
                        options.class);
                startActivity(intentOptions);

            }
        });
    }
}
