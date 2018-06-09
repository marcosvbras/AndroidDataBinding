package com.marcosvbras.androiddatabinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.marcosvbras.androiddatabinding.databinding.ActivitySimpleBinding;

public class SimpleActivity extends AppCompatActivity {

    private ActivitySimpleBinding activitySimpleBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activitySimpleBinding = DataBindingUtil.setContentView(this, R.layout.activity_simple);
        activitySimpleBinding.setText(new Text("Hello Data Binding World!"));
    }
}
