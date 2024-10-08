package X;

import android.view.View;

/* renamed from: X.LJf  reason: case insensitive filesystem */
public abstract class C64018LJf {
    public static final void A00(View view, int i) {
        if (i == 0) {
            AnonymousClass7TG.A1A(view, true);
        } else if (i == 4) {
            C294975nL.A06(new View[]{view}, true);
        } else if (i == 8) {
            AnonymousClass7TE.A1U(view, true);
        }
    }

    public static final void A01(View view, C62320sa r4, boolean z) {
        0qQ.A0B(view, 0);
        C65724Lye lye = new C65724Lye(r4, 22);
        if (z) {
            C294975nL.A04(lye, new View[]{view}, true);
        } else {
            C294975nL.A03(view, lye, 8, true);
        }
    }
}
