package X;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.Riv  reason: case insensitive filesystem */
public abstract class C9882Riv {
    public static final Object A00(AnonymousClass9GD r4, AnonymousClass4D7 r5) {
        if (r4.A0D()) {
            Throwable A05 = r4.A05();
            if (A05 == null) {
                if (!r4.A05) {
                    return r4.A06();
                }
                StringBuilder A1A = AnonymousClass7TE.A1A();
                A1A.append("Task ");
                A1A.append(r4);
                A05 = new CancellationException(AnonymousClass7TF.A0l(" was cancelled normally.", A1A));
            }
            throw A05;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = 1IW.A04;
        1IW r3 = new 1IW(1, 1Ey.A02(r5));
        r3.A0I();
        r4.A08(new C12596Syv(r3, 3), TO2.A00);
        return r3.A0E();
    }
}
