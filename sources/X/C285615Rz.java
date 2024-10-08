package X;

/* renamed from: X.5Rz  reason: invalid class name and case insensitive filesystem */
public abstract class C285615Rz {
    public static final long A00(float f, float f2) {
        long floatToRawIntBits = (long) Float.floatToRawIntBits(f);
        long floatToRawIntBits2 = (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (floatToRawIntBits << 32);
        long j = C285605Ry.A01;
        return floatToRawIntBits2;
    }
}
