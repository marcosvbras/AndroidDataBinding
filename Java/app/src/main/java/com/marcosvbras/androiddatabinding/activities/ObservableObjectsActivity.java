package com.marcosvbras.androiddatabinding.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.marcosvbras.androiddatabinding.R;

public class ObservableObjectsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_observable_objects);
        getSupportActionBar().setTitle(getString(R.string.observable_objects_activity));

        findViewById(R.id.button_other_fields).setOnClickListener(click -> {
            startActivity(new Intent(this, OtherFieldsActivity.class));
        });

        findViewById(R.id.button_lamp).setOnClickListener(click -> {
            startActivity(new Intent(this, LampActivity.class));
        });
    }
}
