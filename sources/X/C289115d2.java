package X;

/* renamed from: X.5d2  reason: invalid class name and case insensitive filesystem */
public abstract class C289115d2 {
    public static final long A00(float f, float f2) {
        long floatToRawIntBits = (long) Float.floatToRawIntBits(f);
        long floatToRawIntBits2 = (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (floatToRawIntBits << 32);
        long j = C289125d3.A00;
        return floatToRawIntBits2;
    }
}
