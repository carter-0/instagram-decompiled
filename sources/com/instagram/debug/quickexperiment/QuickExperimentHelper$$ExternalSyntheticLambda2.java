package com.instagram.debug.quickexperiment;

import X.0lg;
import X.0yN;
import X.2Ru;
import X.PR9;
import android.widget.CompoundButton;
import com.instagram.debug.quickexperiment.storage.QuickExperimentDebugStore;

public final /* synthetic */ class QuickExperimentHelper$$ExternalSyntheticLambda2 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ 0yN f$0;
    public final /* synthetic */ QuickExperimentDebugStore f$1;
    public final /* synthetic */ PR9 f$2;
    public final /* synthetic */ 0lg f$3;
    public final /* synthetic */ 2Ru f$4;

    public /* synthetic */ QuickExperimentHelper$$ExternalSyntheticLambda2(0yN r1, QuickExperimentDebugStore quickExperimentDebugStore, PR9 pr9, 0lg r4, 2Ru r5) {
        this.f$0 = r1;
        this.f$1 = quickExperimentDebugStore;
        this.f$2 = pr9;
        this.f$3 = r4;
        this.f$4 = r5;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        QuickExperimentHelper.lambda$createSwitchItem$2(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, compoundButton, z);
    }
}
