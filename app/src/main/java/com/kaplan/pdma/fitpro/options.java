package com.kaplan.pdma.fitpro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class options extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);

        Button basic = (Button) findViewById(R.id.basic); //linking pages
        basic.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent intentBasic = new Intent(getApplicationContext(),
                        ActivityStart.class);
                startActivity(intentBasic);
                Toast.makeText(options.this, "Basic yet Effective", Toast.LENGTH_SHORT).show();
            }
        });

        Button other = (Button) findViewById(R.id.other); //linking pages
        other.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent intentOther = new Intent(getApplicationContext(),
                        other.class);
                startActivity(intentOther);
                Toast.makeText(options.this, "Other Effective Choices", Toast.LENGTH_SHORT).show();
            }
        });

        Button men = (Button) findViewById(R.id.men); //linking pages
        men.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent intentMen = new Intent(getApplicationContext(),
                        men.class);
                startActivity(intentMen);
                Toast.makeText(options.this, "More Men's Fitness Info", Toast.LENGTH_SHORT).show();
            }
        });

        Button women = (Button) findViewById(R.id.women); //linking pages
        women.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent intentWomen = new Intent(getApplicationContext(),
                        women.class);
                startActivity(intentWomen);
                Toast.makeText(options.this, "More Women's Fitness Info", Toast.LENGTH_SHORT).show();
            }
        });

        Button bmi = (Button) findViewById(R.id.bmi); //linking pages
        bmi.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent intentBmi = new Intent(getApplicationContext(),
                        bmi.class);
                startActivity(intentBmi);
                Toast.makeText(options.this, "Body Mass Index Indicator", Toast.LENGTH_SHORT).show();
            }
        });

        Button finger = (Button) findViewById(R.id.finger); //linking pages
        finger.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent intentFinger = new Intent(getApplicationContext(),
                        finger.class);
                startActivity(intentFinger);
                Toast.makeText(options.this, "Stress Reliever via Finger Movement", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
