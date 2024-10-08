package com.instagram.zero.dogfooding;

import X.05G;
import X.0Tu;
import X.0lg;
import X.0qQ;
import X.0xn;
import X.182;
import X.19B;
import X.19E;
import X.1Eo;
import X.1RA;
import X.AnonymousClass05K;
import X.AnonymousClass0lh;
import X.AnonymousClass12W;
import X.AnonymousClass19S;
import X.AnonymousClass1R9;
import X.AnonymousClass3OC;
import X.AnonymousClass4D7;
import X.C262204Co;
import X.C376899Jt;
import X.C58686Ivv;
import java.util.concurrent.CancellationException;

public final class IgZeroDogfoodingInit implements AnonymousClass0lh {
    public final 0lg A00;
    public final C262204Co A01;

    public IgZeroDogfoodingInit(0lg r29) {
        Object value;
        boolean z;
        Object value2;
        Object value3;
        0lg r1 = r29;
        0qQ.A0B(r1, 1);
        this.A00 = r1;
        boolean z2 = 0xn.A01("ig_zero_dogfooding_device").getBoolean("manually_changed", false);
        05G r2 = AnonymousClass1R9.A03.A01;
        do {
            value = r2.getValue();
        } while (!r2.AIY(value, 1RA.A02((1RA) value, (Integer) null, (String) null, 0, 0, 1791, 0, 0, false, false, false, false, z2)));
        if (z2) {
            boolean z3 = 0xn.A01("ig_zero_dogfooding_device").getBoolean("enabled", false);
            do {
                value3 = r2.getValue();
            } while (!r2.AIY(value3, 1RA.A01((1RA) value3, (Integer) null, 2046, z3, false)));
        } else {
            0lg r5 = this.A00;
            if (AnonymousClass3OC.A00 != null) {
                z = 182.A06(0Tu.A05, r5, 36328255023955096L);
            } else {
                z = false;
            }
            do {
                value2 = r2.getValue();
            } while (!r2.AIY(value2, 1RA.A02((1RA) value2, (Integer) null, (String) null, 0, 0, 2046, 0, 0, z, false, false, false, false)));
        }
        AnonymousClass19S A02 = 19E.A02(AnonymousClass12W.A02);
        C376899Jt r22 = new C376899Jt(this, (AnonymousClass4D7) null, 0);
        this.A01 = 1Eo.A03(AnonymousClass05K.A00, 19B.A00, r22, A02);
    }

    public static final IgZeroDogfoodingInit getInstance(0lg r3) {
        0qQ.A0B(r3, 0);
        return (IgZeroDogfoodingInit) r3.A01(IgZeroDogfoodingInit.class, new C58686Ivv(r3, 24));
    }

    public final void onSessionWillEnd() {
        this.A01.AG7((CancellationException) null);
    }
}
