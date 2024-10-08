package X;

/* renamed from: X.3Pq  reason: invalid class name and case insensitive filesystem */
public abstract class C241553Pq {
    public static final void A00(AnonymousClass4D7 r3, 1F0 r4, boolean z) {
        Object A0A;
        C252173og r0;
        Object A09 = r4.A09();
        Throwable A0B = r4.A0B(A09);
        if (A0B != null) {
            A0A = new 0eQ(A0B);
        } else {
            A0A = r4.A0A(A09);
        }
        if (z) {
            0qQ.A0C(r3, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
            1Ez r32 = (1Ez) r3;
            AnonymousClass4D7 r1 = r32.A02;
            Object obj = r32.A01;
            C262094Cc context = r1.getContext();
            Object A00 = 1F5.A00(obj, context);
            if (A00 != 1F5.A00) {
                r0 = 1Ep.A03(A00, r1, context);
            } else {
                r0 = null;
            }
            try {
                r1.resumeWith(A0A);
            } finally {
                if (r0 == null || r0.A0X()) {
                    1F5.A02(A00, context);
                }
            }
        } else {
            r3.resumeWith(A0A);
        }
    }
}
