package X;

public final class WH1 implements AnonymousClass0KI {
    public final /* synthetic */ WH2 A00;

    public final void DGv(long j) {
        WH2 wh2 = this.A00;
        double d = wh2.A04;
        long max = Math.max(Math.round(((double) j) / d), 1);
        long min = Math.min(max - 1, 100);
        double d2 = (double) min;
        wh2.A01 += d2;
        if (min > 4) {
            wh2.A00 += d2 / 4.0d;
        }
        wh2.A02 = (long) (((double) wh2.A02) + (d * ((double) max)));
    }

    public WH1(WH2 wh2) {
        this.A00 = wh2;
    }
}
