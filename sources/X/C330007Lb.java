package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.7Lb  reason: invalid class name and case insensitive filesystem */
public abstract class C330007Lb {
    public static final Long A00(AnonymousClass7SD r2) {
        0qQ.A0B(r2, 0);
        C272964li r0 = r2.A0N;
        boolean z = r0.A08;
        Integer num = r0.A02;
        if (!z || num == null) {
            return null;
        }
        return Long.valueOf(TimeUnit.SECONDS.toMillis((long) num.intValue()));
    }

    public static final Long A01(AnonymousClass2Es r3) {
        Integer num;
        boolean Axj = r3.Axj();
        C272964li Axk = r3.Axk();
        if (Axk != null) {
            num = Axk.A02;
        } else {
            num = null;
        }
        if (!Axj || num == null) {
            return null;
        }
        return Long.valueOf(TimeUnit.SECONDS.toMillis((long) num.intValue()));
    }
}
