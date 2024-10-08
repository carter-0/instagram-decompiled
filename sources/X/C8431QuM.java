package X;

import sun.misc.Unsafe;

/* renamed from: X.QuM  reason: case insensitive filesystem */
public final class C8431QuM extends C11034S6m {
    public final double A00(Object obj, long j) {
        return Double.longBitsToDouble(this.A00.getLong(obj, j));
    }

    public final float A01(Object obj, long j) {
        return Float.intBitsToFloat(this.A00.getInt(obj, j));
    }

    public final void A02(Object obj, long j, double d) {
        this.A00.putLong(obj, j, Double.doubleToLongBits(d));
    }

    public final void A03(Object obj, long j, float f) {
        this.A00.putInt(obj, j, Float.floatToIntBits(f));
    }

    public C8431QuM(Unsafe unsafe) {
        super(unsafe);
    }
}
