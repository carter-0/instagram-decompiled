package com.instagram.debug.devoptions.direct.burner;

import X.0Yg;
import X.0qQ;
import X.0sP;
import X.AnonymousClass00P;
import X.C60340gF;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsConfig;

public final class BurnerSendThreadDetailsFragment$onViewCreated$2 extends 0Yg implements 0sP {
    public final /* synthetic */ BurnerSendThreadDetailsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BurnerSendThreadDetailsFragment$onViewCreated$2(BurnerSendThreadDetailsFragment burnerSendThreadDetailsFragment) {
        super(1);
        this.this$0 = burnerSendThreadDetailsFragment;
    }

    public final void invoke(BurnerSendSettingsConfig.MessageType messageType) {
        0qQ.A0B(messageType, 0);
        BurnerSendSettingsConfig burnerSendSettingsConfig = this.this$0.sendSettingsConfig;
        if (burnerSendSettingsConfig == null) {
            0qQ.A0F("sendSettingsConfig");
            throw AnonymousClass00P.createAndThrow();
        } else {
            burnerSendSettingsConfig.messageType = messageType;
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((BurnerSendSettingsConfig.MessageType) obj);
        return C60340gF.A00;
    }
}
