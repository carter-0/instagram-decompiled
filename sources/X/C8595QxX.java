package X;

import sun.misc.Unsafe;

/* renamed from: X.QxX  reason: case insensitive filesystem */
public final class C8595QxX extends S7V {
    public final double A00(Object obj, long j) {
        return Double.longBitsToDouble(this.A00.getLong(obj, j));
    }

    public final float A01(Object obj, long j) {
        return Float.intBitsToFloat(this.A00.getInt(obj, j));
    }

    public final void A02(Object obj, long j, byte b) {
        if (SUg.A01) {
            SUg.A0B(obj, j, b);
        } else {
            SUg.A0C(obj, j, b);
        }
    }

    public final void A05(Object obj, long j, boolean z) {
        if (SUg.A01) {
            SUg.A0B(obj, j, r3 ? (byte) 1 : 0);
        } else {
            SUg.A0C(obj, j, r3 ? (byte) 1 : 0);
        }
    }

    public final boolean A06(Object obj, long j) {
        if (SUg.A01) {
            return AnonymousClass7TF.A1P(Pxj.A00(SUg.A02.A00.getInt(obj, -4 & j), j ^ -1));
        }
        return AnonymousClass7TF.A1P(Pxj.A00(SUg.A02.A00.getInt(obj, -4 & j), j));
    }

    public final void A03(Object obj, long j, double d) {
        this.A00.putLong(obj, j, Double.doubleToLongBits(d));
    }

    public final void A04(Object obj, long j, float f) {
        this.A00.putInt(obj, j, Float.floatToIntBits(f));
    }

    public C8595QxX(Unsafe unsafe) {
        super(unsafe);
    }
}
