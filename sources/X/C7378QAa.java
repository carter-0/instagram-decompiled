package X;

/* renamed from: X.QAa  reason: case insensitive filesystem */
public final class C7378QAa extends AnonymousClass5AI {
    public final boolean A02(AnonymousClass5AG r2, AnonymousClass5AG r3, AnonymousClass5AE r4) {
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

    public final boolean A03(AnonymousClass5AF r2, AnonymousClass5AF r3, AnonymousClass5AE r4) {
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

    public final boolean A04(AnonymousClass5AE r3, Object obj, Object obj2) {
        boolean z;
        synchronized (r3) {
            if (r3.value == null) {
                r3.value = obj2;
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public final void A00(AnonymousClass5AF r1, AnonymousClass5AF r2) {
        r1.next = r2;
    }

    public final void A01(AnonymousClass5AF r1, Thread thread) {
        r1.thread = thread;
    }
}
