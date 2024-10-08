package X;

/* renamed from: X.6GR  reason: invalid class name */
public abstract class AnonymousClass6GR {
    public static final long A00(float f, float f2) {
        long floatToRawIntBits = (long) Float.floatToRawIntBits(f);
        long floatToRawIntBits2 = (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (floatToRawIntBits << 32);
        long j = AnonymousClass6GS.A00;
        return floatToRawIntBits2;
    }
}
