package com.instagram.barcelona.common.ui.threaddecoration;

import X.0qQ;
import X.AnonymousClass5QP;
import X.C267794cD;
import X.C288785cT;
import X.C289095d0;
import X.C52901Geb;

public final class ThreadDecorationStartOverrideModifierElement extends AnonymousClass5QP {
    public final float A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof ThreadDecorationStartOverrideModifierElement) && C289095d0.A01(this.A00, ((ThreadDecorationStartOverrideModifierElement) obj).A00));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.Geb, X.4cD] */
    public final /* bridge */ /* synthetic */ C267794cD A00() {
        float f = this.A00;
        ? r0 = new C267794cD();
        r0.A00 = f;
        return r0;
    }

    public final /* bridge */ /* synthetic */ void A01(C267794cD r3) {
        C52901Geb geb = (C52901Geb) r3;
        0qQ.A0B(geb, 0);
        float f = this.A00;
        if (!C289095d0.A01(f, geb.A00)) {
            geb.A00 = f;
            C288785cT.A00(geb);
        }
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.A00);
    }

    public ThreadDecorationStartOverrideModifierElement(float f) {
        this.A00 = f;
    }
}
