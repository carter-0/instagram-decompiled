package X;

import sun.misc.Unsafe;

/* renamed from: X.QBs  reason: case insensitive filesystem */
public final class C7408QBs extends C284145Ld {
    public final byte A00(Object obj, long j) {
        return this.A00.getByte(obj, j);
    }

    public final double A01(Object obj, long j) {
        return this.A00.getDouble(obj, j);
    }

    public final float A02(Object obj, long j) {
        return this.A00.getFloat(obj, j);
    }

    public final void A08(Object obj, long j, byte b) {
        this.A00.putByte(obj, j, b);
    }

    public final void A09(Object obj, long j, double d) {
        this.A00.putDouble(obj, j, d);
    }

    public final void A0A(Object obj, long j, float f) {
        this.A00.putFloat(obj, j, f);
    }

    public final void A0E(Object obj, long j, boolean z) {
        this.A00.putBoolean(obj, j, z);
    }

    public final boolean A0G(Object obj, long j) {
        return this.A00.getBoolean(obj, j);
    }

    public C7408QBs(Unsafe unsafe) {
        super(unsafe);
    }
}
