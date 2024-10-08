package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.3OT  reason: invalid class name */
public abstract class AnonymousClass3OT {
    public static final long A00 = TimeUnit.SECONDS.toMillis(10);

    public static final AnonymousClass16c A00(AnonymousClass16c r6) {
        0qQ.A0B(r6, 0);
        0qQ.A0B(C61410nE.A00, 1);
        Long B2i = r6.B2i();
        if (B2i != null && System.currentTimeMillis() > B2i.longValue() - A00) {
            AnonymousClass16c r0 = (AnonymousClass16c) r6.B3m();
            if (r0 != null) {
                return r0;
            }
            0wb.A03("ExpirableUtil_nullFallback", "content is expired but fallback is null");
        }
        return r6;
    }
}
