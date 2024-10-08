package X;

/* renamed from: X.5hh  reason: invalid class name and case insensitive filesystem */
public abstract class C291675hh {
    public static final long A00;

    static {
        long floatToRawIntBits = (long) Float.floatToRawIntBits(Float.NaN);
        A00 = (floatToRawIntBits & 4294967295L) | (floatToRawIntBits << 32);
    }
}
