package com.instagram.debug.devoptions.zero;

import X.0qQ;
import X.0xY;
import X.0xa;
import X.AnonymousClass00P;
import X.AnonymousClass1Qz;
import X.AnonymousClass7TE;
import android.widget.CompoundButton;

public final class ZeroDevOptionsFragment$onCreate$freeModeSimulationDevOptionsItem$1 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ ZeroDevOptionsFragment this$0;

    public ZeroDevOptionsFragment$onCreate$freeModeSimulationDevOptionsItem$1(ZeroDevOptionsFragment zeroDevOptionsFragment) {
        this.this$0 = zeroDevOptionsFragment;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        String str;
        0xa r0 = this.this$0.sharedPreferences;
        if (r0 == null) {
            0qQ.A0F("sharedPreferences");
            throw AnonymousClass00P.createAndThrow();
        }
        0xY AR4 = r0.AR4();
        AR4.E5T("free_mode_simulation", z);
        AR4.apply();
        AnonymousClass1Qz.A00(AnonymousClass7TE.A0l(this.this$0.session$delegate)).AWJ("manual", true);
        if (z) {
            str = "Free mode enabled!";
        } else {
            str = "Free mode disabled!";
        }
        this.this$0.showAlertDialog(str, "Restart the App for this change to take effect on the UI");
    }
}
