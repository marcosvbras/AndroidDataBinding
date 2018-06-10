package com.marcosvbras.androiddatabinding.helpers;

import android.databinding.ObservableBoolean;

public class Lamp {

    public ObservableBoolean on = new ObservableBoolean(false);

    public void onLampClick() {
        on.set(!on.get());
    }

}
