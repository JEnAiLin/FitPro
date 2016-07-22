package com.kaplan.pdma.fitpro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class other extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);

        ListView listView = (ListView) findViewById(R.id.listView);
        final ArrayList<String> otherList = new ArrayList<String>();

        otherList.add("Lower Body - Glute-Up");
        otherList.add("Lower Body - Leg Lift With Exercise Ball");
        otherList.add("Lower Body - Hanging Run in Place");
        otherList.add("Lower Body - Hanging Knee Raise");
        otherList.add("Lower Body - Reverse Crunch on Incline Board");
        otherList.add("Lower Body - Scissor Kick");
        otherList.add("Lower Body - Hanging Leg Raise");
        otherList.add("Upper Body - Supported Crunch");
        otherList.add("Upper Body - Exercise-Ball Crunch");
        otherList.add("Upper Body - Tuck Crunch");
        otherList.add("Upper Body - Straight Leg Crunch");
        otherList.add("Upper Body - Decline-Bench Crunch");
        otherList.add("Upper Body - Medicine-Ball Crunch");
        otherList.add("Upper Body - Lying Cable Crunch");
        otherList.add("Obliques - Medicine-Ball Twist");
        otherList.add("Obliques - Side Bend");
        otherList.add("Obliques - Standing Rotation");
        otherList.add("Obliques - Rotary Machine Twist");
        otherList.add("Obliques - Side Leg Raise");
        otherList.add("Obliques - Exercise-Ball Twist");
        otherList.add("Obliques - Cable Woodchop");
        otherList.add("Combos - Double Crunch");
        otherList.add("Combos - Scissor to a Crunch");
        otherList.add("Combos - Crossover Split-Leg Crunch");
        otherList.add("Combos - Figure 4 Crunch");
        otherList.add("Combos - Crossover Tuck Crunch");
        otherList.add("Combos - V-Up");
        otherList.add("Combos - Reverse Oblique Crunch");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, otherList);

        listView.setAdapter(arrayAdapter);
    }
}
