package X;

/* renamed from: X.Sf5  reason: case insensitive filesystem */
public abstract class C11708Sf5 implements C13511Tbc {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;

    public final S5O Br9(long j) {
        SJ4 sj4;
        long j2 = this.A02;
        if (j2 == -1) {
            sj4 = new SJ4(0, this.A03);
        } else {
            long j3 = (long) this.A00;
            long j4 = (long) this.A01;
            long max = Math.max(Math.min((((j * j3) / 8000000) / j4) * j4, j2 - j4), 0);
            long j5 = this.A03;
            long j6 = j5 + max;
            long A0D = Pxj.A0D(j6 - j5) / j3;
            sj4 = new SJ4(A0D, j6);
            if (A0D < j) {
                long j7 = j4 + j6;
                if (j7 < this.A05) {
                    return new S5O(sj4, new SJ4(Pxj.A0D(j7 - j5) / j3, j7));
                }
            }
        }
        return new S5O(sj4, sj4);
    }

    public C11708Sf5(int i, int i2, long j, long j2) {
        long A0D;
        this.A05 = j;
        this.A03 = j2;
        this.A01 = i2 == -1 ? 1 : i2;
        this.A00 = i;
        if (j == -1) {
            this.A02 = -1;
            A0D = -9223372036854775807L;
        } else {
            long j3 = j - j2;
            this.A02 = j3;
            A0D = Pxj.A0D(j3) / ((long) i);
        }
        this.A04 = A0D;
    }
}
