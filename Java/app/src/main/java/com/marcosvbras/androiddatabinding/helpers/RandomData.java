package com.marcosvbras.androiddatabinding.helpers;

import android.databinding.ObservableBoolean;
import android.databinding.ObservableField;

public class RandomData {

    public final ObservableField<String> name = new ObservableField<>("Marcos Vinícius");
    public final ObservableBoolean single = new ObservableBoolean(true);

}
