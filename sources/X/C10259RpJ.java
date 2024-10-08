package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.RpJ  reason: case insensitive filesystem */
public final class C10259RpJ {
    public final long A00;

    public C10259RpJ(int i, long j) {
        this.A00 = (j + TimeUnit.SECONDS.toMillis((long) i)) - 10000;
    }
}
