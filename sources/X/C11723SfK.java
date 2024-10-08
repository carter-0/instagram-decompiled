package X;

import androidx.media3.common.util.Util;

/* renamed from: X.SfK  reason: case insensitive filesystem */
public final class C11723SfK implements C13911TlB {
    public final long A00;
    public final long[] A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final long A05;
    public final long A06;

    public final int Aea() {
        return this.A02;
    }

    public final long AvI() {
        return this.A04;
    }

    public final S5O Br9(long j) {
        long max;
        long max2;
        long j2;
        double d;
        long[] jArr = this.A01;
        if (!AnonymousClass7TF.A1V(jArr)) {
            max = 0;
            j2 = this.A06;
            max2 = (long) this.A03;
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
                    C11366SPh.A00(jArr);
                    double d4 = (double) jArr[i];
                    if (i == 99) {
                        d = 256.0d;
                    } else {
                        d = (double) jArr[i + 1];
                    }
                    d3 = d4 + ((d2 - ((double) i)) * (d - d4));
                }
            }
            long j4 = this.A05;
            max2 = Math.max((long) this.A03, Math.min(Math.round((d3 / 256.0d) * ((double) j4)), j4 - 1));
            j2 = this.A06;
        }
        SJ4 sj4 = new SJ4(max, j2 + max2);
        return new S5O(sj4, sj4);
    }

    public final long C7P(long j) {
        long j2;
        double d;
        long j3 = j - this.A06;
        long[] jArr = this.A01;
        if (!AnonymousClass7TF.A1V(jArr) || j3 <= ((long) this.A03)) {
            return 0;
        }
        C11366SPh.A00(jArr);
        double d2 = (((double) j3) * 256.0d) / ((double) this.A05);
        int A022 = Util.A02(jArr, (long) d2, true);
        long j4 = this.A00;
        long j5 = (j4 * ((long) A022)) / 100;
        long j6 = jArr[A022];
        int i = A022 + 1;
        long j7 = (j4 * ((long) i)) / 100;
        if (A022 == 99) {
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

    public C11723SfK(long[] jArr, int i, int i2, long j, long j2, long j3) {
        this.A06 = j;
        this.A03 = i;
        this.A00 = j2;
        this.A02 = i2;
        this.A05 = j3;
        this.A01 = jArr;
        this.A04 = j3 != -1 ? j + j3 : -1;
    }
}
