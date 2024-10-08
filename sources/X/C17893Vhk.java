package X;

import java.lang.ref.WeakReference;

/* renamed from: X.Vhk  reason: case insensitive filesystem */
public final class C17893Vhk {
    public final C277014uI A00;
    public final C277014uI A01;
    public final C277014uI A02;
    public final C277014uI A03;
    public final WeakReference A04;
    public final WeakReference A05;

    public C17893Vhk(C307786Rm r3, C276544tV r4, C277014uI r5, C277014uI r6, C277014uI r7, C277014uI r8) {
        WeakReference weakReference = new WeakReference(r4);
        WeakReference weakReference2 = new WeakReference(r3);
        this.A05 = weakReference;
        this.A04 = weakReference2;
        this.A01 = r5;
        this.A00 = r6;
        this.A03 = r7;
        this.A02 = r8;
    }

    public final void A00(boolean z, boolean z2) {
        C277014uI r1;
        C276544tV r3 = (C276544tV) this.A05.get();
        C307786Rm r2 = (C307786Rm) this.A04.get();
        if (z) {
            if (z2) {
                r1 = this.A01;
            } else {
                r1 = this.A00;
            }
        } else if (z2) {
            r1 = this.A03;
        } else {
            r1 = this.A02;
        }
        if (r1 != null && r3 != null && r2 != null) {
            C308276Tl A0T = DbU.A0T(r3);
            A0T.A02(r2);
            DbT.A1R(r2, r3, A0T, r1);
        }
    }
}
