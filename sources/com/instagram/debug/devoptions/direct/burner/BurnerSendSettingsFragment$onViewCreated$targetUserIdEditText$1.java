package com.instagram.debug.devoptions.direct.burner;

import X.0qQ;
import X.AnonymousClass00P;
import X.C74369Ptj;

public final class BurnerSendSettingsFragment$onViewCreated$targetUserIdEditText$1 implements C74369Ptj {
    public final /* synthetic */ BurnerSendSettingsFragment this$0;

    public BurnerSendSettingsFragment$onViewCreated$targetUserIdEditText$1(BurnerSendSettingsFragment burnerSendSettingsFragment) {
        this.this$0 = burnerSendSettingsFragment;
    }

    public final void onTextChanged(String str) {
        0qQ.A0B(str, 0);
        BurnerSendSettingsConfig burnerSendSettingsConfig = this.this$0.sendSettingsConfig;
        if (burnerSendSettingsConfig == null) {
            0qQ.A0F("sendSettingsConfig");
            throw AnonymousClass00P.createAndThrow();
        } else {
            burnerSendSettingsConfig.targetUserId = str;
        }
    }
}
