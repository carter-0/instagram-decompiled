package X;

/* renamed from: X.495  reason: invalid class name */
public final class AnonymousClass495 implements Runnable {
    public final /* synthetic */ AnonymousClass9IV A00;
    public final /* synthetic */ 1XM A01;
    public final /* synthetic */ AnonymousClass3PG A02;
    public final /* synthetic */ C228552lr A03;

    public AnonymousClass495(AnonymousClass9IV r1, 1XM r2, AnonymousClass3PG r3, C228552lr r4) {
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void run() {
        C228552lr r3 = this.A03;
        Object obj = r3.A0Y;
        AnonymousClass3PG r1 = this.A02;
        1XM r14 = this.A01;
        AnonymousClass9IV r12 = this.A00;
        synchronized (obj) {
            C228472lj r11 = r3.A0A;
            if (r11 != null) {
                AnonymousClass1GU r5 = r3.A03;
                if (r5 == null) {
                    r5 = C228552lr.A00(r3);
                }
                if (r3.A03 == null) {
                    r3.A03 = r5;
                }
                C228482lk.A00(r3.A0J).A05(r5, Long.valueOf(r14.mResponseTimestamp), r1.name(), "feed_repository", (String) null, (String) null);
                r11.A07(r12, r5, r14, -1, true);
            }
            r3.A03 = null;
        }
    }
}
