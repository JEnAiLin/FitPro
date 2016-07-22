package com.kaplan.pdma.fitpro;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class finger extends AppCompatActivity {

    int count = 0;
    Boolean done = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finger);

        final TextView StatusText = (TextView) findViewById(R.id.StatusTextView);
        final TextView TimingRemaining = (TextView) findViewById(R.id.TimeRemaining);
        final Button resetButton = (Button) findViewById(R.id.ResetButton);
        resetButton.setVisibility(View.GONE);
        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count = 0;
                done = false;
                StatusText.setText("Click on button to start");
                TimingRemaining.setText("10s");
                resetButton.setVisibility(View.GONE);
            }
        });

        Button button = (Button) findViewById(R.id.MyButton);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (!done) {
                    if (count == 0) {

                        CountDownTimer countDownTimer = new CountDownTimer(10000, 1000) {

                            public void onTick(long millisUntilFinished) {
                                TimingRemaining.setText("" + (millisUntilFinished / 1000) + "s");
                            }

                            public void onFinish() {
                                done = true;
                                StatusText.setText("You had clicked " + count + " times in 10s");
                                TimingRemaining.setText("Time's up");
                                resetButton.setVisibility(View.VISIBLE);
                            }
                        }.start();
                    }

                    StatusText.setText("clicked " + (++count) + " times");
                }
            }
        });
    }
}
