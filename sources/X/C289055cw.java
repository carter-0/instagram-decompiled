package X;

/* renamed from: X.5cw  reason: invalid class name and case insensitive filesystem */
public abstract /* synthetic */ class C289055cw {
    public static float A00(C268024cd r5, long j) {
        if (AnonymousClass5Z5.A01(j) == 4294967296L) {
            return r5.F06(r5.Ezu(j));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }

    public static int A01(C268024cd r0, float f) {
        float F06 = r0.F06(f);
        if (Float.isInfinite(F06)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(F06);
    }

    public static long A02(C268024cd r1, float f) {
        return r1.FH9(r1.Ezv(f));
    }

    public static long A03(C268024cd r3, long j) {
        if (j == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float Ezv = r3.Ezv(C288025bF.A02(j));
        float Ezv2 = r3.Ezv(C288025bF.A00(j));
        long floatToRawIntBits = (long) Float.floatToRawIntBits(Ezv);
        return (((long) Float.floatToRawIntBits(Ezv2)) & 4294967295L) | (floatToRawIntBits << 32);
    }

    public static long A04(C268024cd r3, long j) {
        if (j != 9205357640488583168L) {
            return C288015bE.A00(r3.F06(Float.intBitsToFloat((int) (j >> 32))), r3.F06(Float.intBitsToFloat((int) (j & 4294967295L))));
        }
        return 9205357640488583168L;
    }
}
