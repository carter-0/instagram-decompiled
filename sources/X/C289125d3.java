package X;

/* renamed from: X.5d3  reason: invalid class name and case insensitive filesystem */
public abstract class C289125d3 {
    public static final long A00 = C289115d2.A00(Float.NaN, Float.NaN);

    public static final float A00(long j) {
        if (j != A00) {
            return Float.intBitsToFloat((int) (j >> 32));
        }
        I2E.A01("ScaleFactor is unspecified");
        throw AnonymousClass00P.createAndThrow();
    }

    public static final float A01(long j) {
        if (j != A00) {
            return Float.intBitsToFloat((int) (j & 4294967295L));
        }
        I2E.A01("ScaleFactor is unspecified");
        throw AnonymousClass00P.createAndThrow();
    }
}
