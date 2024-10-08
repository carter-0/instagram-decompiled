package X;

/* renamed from: X.3bu  reason: invalid class name and case insensitive filesystem */
public final class C244883bu extends C244893bv {
    public static final C244883bu A00 = new C244883bu();

    public final int A01(long j) {
        int i = ((int) j) & 1073741823;
        int i2 = i - 1;
        if (i == 0) {
            return Integer.MAX_VALUE;
        }
        return i2;
    }

    public final int A02(long j) {
        int i = ((int) (j >>> 32)) & 1073741823;
        int i2 = i - 1;
        if (i == 0) {
            return Integer.MAX_VALUE;
        }
        return i2;
    }

    public final int A03(long j) {
        int i = ((int) (j >>> 32)) & 1073741823;
        int i2 = i - 1;
        if (i == 0) {
            return Integer.MAX_VALUE;
        }
        return i2;
    }

    public C244883bu() {
        super(new 2HY(1073741822, 1073741822), 0);
    }

    public final long A04(int i, int i2) {
        int i3 = i2 + 1;
        if (i2 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        return ((long) ((i3 & 1073741823) | (this.A00 << 30))) & 4294967295L;
    }
}
