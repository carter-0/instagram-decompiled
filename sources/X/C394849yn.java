package X;

/* renamed from: X.9yn  reason: invalid class name and case insensitive filesystem */
public abstract class C394849yn {
    public static final float A00(C279284yO r7, C3498982i r8, C339977kU r9, int i, int i2, int i3, int i4, boolean z) {
        if (r7 instanceof AnonymousClass80O) {
            if (r9 == C339977kU.HORIZONTAL) {
                return 0.5f;
            }
            return 1.0f;
        } else if (r7 != AnonymousClass9QA.A00 || r8 == null) {
            return 1.0f;
        } else {
            int ordinal = r9.ordinal();
            if (ordinal == 0) {
                float f = (float) i;
                float A0l = (0.5f * f) / r8.A03.A0l();
                return Math.min(A0l / ((float) i2), (A0l * (((float) i3) / ((float) i4))) / f);
            } else if (ordinal == 1) {
                float f2 = (float) i2;
                float f3 = (float) i;
                float A0l2 = r8.A03.A0l();
                if (A0l2 >= 1.0f / (f3 / (0.5f * f2))) {
                    return 1.0f;
                }
                if (z) {
                    return A0l2 * Math.min((f3 / f2) / (((float) i3) / ((float) i4)), 1.0f);
                }
                return A0l2;
            } else {
                throw AnonymousClass7TE.A1K();
            }
        }
    }
}
