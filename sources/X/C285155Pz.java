package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.5Pz  reason: invalid class name and case insensitive filesystem */
public abstract class C285155Pz {
    public static final AtomicBoolean A00 = new AtomicBoolean(false);
    public static final AtomicBoolean A01 = new AtomicBoolean(false);

    public static final void A00() {
        if (A01.compareAndSet(false, true)) {
            Integer num = AnonymousClass05K.A00;
            1HR r3 = new 1HR(1);
            AnonymousClass19S A02 = 19E.A02((C262094Cc) AnonymousClass5PM.A0B.getValue());
            1Eo.A03(num, 19B.A00, new AnonymousClass9KF((AnonymousClass4D7) null, r3), A02);
            C377189Kw r2 = new C377189Kw(r3, 9);
            synchronized (AnonymousClass5P3.A07) {
                AnonymousClass5P3.A03 = 00k.A0T(r2, AnonymousClass5P3.A03);
            }
            AnonymousClass5P3.A0A(AnonymousClass5Q0.A00);
        }
    }
}
