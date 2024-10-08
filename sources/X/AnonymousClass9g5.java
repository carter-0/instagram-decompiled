package X;

import com.facebook.common.time.AwakeTimeSinceBootClock;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.9g5  reason: invalid class name */
public final class AnonymousClass9g5 extends C359848da {
    public long A00 = -1;
    public final AnonymousClass0JR A01 = AwakeTimeSinceBootClock.INSTANCE;
    public final A7R A02;
    public final C359858db A03;
    public final String A04;
    public final AtomicReference A05 = new AtomicReference();
    public final AtomicReference A06 = new AtomicReference();

    public AnonymousClass9g5(A7R a7r) {
        C359858db r0;
        this.A02 = a7r;
        String str = a7r.A04;
        this.A04 = str;
        0lg r2 = a7r.A02;
        if (r2 == null || str == null) {
            r0 = null;
        } else {
            r0 = (C359858db) r2.A01(C359858db.class, C359868dc.A00);
        }
        this.A03 = r0;
    }
}
