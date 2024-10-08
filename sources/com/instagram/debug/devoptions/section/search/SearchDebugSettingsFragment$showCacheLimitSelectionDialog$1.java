package com.instagram.debug.devoptions.section.search;

import X.0sP;
import android.content.DialogInterface;
import android.widget.NumberPicker;

public final class SearchDebugSettingsFragment$showCacheLimitSelectionDialog$1 implements DialogInterface.OnClickListener {
    public final /* synthetic */ 0sP $limitChangeListener;
    public final /* synthetic */ NumberPicker $numberPicker;

    public SearchDebugSettingsFragment$showCacheLimitSelectionDialog$1(0sP r1, NumberPicker numberPicker) {
        this.$limitChangeListener = r1;
        this.$numberPicker = numberPicker;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.$limitChangeListener.invoke(Integer.valueOf(this.$numberPicker.getValue()));
    }
}
