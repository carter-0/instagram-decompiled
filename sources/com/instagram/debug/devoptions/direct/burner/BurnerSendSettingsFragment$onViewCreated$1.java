package com.instagram.debug.devoptions.direct.burner;

import X.0qQ;
import X.AnonymousClass00P;
import android.widget.CompoundButton;

public final class BurnerSendSettingsFragment$onViewCreated$1 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ BurnerSendSettingsFragment this$0;

    public BurnerSendSettingsFragment$onViewCreated$1(BurnerSendSettingsFragment burnerSendSettingsFragment) {
        this.this$0 = burnerSendSettingsFragment;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        BurnerSendSettingsConfig burnerSendSettingsConfig = this.this$0.sendSettingsConfig;
        if (burnerSendSettingsConfig == null) {
            0qQ.A0F("sendSettingsConfig");
            throw AnonymousClass00P.createAndThrow();
        } else {
            burnerSendSettingsConfig.isTLC = z;
        }
    }
}
