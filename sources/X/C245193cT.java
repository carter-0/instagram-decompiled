package X;

/* renamed from: X.3cT  reason: invalid class name and case insensitive filesystem */
public abstract class C245193cT {
    public static long A00(int i, int i2) {
        int floatToRawIntBits = Float.floatToRawIntBits((float) i);
        return ((long) Float.floatToRawIntBits((float) i2)) | (((long) floatToRawIntBits) << 32);
    }
}
