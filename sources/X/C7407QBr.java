package X;

import sun.misc.Unsafe;

/* renamed from: X.QBr  reason: case insensitive filesystem */
public final class C7407QBr extends C284145Ld {
    public final byte A00(Object obj, long j) {
        if (C284115La.A08) {
            return C284115La.A00(obj, j);
        }
        return C284115La.A01(obj, j);
    }

    public final void A08(Object obj, long j, byte b) {
        if (C284115La.A08) {
            C284115La.A07(obj, j, b);
        } else {
            C284115La.A08(obj, j, b);
        }
    }

    public final void A0E(Object obj, long j, boolean z) {
        if (C284115La.A08) {
            C284115La.A07(obj, j, z ? (byte) 1 : 0);
        } else {
            C284115La.A08(obj, j, z ? (byte) 1 : 0);
        }
    }

    public final boolean A0G(Object obj, long j) {
        byte A01;
        if (C284115La.A08) {
            A01 = C284115La.A00(obj, j);
        } else {
            A01 = C284115La.A01(obj, j);
        }
        return AnonymousClass7TF.A1P(A01);
    }

    public final double A01(Object obj, long j) {
        return Double.longBitsToDouble(A05(obj, j));
    }

    public final float A02(Object obj, long j) {
        return Float.intBitsToFloat(A04(obj, j));
    }

    public final void A09(Object obj, long j, double d) {
        A0C(obj, j, Double.doubleToLongBits(d));
    }

    public final void A0A(Object obj, long j, float f) {
        A0B(obj, j, Float.floatToIntBits(f));
    }

    public C7407QBr(Unsafe unsafe) {
        super(unsafe);
    }
}
