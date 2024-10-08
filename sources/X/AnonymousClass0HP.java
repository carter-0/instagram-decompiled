package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.0HP  reason: invalid class name */
public final class AnonymousClass0HP implements AnonymousClass0JR {
    public long A00;
    public final AnonymousClass0JP A01;

    public final long now() {
        long max = Math.max(this.A00, this.A01.now());
        this.A00 = max;
        return max;
    }

    public final long nowNanos() {
        return TimeUnit.MILLISECONDS.toNanos(now());
    }

    public AnonymousClass0HP(AnonymousClass0JP r3) {
        this.A01 = r3;
        this.A00 = r3.now();
    }
}
