package com.dryganets.core.binding;

import android.arch.lifecycle.LiveData;
import android.databinding.BindingConversion;
import android.view.View;

public class BindingConverters {
    @BindingConversion
    public static int convertBooleanToVisibility(boolean visible) {
        return visible ? View.VISIBLE : View.GONE;
    }

    @BindingConversion
    public static int convertBooleanToVisibility(LiveData<Boolean> visible) {
        return visible.getValue() ? View.VISIBLE : View.GONE;
    }
}
