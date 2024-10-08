package X;

/* renamed from: X.5i6  reason: invalid class name and case insensitive filesystem */
public abstract class C291925i6 {
    public static final double A01(long j) {
        return (((double) (j >>> 11)) * 2048.0d) + ((double) (j & 2047));
    }

    public static final String A03(long j) {
        if (j >= 0) {
            String l = Long.toString(j, 10);
            0qQ.A07(l);
            return l;
        }
        long j2 = ((j >>> 1) / 10) << 1;
        long j3 = j - (j2 * 10);
        if (j3 >= 10) {
            j3 -= 10;
            j2++;
        }
        String l2 = Long.toString(j2, 10);
        0qQ.A07(l2);
        String l3 = Long.toString(j3, 10);
        0qQ.A07(l3);
        return 002.A0R(l2, l3);
    }

    public static final double A00(int i) {
        return ((double) (Integer.MAX_VALUE & i)) + (((double) ((i >>> 31) << 30)) * 2.0d);
    }

    public static final int A02(double d) {
        if (Double.isNaN(d) || d <= A00(0)) {
            return 0;
        }
        if (d >= A00(-1)) {
            return -1;
        }
        if (d <= 2.147483647E9d) {
            return (int) d;
        }
        return ((int) (d - 2.147483647E9d)) + Integer.MAX_VALUE;
    }
}
