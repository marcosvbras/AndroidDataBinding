package com.marcosvbras.androiddatabinding.activities;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.marcosvbras.androiddatabinding.R;
import com.marcosvbras.androiddatabinding.databinding.ActivityLampBinding;
import com.marcosvbras.androiddatabinding.helpers.Lamp;

public class LampActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityLampBinding activityLampBinding = DataBindingUtil.setContentView(this, R.layout.activity_lamp);
        activityLampBinding.setLamp(new Lamp());
        getSupportActionBar().setTitle(getString(R.string.button_lamp));
    }
}
