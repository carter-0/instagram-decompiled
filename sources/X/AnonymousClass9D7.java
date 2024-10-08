package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.9D7  reason: invalid class name */
public final class AnonymousClass9D7 {
    public final AtomicBoolean A00 = new AtomicBoolean(false);

    public final void A00() {
        0xm A002 = AnonymousClass0xl.A00(C61170le.A00);
        long currentTimeMillis = System.currentTimeMillis();
        0xY AR4 = A002.A00.AR4();
        AR4.E5c("bigfoot_reporter_last_foreground_measurement", currentTimeMillis);
        AR4.apply();
        this.A00.set(false);
    }
}
