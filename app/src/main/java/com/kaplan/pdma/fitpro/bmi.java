package com.kaplan.pdma.fitpro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class bmi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);

        final TextView textViewStatus = (TextView) findViewById(R.id.textViewStatus);
        final EditText editTextWeight = (EditText) findViewById(R.id.editTextWeight);
        final EditText editTextHeight = (EditText) findViewById(R.id.editTextHeight);
        Button button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //get the values of weight and height and validate the values
                String weightString = editTextWeight.getText().toString();
                String heightString = editTextHeight.getText().toString();
                double weight = 0, height = 0;
                try {
                    weight = Double.parseDouble(weightString);
                    height = Double.parseDouble(heightString);
                } catch(NumberFormatException ex) {
                    Toast.makeText(getApplicationContext(), "input error",
                            Toast.LENGTH_SHORT).show();
                    return;
                }

                // calculate the BMI
                double bmi = 0;
                if(height > 0) {
                    bmi = (weight) / (height/100 * height/100);
                }

                // display status accordingly
                String status =  getStatus(bmi);
                textViewStatus.setText(status);

            }
        });


    }

    private String getStatus(double bmi) {
        String status;
        if(bmi >= 30) {
            status = "Obese";
        } else if(bmi >= 25) {
            status = "Overweight";
        } else if(bmi >= 18.5) {
            status = "Healthy";
        } else {
            status = "Underweight";
        }

        return status;
    }
}
