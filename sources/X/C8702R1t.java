package X;

/* renamed from: X.R1t  reason: case insensitive filesystem */
public final class C8702R1t extends 1KB {
    public final 1Km A00(1Km r2, 1K2 r3) {
        1Km r0;
        synchronized (r3) {
            boolean z = 1K2.A02;
            r0 = r3.listeners;
            if (r0 != r2) {
                r3.listeners = r2;
            }
        }
        return r0;
    }

    public final AnonymousClass1Kd A01(AnonymousClass1Kd r2, 1K2 r3) {
        AnonymousClass1Kd r0;
        synchronized (r3) {
            boolean z = 1K2.A02;
            r0 = r3.waiters;
            if (r0 != r2) {
                r3.waiters = r2;
            }
        }
        return r0;
    }

    public final boolean A04(1Km r2, 1Km r3, 1K2 r4) {
        boolean z;
        synchronized (r4) {
            boolean z2 = 1K2.A02;
            if (r4.listeners == r2) {
                r4.listeners = r3;
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public final boolean A05(AnonymousClass1Kd r2, AnonymousClass1Kd r3, 1K2 r4) {
        boolean z;
        synchronized (r4) {
            boolean z2 = 1K2.A02;
            if (r4.waiters == r2) {
                r4.waiters = r3;
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public final boolean A06(1K2 r2, Object obj, Object obj2) {
        boolean z;
        synchronized (r2) {
            boolean z2 = 1K2.A02;
            if (r2.value == obj) {
                r2.value = obj2;
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public final void A02(AnonymousClass1Kd r1, AnonymousClass1Kd r2) {
        r1.next = r2;
    }

    public final void A03(AnonymousClass1Kd r1, Thread thread) {
        r1.thread = thread;
    }
}
