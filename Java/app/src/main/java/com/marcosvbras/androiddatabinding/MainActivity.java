package com.marcosvbras.androiddatabinding;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

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
    }
}
