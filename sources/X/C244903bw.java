package X;

/* renamed from: X.3bw  reason: invalid class name and case insensitive filesystem */
public final class C244903bw extends C244893bv {
    public static final C244903bw A00 = new C244903bw();

    public C244903bw() {
        super(new 2HY(0, 1073741822), 1);
    }

    public final int A00(long j) {
        return 0;
    }

    public final int A01(long j) {
        int i = ((int) j) & 1073741823;
        int i2 = i - 1;
        if (i == 0) {
            return Integer.MAX_VALUE;
        }
        return i2;
    }

    public final int A03(long j) {
        return 0;
    }

    public final int A02(long j) {
        int i = ((int) (j >>> 32)) & 1073741823;
        int i2 = i - 1;
        if (i == 0) {
            return Integer.MAX_VALUE;
        }
        return i2;
    }

    public final long A04(int i, int i2) {
        int i3 = i2 + 1;
        if (i2 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        return ((long) ((i3 & 1073741823) | (this.A00 << 30))) & 4294967295L;
    }
}
