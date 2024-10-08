package X;

/* renamed from: X.S2o  reason: case insensitive filesystem */
public final class C10956S2o {
    public double A00 = Double.NaN;
    public double A01 = 0.0d;
    public double A02 = Double.NaN;
    public double A03 = 0.0d;
    public long A04 = 0;

    public final void A00(Iterable iterable) {
        for (Object A002 : iterable) {
            double A003 = JTO.A00(A002);
            long j = this.A04;
            double d = Double.NaN;
            if (j == 0) {
                this.A04 = 1;
                this.A01 = A003;
                this.A02 = A003;
                this.A00 = A003;
                if (!SC3.A00(A003)) {
                    this.A03 = Double.NaN;
                }
            } else {
                long j2 = j + 1;
                this.A04 = j2;
                boolean A004 = SC3.A00(A003);
                if (A004) {
                    double d2 = this.A01;
                    if (SC3.A00(d2)) {
                        double d3 = A003 - d2;
                        double d4 = d2 + (d3 / ((double) j2));
                        this.A01 = d4;
                        d = this.A03 + (d3 * (A003 - d4));
                        this.A03 = d;
                        this.A02 = Math.min(this.A02, A003);
                        this.A00 = Math.max(this.A00, A003);
                    }
                }
                double d5 = this.A01;
                if (SC3.A00(d5)) {
                    d5 = A003;
                } else if (!A004 && d5 != A003) {
                    d5 = Double.NaN;
                }
                this.A01 = d5;
                this.A03 = d;
                this.A02 = Math.min(this.A02, A003);
                this.A00 = Math.max(this.A00, A003);
            }
        }
    }
}
