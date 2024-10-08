package com.instagram.barcelona.common.ui.threaddecoration;

import X.0qQ;
import X.AnonymousClass5QP;
import X.C267794cD;
import X.C288785cT;
import X.C51966G9m;
import X.C52900Gea;

public final class ThreadDecorationModifierElement extends AnonymousClass5QP {
    public final Integer A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof ThreadDecorationModifierElement) && this.A00 == ((ThreadDecorationModifierElement) obj).A00);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.4cD, X.Gea] */
    public final /* bridge */ /* synthetic */ C267794cD A00() {
        Integer num = this.A00;
        0qQ.A0B(num, 1);
        ? r0 = new C267794cD();
        r0.A00 = num;
        return r0;
    }

    public final /* bridge */ /* synthetic */ void A01(C267794cD r3) {
        C52900Gea gea = (C52900Gea) r3;
        0qQ.A0B(gea, 0);
        Integer num = this.A00;
        0qQ.A0B(num, 0);
        if (num != gea.A00) {
            gea.A00 = num;
            C288785cT.A00(gea);
        }
    }

    public final int hashCode() {
        String str;
        int intValue = this.A00.intValue();
        switch (intValue) {
            case 1:
                str = "Start";
                break;
            case 2:
                str = "Middle";
                break;
            case 3:
                str = "Loop";
                break;
            case 4:
                str = "End";
                break;
            default:
                str = "None";
                break;
        }
        return C51966G9m.A04(str, intValue);
    }

    public ThreadDecorationModifierElement(Integer num) {
        this.A00 = num;
    }
}
