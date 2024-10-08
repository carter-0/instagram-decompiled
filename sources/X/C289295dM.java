package X;

/* renamed from: X.5dM  reason: invalid class name and case insensitive filesystem */
public final class C289295dM {
    public final long A00;

    public static /* synthetic */ long A03(float f, int i, long j) {
        float f2 = 0.0f;
        if ((i & 1) != 0) {
            f2 = Float.intBitsToFloat((int) (j >> 32));
        }
        if ((i & 2) != 0) {
            f = Float.intBitsToFloat((int) (4294967295L & j));
        }
        return (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
    }

    public static final boolean A09(long j) {
        long j2 = j & 9223372034707292159L;
        return (((j2 ^ -1) & (j2 - 9187343246269874177L)) & -9223372034707292160L) == -9223372034707292160L;
    }

    public static final float A00(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return (float) Math.sqrt((double) ((intBitsToFloat * intBitsToFloat) + (intBitsToFloat2 * intBitsToFloat2)));
    }

    public static final float A01(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final long A04(float f, long j) {
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) / f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) / f)) & 4294967295L);
    }

    public static final long A05(float f, long j) {
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) * f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) * f)) & 4294967295L);
    }

    public static final long A06(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (((long) Float.floatToRawIntBits(intBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(intBitsToFloat2)) & 4294967295L);
    }

    public static final long A07(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) + Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) + Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (((long) Float.floatToRawIntBits(intBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(intBitsToFloat2)) & 4294967295L);
    }

    public final boolean equals(Object obj) {
        long j = this.A00;
        if (!(obj instanceof C289295dM) || j != ((C289295dM) obj).A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A00;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return A08(this.A00);
    }

    public /* synthetic */ C289295dM(long j) {
        this.A00 = j;
    }

    public static String A08(long j) {
        if (C289325dP.A02(j)) {
            return 002.A0v("Offset(", C392309ub.A00(A01(j)), ", ", C392309ub.A00(A02(j)), ')');
        }
        return "Offset.Unspecified";
    }

    public static final float A02(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }
}
