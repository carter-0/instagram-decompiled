package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.7rR  reason: invalid class name and case insensitive filesystem */
public final class C344177rR {
    public double A00;
    public double A01;
    public int A02;
    public int A03;
    public long A04;
    public final AtomicBoolean A05 = new AtomicBoolean(false);
    public final double[] A06 = new double[4];

    public final void A00(long j) {
        int i;
        long j2 = this.A04;
        if (j2 == 0) {
            i = this.A03 + 1;
        } else {
            double d = ((double) (j - j2)) / 1000000.0d;
            this.A02++;
            this.A01 += d;
            this.A00 += d * d;
            this.A04 = 0;
            i = 0;
            if (this.A05.compareAndSet(true, false)) {
                this.A02 = 0;
                this.A04 = 0;
                this.A01 = 0.0d;
                this.A00 = 0.0d;
            } else {
                return;
            }
        }
        this.A03 = i;
    }

    public final double[] A01() {
        double sqrt;
        double d = this.A01;
        double d2 = this.A00;
        double[] dArr = this.A06;
        double d3 = (double) this.A02;
        dArr[2] = d3;
        dArr[3] = (double) this.A03;
        int max = Math.max(1, (int) d3);
        double d4 = (double) max;
        double d5 = d / d4;
        dArr[0] = d5;
        if (max <= 1) {
            sqrt = 0.0d;
        } else {
            sqrt = Math.sqrt((d2 / d4) - (d5 * d5));
        }
        dArr[1] = sqrt;
        return dArr;
    }
}
