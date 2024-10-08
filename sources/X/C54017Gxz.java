package X;

/* renamed from: X.Gxz  reason: case insensitive filesystem */
public final class C54017Gxz extends C244893bv {
    public static final C54017Gxz A00 = new C54017Gxz();

    public final int A00(long j) {
        int i = (((int) j) & Integer.MAX_VALUE) >>> 18;
        int i2 = i - 1;
        if (i == 0) {
            return Integer.MAX_VALUE;
        }
        return i2;
    }

    public final int A01(long j) {
        int i = ((int) j) & 1073741823 & 262143;
        int i2 = i - 1;
        if (i == 0) {
            return Integer.MAX_VALUE;
        }
        return i2;
    }

    public final long A04(int i, int i2) {
        int i3 = 0;
        int i4 = i + 1;
        if (i == Integer.MAX_VALUE) {
            i4 = 0;
        }
        if (i2 != Integer.MAX_VALUE) {
            i3 = i2 + 1;
        }
        return ((long) (((i4 & 8191) << 18) | (this.A00 << 30) | (262143 & i3))) & 4294967295L;
    }

    public C54017Gxz() {
        super(new 2HY(8190, 262142), 2);
    }

    public final int A02(long j) {
        int i = ((int) (j >>> 32)) & 1073741823 & 262143;
        int i2 = i - 1;
        if (i == 0) {
            return Integer.MAX_VALUE;
        }
        return i2;
    }

    public final int A03(long j) {
        int i = (((int) (j >>> 32)) & Integer.MAX_VALUE) >>> 18;
        int i2 = i - 1;
        if (i == 0) {
            return Integer.MAX_VALUE;
        }
        return i2;
    }
}
