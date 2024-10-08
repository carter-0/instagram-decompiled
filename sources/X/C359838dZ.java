package X;

import com.facebook.common.time.AwakeTimeSinceBootClock;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.8dZ  reason: invalid class name and case insensitive filesystem */
public final class C359838dZ extends C359848da {
    public long A00 = -1;
    public final AnonymousClass0JR A01 = AwakeTimeSinceBootClock.INSTANCE;
    public final C359828dY A02;
    public final C359858db A03;
    public final String A04;
    public final AtomicReference A05 = new AtomicReference();
    public final AtomicReference A06 = new AtomicReference();

    public C359838dZ(C359828dY r4) {
        C359858db r0;
        this.A02 = r4;
        this.A04 = r4.A06;
        0lg r2 = r4.A04;
        if (r2 == null) {
            r0 = null;
        } else {
            r0 = (C359858db) r2.A01(C359858db.class, C359868dc.A00);
        }
        this.A03 = r0;
    }
}
