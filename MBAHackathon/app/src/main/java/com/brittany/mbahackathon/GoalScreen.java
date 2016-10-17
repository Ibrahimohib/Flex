package com.brittany.mbahackathon;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by Brittany on 10/13/2016.
 */

public class GoalScreen extends Activity {

    private ImageView apartment;
    private ImageView equipment;
    private ImageView vacation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.goal_screen);

        apartment = (ImageView) findViewById(R.id.goal1);
        equipment = (ImageView) findViewById(R.id.goal2);
        vacation = (ImageView) findViewById(R.id.goal3);

        setListeners();

        super.onCreate(savedInstanceState);
    }

    private void setListeners(){
        apartment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GoalScreen.this, ApartmentSaving.class));
            }
        });

        equipment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GoalScreen.this, EquipmentSaving.class));
            }
        });

        vacation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GoalScreen.this, VacationSaving.class));
            }
        });
    }
}
