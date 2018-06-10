package com.marcosvbras.androiddatabinding.activities;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.marcosvbras.androiddatabinding.helpers.ExampleObject;
import com.marcosvbras.androiddatabinding.R;
import com.marcosvbras.androiddatabinding.databinding.ActivitySimpleBinding;

public class SimpleActivity extends AppCompatActivity {

    private ActivitySimpleBinding activitySimpleBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activitySimpleBinding = DataBindingUtil.setContentView(this, R.layout.activity_simple);
        getSupportActionBar().setTitle(getString(R.string.simple_activity_title));
        activitySimpleBinding.setExample(new ExampleObject("Hello Data Binding World!"));
    }
}
