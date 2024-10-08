package X;

public final class QGA extends AnonymousClass3A3 {
    public final boolean A02(AnonymousClass3A1 r2, AnonymousClass3A1 r3, C2379639y r4) {
        boolean z;
        synchronized (r4) {
            if (r4.listeners == r2) {
                r4.listeners = r3;
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public final boolean A03(AnonymousClass3A0 r2, AnonymousClass3A0 r3, C2379639y r4) {
        boolean z;
        synchronized (r4) {
            if (r4.waiters == r2) {
                r4.waiters = r3;
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public final boolean A04(C2379639y r2, Object obj, Object obj2) {
        boolean z;
        synchronized (r2) {
            if (r2.value == obj) {
                r2.value = obj2;
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public final void A00(AnonymousClass3A0 r1, AnonymousClass3A0 r2) {
        r1.next = r2;
    }

    public final void A01(AnonymousClass3A0 r1, Thread thread) {
        r1.thread = thread;
    }
}
