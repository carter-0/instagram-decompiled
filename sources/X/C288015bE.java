package X;

/* renamed from: X.5bE  reason: invalid class name and case insensitive filesystem */
public abstract class C288015bE {
    public static final long A00(float f, float f2) {
        long floatToRawIntBits = (long) Float.floatToRawIntBits(f);
        return (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (floatToRawIntBits << 32);
    }

    public static final long A01(long j) {
        if (j != 9205357640488583168L) {
            return C289325dP.A00(Float.intBitsToFloat((int) (j >> 32)) / 2.0f, Float.intBitsToFloat((int) (j & 4294967295L)) / 2.0f);
        }
        throw new IllegalStateException("Size is unspecified");
    }
}
