package com.instagram.debug.devoptions.zero;

import X.0qQ;
import X.0xY;
import X.0xa;
import X.AnonymousClass00P;
import X.Pxd;
import android.widget.CompoundButton;

public final class ZbdDevOptionsFragment$onCreate$zeroBalanceSimulationToggle$1 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ ZbdDevOptionsFragment this$0;

    public ZbdDevOptionsFragment$onCreate$zeroBalanceSimulationToggle$1(ZbdDevOptionsFragment zbdDevOptionsFragment) {
        this.this$0 = zbdDevOptionsFragment;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        0xa r0 = this.this$0.sharedPreferences;
        if (r0 == null) {
            0qQ.A0F("sharedPreferences");
            throw AnonymousClass00P.createAndThrow();
        }
        0xY AR4 = r0.AR4();
        AR4.E5T(Pxd.A00(294), z);
        AR4.commit();
    }
}
