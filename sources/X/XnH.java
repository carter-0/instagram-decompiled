package X;

public final class XnH {
    public long A00;
    public long A01;
    public long A02;
    public long A03 = 0;
    public long A04;
    public final long A05;
    public final long A06;
    public final long A07;

    public XnH(long j, long j2, long j3, long j4, long j5, long j6) {
        this.A06 = j;
        this.A07 = j2;
        long j7 = j3;
        this.A01 = j7;
        long j8 = j4;
        this.A02 = j8;
        long j9 = j5;
        this.A00 = j9;
        long j10 = j6;
        this.A05 = j10;
        this.A04 = A00(j2, 0, j7, j8, j9, j10);
    }

    public static long A00(long j, long j2, long j3, long j4, long j5, long j6) {
        if (j4 + 1 >= j5 || j2 + 1 >= j3) {
            return j4;
        }
        long j7 = (long) (((float) (j - j2)) * (((float) (j5 - j4)) / ((float) (j3 - j2))));
        return Math.max(j4, Math.min(((j7 + j4) - j6) - (j7 / 20), j5 - 1));
    }
}
