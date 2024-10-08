package X;

/* renamed from: X.Am0  reason: case insensitive filesystem */
public final class C40954Am0 implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ AJ3 A01;

    public C40954Am0(AJ3 aj3, long j) {
        this.A01 = aj3;
        this.A00 = j;
    }

    public final void run() {
        C344477rv r0;
        AJ3 aj3 = this.A01;
        long j = this.A00;
        if (aj3.A0V.compareAndSet(1, 2)) {
            if (!aj3.A0Y) {
                AJ3.A03(aj3, true);
                aj3.A04 = j;
                AJ3.A02(aj3, aj3.A01, aj3.A00);
            } else {
                AJ3.A03(aj3, false);
                AJ3.A05(aj3, false);
            }
            C344367rk r3 = aj3.A0L.A00;
            C365178mf r2 = r3.A00;
            if (r2 != null && (r0 = r3.A03) != null) {
                r0.getHandler().post(new C40952Aly(r2, r3));
            }
        }
    }
}
