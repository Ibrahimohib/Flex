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

public class ApartmentSaving extends Activity {

    private TextView goal, goalValue, monthlySaving, timeRemaining;
    private ProgressBar goalProgress;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.goal_detail);

        goal = (TextView) findViewById(R.id.the_goal);
        goalValue = (TextView) findViewById(R.id.tv_goal_dollar_amount);
        monthlySaving = (TextView) findViewById(R.id.tv_goal_dollar_amount2);
        goalProgress = (ProgressBar) findViewById(R.id.goal_progress_bar);
        timeRemaining = (TextView) findViewById(R.id.tv_time_remaining_time);

        updateFields();

        super.onCreate(savedInstanceState);
    }

    private void updateFields(){
        goal.setText("New Apartment");
        goalValue.setText("$30,000");
        monthlySaving.setText("$583.34");

//        double progress = 23000/30000;
//        goalProgress.setProgress((int) progress * 100);

        goalProgress.setProgress(76);
        timeRemaining.setText("1 year");
    }

    public void viewVRTour(View v){
        startActivity(new Intent(this, VirtualTour.class));
    }
}
