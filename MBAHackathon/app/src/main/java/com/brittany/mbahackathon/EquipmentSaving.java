package com.brittany.mbahackathon;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

/**
 * Created by Brittany on 10/13/2016.
 */

public class EquipmentSaving extends Activity {

    private TextView goal, goalValue, monthlySavingText, monthlySaving, timeRemaining;
    private ProgressBar goalProgress;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.goal_detail);

        goal = (TextView) findViewById(R.id.the_goal);
        goalValue = (TextView) findViewById(R.id.tv_goal_dollar_amount);
        monthlySavingText = (TextView) findViewById(R.id.tv_current_saving);
        monthlySaving = (TextView) findViewById(R.id.tv_goal_dollar_amount2);
        goalProgress = (ProgressBar) findViewById(R.id.goal_progress_bar);
        timeRemaining = (TextView) findViewById(R.id.tv_time_remaining_time);

        updateFields();

        super.onCreate(savedInstanceState);
    }

    private void updateFields(){
        goal.setText("Surfing Equipment");
        goalValue.setText("$500");
        monthlySavingText.setText("Weekly Savings");
        monthlySaving.setText("$125.00");

//        double progress = (375/500) * 100;
//        goalProgress.setProgress((int)progress);

        goalProgress.setProgress(75);
        timeRemaining.setText("6 days");
    }

    public void viewVRTour(View v){
        startActivity(new Intent(this, VirtualTour.class));
    }
}
