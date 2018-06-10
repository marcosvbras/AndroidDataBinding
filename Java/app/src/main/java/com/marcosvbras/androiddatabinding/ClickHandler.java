package com.marcosvbras.androiddatabinding;

import android.view.View;
import android.widget.Toast;

public class ClickHandler {

    public void onClick(View view, String text) {
        Toast.makeText(view.getContext(), text, Toast.LENGTH_SHORT).show();
    }

    public boolean onLongClick(View view) {
        Toast.makeText(view.getContext(), "Button Long Click", Toast.LENGTH_SHORT).show();
        return true;
    }

}
