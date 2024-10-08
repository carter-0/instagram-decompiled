package com.instagram.debug.devoptions.direct.burner;

import X.0Yg;
import X.0sP;
import X.AnonymousClass2Ep;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C331057Pi;
import X.C51968G9o;
import X.C60340gF;

public final class BurnerSendSettingsHelper$Companion$ensureCutover$1$1 extends 0Yg implements 0sP {
    public final /* synthetic */ 0sP $callback;
    public final /* synthetic */ AnonymousClass2Ep $directThread;
    public final /* synthetic */ boolean $isTLC;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BurnerSendSettingsHelper$Companion$ensureCutover$1$1(0sP r2, AnonymousClass2Ep r3, boolean z) {
        super(1);
        this.$callback = r2;
        this.$directThread = r3;
        this.$isTLC = z;
    }

    public final void invoke(boolean z) {
        C51968G9o.A1O(this.$callback, AnonymousClass7TF.A1S(C331057Pi.A02(this.$directThread.AiM()) ? 1 : 0, this.$isTLC ? 1 : 0));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(AnonymousClass7TE.A1a(obj));
        return C60340gF.A00;
    }
}
