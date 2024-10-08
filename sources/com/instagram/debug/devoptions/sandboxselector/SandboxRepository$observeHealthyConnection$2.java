package com.instagram.debug.devoptions.sandboxselector;

import X.0Yk;
import X.0sL;
import X.AnonymousClass4D7;
import X.C60340gF;

public final /* synthetic */ class SandboxRepository$observeHealthyConnection$2 extends 0Yk implements 0sL {
    public SandboxRepository$observeHealthyConnection$2(Object obj) {
        super(2, obj, SandboxPreferences.class, "updateServerHealthStatus", "updateServerHealthStatus(Lcom/instagram/debug/devoptions/sandboxselector/IgServerHealth;)V", 4);
    }

    public final Object invoke(IgServerHealth igServerHealth, AnonymousClass4D7 r3) {
        ((SandboxPreferences) this.receiver).updateServerHealthStatus(igServerHealth);
        return C60340gF.A00;
    }
}
