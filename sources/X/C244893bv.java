package X;

/* renamed from: X.3bv  reason: invalid class name and case insensitive filesystem */
public abstract class C244893bv {
    public final int A00;
    public final 2HY A01;

    public int A00(long j) {
        int i = ((int) j) & 1073741823;
        int i2 = i - 1;
        if (i == 0) {
            return Integer.MAX_VALUE;
        }
        return i2;
    }

    public abstract int A01(long j);

    public abstract int A02(long j);

    public abstract int A03(long j);

    public abstract long A04(int i, int i2);

    public C244893bv(2HY r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }
}
