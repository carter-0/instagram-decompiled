package X;

import java.lang.ref.WeakReference;

/* renamed from: X.Vh5  reason: case insensitive filesystem */
public final class C17852Vh5 {
    public final C277014uI A00;
    public final C277014uI A01;
    public final WeakReference A02;
    public final WeakReference A03;

    public C17852Vh5(C307786Rm r3, C276544tV r4, C277014uI r5, C277014uI r6) {
        WeakReference weakReference = new WeakReference(r4);
        WeakReference weakReference2 = new WeakReference(r3);
        this.A03 = weakReference;
        this.A02 = weakReference2;
        this.A00 = r5;
        this.A01 = r6;
    }

    public final void A00(boolean z) {
        C277014uI r1;
        C276544tV r3 = (C276544tV) this.A03.get();
        C307786Rm r2 = (C307786Rm) this.A02.get();
        if (z) {
            r1 = this.A00;
        } else {
            r1 = this.A01;
        }
        if (r1 != null && r3 != null && r2 != null) {
            C308276Tl A0T = DbU.A0T(r3);
            A0T.A02(r2);
            DbT.A1R(r2, r3, A0T, r1);
        }
    }
}
