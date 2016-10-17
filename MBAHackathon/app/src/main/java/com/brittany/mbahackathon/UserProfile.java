package com.brittany.mbahackathon;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

/**
 * Created by Brittany on 10/13/2016.
 */

public class UserProfile extends Activity {

    private Spinner stateSelector;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.user_profile);

        stateSelector = (Spinner) findViewById(R.id.dropdown_state);

        //set up adapter for user to select state for profile
        ArrayAdapter<CharSequence> statesAdapter = ArrayAdapter.createFromResource(this, R.array.states,
                android.R.layout.simple_spinner_item);
        statesAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        stateSelector.setAdapter(statesAdapter);

        super.onCreate(savedInstanceState);

    }
}
