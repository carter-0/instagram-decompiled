package com.instagram.debug.devoptions.section.newusernux;

import X.C48155EZx;
import X.FET;
import android.widget.CompoundButton;

public final class NuxSelectionFragment$onCreateView$3 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ C48155EZx $step;

    public NuxSelectionFragment$onCreateView$3(C48155EZx eZx) {
        this.$step = eZx;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        FET.A02.put(this.$step, Boolean.valueOf(z));
    }
}
