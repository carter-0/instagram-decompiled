package com.instagram.debug.devoptions.direct.burner;

import X.00y;
import X.0qQ;
import X.AnonymousClass00P;
import X.C74369Ptj;

public final class BurnerSendThreadDetailsFragment$onViewCreated$messageCountEditText$1 implements C74369Ptj {
    public final /* synthetic */ BurnerSendThreadDetailsFragment this$0;

    public BurnerSendThreadDetailsFragment$onViewCreated$messageCountEditText$1(BurnerSendThreadDetailsFragment burnerSendThreadDetailsFragment) {
        this.this$0 = burnerSendThreadDetailsFragment;
    }

    public final void onTextChanged(String str) {
        int i;
        0qQ.A0B(str, 0);
        try {
            BurnerSendSettingsConfig burnerSendSettingsConfig = this.this$0.sendSettingsConfig;
            if (burnerSendSettingsConfig == null) {
                0qQ.A0F("sendSettingsConfig");
                throw AnonymousClass00P.createAndThrow();
            }
            Integer A0l = 00y.A0l(str);
            if (A0l != null) {
                i = A0l.intValue();
            } else {
                i = 1;
            }
            burnerSendSettingsConfig.messageCount = i;
        } catch (NumberFormatException unused) {
        }
    }
}
