package X;

/* renamed from: X.5dP  reason: invalid class name and case insensitive filesystem */
public abstract class C289325dP {
    public static final boolean A01(long j) {
        long j2 = (j & 9187343241974906880L) ^ 9187343241974906880L;
        return (((j2 ^ -1) & (j2 - 4294967297L)) & -9223372034707292160L) == 0;
    }

    public static final boolean A02(long j) {
        return (j & 9223372034707292159L) != 9205357640488583168L;
    }

    public static final long A00(float f, float f2) {
        long floatToRawIntBits = (long) Float.floatToRawIntBits(f);
        return (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (floatToRawIntBits << 32);
    }
}
