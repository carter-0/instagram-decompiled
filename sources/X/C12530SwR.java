package X;

import com.google.android.exoplayer2.util.Util;

/* renamed from: X.SwR  reason: case insensitive filesystem */
public final class C12530SwR implements C13953TmG {
    public final long A00;
    public final long[] A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;

    public final long AvI() {
        return this.A03;
    }

    public final long AzU() {
        return this.A00;
    }

    public final C21498Xcy BrA(long j) {
        long max;
        long max2;
        long j2;
        double d;
        long[] jArr = this.A01;
        if (!AnonymousClass7TF.A1V(jArr)) {
            max = 0;
            j2 = this.A05;
            max2 = (long) this.A02;
        } else {
            long j3 = this.A00;
            max = Math.max(0, Math.min(j, j3));
            double d2 = (((double) max) * 100.0d) / ((double) j3);
            double d3 = 0.0d;
            if (d2 > 0.0d) {
                if (d2 >= 100.0d) {
                    d3 = 256.0d;
                } else {
                    int i = (int) d2;
                    C256703wD.A01(jArr);
                    double d4 = (double) jArr[i];
                    if (i == 99) {
                        d = 256.0d;
                    } else {
                        d = (double) jArr[i + 1];
                    }
                    d3 = d4 + ((d2 - ((double) i)) * (d - d4));
                }
            }
            long j4 = this.A04;
            max2 = Math.max((long) this.A02, Math.min(Math.round((d3 / 256.0d) * ((double) j4)), j4 - 1));
            j2 = this.A05;
        }
        SJ7 sj7 = new SJ7(max, j2 + max2);
        return new C21498Xcy(sj7, sj7);
    }

    public final long C7P(long j) {
        long j2;
        double d;
        long j3 = j - this.A05;
        long[] jArr = this.A01;
        if (!AnonymousClass7TF.A1V(jArr) || j3 <= ((long) this.A02)) {
            return 0;
        }
        C256703wD.A01(jArr);
        double d2 = (((double) j3) * 256.0d) / ((double) this.A04);
        int A042 = Util.A04(jArr, (long) d2, true);
        long j4 = this.A00;
        long j5 = (j4 * ((long) A042)) / 100;
        long j6 = jArr[A042];
        int i = A042 + 1;
        long j7 = (j4 * ((long) i)) / 100;
        if (A042 == 99) {
            j2 = 256;
        } else {
            j2 = jArr[i];
        }
        if (j6 == j2) {
            d = 0.0d;
        } else {
            d = (d2 - ((double) j6)) / ((double) (j2 - j6));
        }
        return j5 + Math.round(d * ((double) (j7 - j5)));
    }

    public final /* synthetic */ long C9E(int i) {
        return this.A00;
    }

    public final boolean CbO() {
        return AnonymousClass7TF.A1V(this.A01);
    }

    public C12530SwR(long[] jArr, int i, long j, long j2, long j3) {
        this.A05 = j;
        this.A02 = i;
        this.A00 = j2;
        this.A01 = jArr;
        this.A04 = j3;
        this.A03 = j3 != -1 ? j + j3 : -1;
    }
}
