package com.marcosvbras.androiddatabinding.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.marcosvbras.androiddatabinding.R;

public class OtherFieldsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_fields);
        getSupportActionBar().setTitle(getString(R.string.other_fields_activity));
    }
}
