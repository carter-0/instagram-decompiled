package X;

import java.util.Set;

/* renamed from: X.R1z  reason: case insensitive filesystem */
public final class C8708R1z extends 1LI {
    public final int A00(AnonymousClass1LA r2) {
        int i;
        synchronized (r2) {
            1LI r0 = AnonymousClass1LA.A00;
            i = r2.remaining - 1;
            r2.remaining = i;
        }
        return i;
    }

    public final void A01(AnonymousClass1LA r3, Set set, Set set2) {
        synchronized (r3) {
            1LI r0 = AnonymousClass1LA.A00;
            if (r3.seenExceptions == null) {
                r3.seenExceptions = set2;
            }
        }
    }
}
