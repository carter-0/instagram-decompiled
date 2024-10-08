package com.instagram.debug.devoptions.direct.burner;

import X.0qQ;
import X.AnonymousClass00P;
import X.C74369Ptj;

public final class BurnerSendThreadDetailsFragment$onViewCreated$bulkIdEditText$1 implements C74369Ptj {
    public final /* synthetic */ BurnerSendThreadDetailsFragment this$0;

    public BurnerSendThreadDetailsFragment$onViewCreated$bulkIdEditText$1(BurnerSendThreadDetailsFragment burnerSendThreadDetailsFragment) {
        this.this$0 = burnerSendThreadDetailsFragment;
    }

    public final void onTextChanged(String str) {
        0qQ.A0B(str, 0);
        try {
            BurnerSendSettingsConfig burnerSendSettingsConfig = this.this$0.sendSettingsConfig;
            if (burnerSendSettingsConfig == null) {
                0qQ.A0F("sendSettingsConfig");
                throw AnonymousClass00P.createAndThrow();
            } else {
                burnerSendSettingsConfig.buckId = str;
            }
        } catch (NumberFormatException unused) {
        }
    }
}
