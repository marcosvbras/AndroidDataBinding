package com.marcosvbras.androiddatabinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.marcosvbras.androiddatabinding.databinding.ActivityClickHandlerBinding;

public class ClickHandlerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityClickHandlerBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_click_handler);
        binding.setClickHandler(new ClickHandler());
        binding.setExample(new ExampleObject("Button Click"));
    }
}
