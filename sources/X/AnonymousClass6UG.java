package X;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/* renamed from: X.6UG  reason: invalid class name */
public final class AnonymousClass6UG extends C3722490b {
    public C10815Ryb A00;
    public C276164sm A01;
    public ScheduledFuture A02;
    public boolean A03;
    public final AnonymousClass0JP A04;
    public final C13709TfW A05 = new C12129SnZ(this);
    public final C270924hc A06;
    public final C270964hg A07;
    public final AnonymousClass60p A08;
    public final ScheduledExecutorService A09;

    public static void A00(AnonymousClass6UG r2, Throwable th) {
        r2.A03 = false;
        r2.A08.A06();
        ScheduledFuture scheduledFuture = r2.A02;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            r2.A02 = null;
        }
        r2.A02(th);
    }

    public final synchronized void A03() {
        A00(this, new CancellationException());
    }

    public AnonymousClass6UG(AnonymousClass0JP r2, C270924hc r3, C270964hg r4, AnonymousClass60p r5, ScheduledExecutorService scheduledExecutorService) {
        this.A06 = r3;
        this.A08 = r5;
        this.A07 = r4;
        this.A04 = r2;
        this.A09 = scheduledExecutorService;
    }
}
