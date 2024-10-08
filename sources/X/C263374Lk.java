package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.4Lk  reason: invalid class name and case insensitive filesystem */
public final class C263374Lk implements 1UV {
    public final AnonymousClass46L A00;

    public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
        1Xj r0;
        1Xj A02;
        Long BLM;
        1Xg r13 = (1Xg) obj;
        if (r13 != null) {
            r0 = 1Xi.A02(r13.A05);
        } else {
            r0 = null;
        }
        if (r0 == null || (A02 = 1Xi.A02(r13.A05)) == null || (BLM = A02.A0C.BLM()) == null) {
            return false;
        }
        long longValue = BLM.longValue();
        AnonymousClass46L r8 = this.A00;
        long currentTimeMillis = System.currentTimeMillis();
        TimeUnit timeUnit = TimeUnit.MINUTES;
        if (longValue <= currentTimeMillis - timeUnit.toMillis((long) r8.A00) || longValue >= currentTimeMillis - timeUnit.toMillis((long) r8.A01)) {
            return false;
        }
        return true;
    }

    public C263374Lk(AnonymousClass46L r1) {
        this.A00 = r1;
    }
}
