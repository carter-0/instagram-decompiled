package X;

import java.lang.ref.WeakReference;

public final class GKK implements AnonymousClass33C {
    public 0sP A00;

    public final void DUq(C247003fc r8, 1Xj r9, Integer num, WeakReference weakReference, C62320sa r12, 0sP r13) {
        WeakReference weakReference2 = weakReference;
        0qQ.A0B(weakReference, 0);
        C247003fc r2 = r8;
        1Xj r3 = r9;
        C51974G9v.A1M(r9, r8, r12);
        0sP r6 = r13;
        0qQ.A0B(r13, 5);
        Integer num2 = num;
        if (num == null || num == AnonymousClass05K.A00) {
            C53400GnX gnX = new C53400GnX(r2, r3, num2, weakReference2, r6);
            0sP r0 = this.A00;
            if (r0 != null) {
                r0.invoke(gnX);
                return;
            }
            return;
        }
        r12.invoke();
    }

    public final void EbG(0sP r2) {
        0qQ.A0B(r2, 0);
        this.A00 = r2;
    }
}
