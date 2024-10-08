package X;

import androidx.media3.common.util.Util;

/* renamed from: X.Xvc  reason: case insensitive filesystem */
public final class C22112Xvc implements C13511Tbc {
    public final int A00;
    public final C21443Xav A01;
    public final long A02;
    public final long A03;
    public final long A04;

    public final S5O Br9(long j) {
        C21443Xav xav = this.A01;
        long j2 = (long) xav.A03;
        long j3 = (long) this.A00;
        long j4 = this.A02 - 1;
        long max = Math.max(0, Math.min((j2 * j) / (j3 * 1000000), j4));
        long j5 = this.A04;
        long j6 = (long) xav.A01;
        long A05 = Util.A05(max * j3, j2);
        SJ4 sj4 = new SJ4(A05, j5 + (j6 * max));
        if (A05 >= j || max == j4) {
            return new S5O(sj4, sj4);
        }
        long j7 = max + 1;
        return new S5O(sj4, new SJ4(Util.A05(j7 * j3, j2), j5 + (j6 * j7)));
    }

    public C22112Xvc(C21443Xav xav, int i, long j, long j2) {
        this.A01 = xav;
        this.A00 = i;
        this.A04 = j;
        long j3 = (j2 - j) / ((long) xav.A01);
        this.A02 = j3;
        this.A03 = Util.A05(j3 * ((long) i), (long) xav.A03);
    }
}
