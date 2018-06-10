package com.marcosvbras.androiddatabinding.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.marcosvbras.androiddatabinding.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button_simple).setOnClickListener(click -> {
            startActivity(new Intent(this, SimpleActivity.class));
        });

        findViewById(R.id.button_handler).setOnClickListener(click -> {
            startActivity(new Intent(this, ClickHandlerActivity.class));
        });

        findViewById(R.id.button_observable).setOnClickListener(click -> {
            startActivity(new Intent(this, ObservableObjectsActivity.class));
        });
    }
}
