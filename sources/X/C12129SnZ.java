package X;

import java.util.concurrent.ScheduledFuture;

/* renamed from: X.SnZ  reason: case insensitive filesystem */
public final class C12129SnZ implements C13709TfW {
    public final /* synthetic */ AnonymousClass6UG A00;

    public C12129SnZ(AnonymousClass6UG r1) {
        this.A00 = r1;
    }

    public final void DCf(Q0M q0m) {
        AnonymousClass6UG r1 = this.A00;
        synchronized (r1) {
            if (r1.A03) {
                AnonymousClass6UG.A00(r1, q0m);
            }
        }
    }

    public final void DOh(C276164sm r8) {
        long j;
        AnonymousClass6UG r2 = this.A00;
        synchronized (r2) {
            if (r2.A03) {
                r2.A01 = r8;
                if (r8.A03() == null) {
                    j = Long.MIN_VALUE;
                } else {
                    j = r2.A04.now() - r8.A03().longValue();
                }
                if (j <= r2.A00.A02 && r8.A01() != null && r8.A01().floatValue() <= r2.A00.A00) {
                    r2.A03 = false;
                    r2.A08.A06();
                    ScheduledFuture scheduledFuture = r2.A02;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                        r2.A02 = null;
                    }
                    r2.A01(r8);
                }
            }
        }
    }
}
