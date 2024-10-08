package X;

/* renamed from: X.GFg  reason: case insensitive filesystem */
public abstract class C52112GFg {
    public static 2WX A00(2Wa r0, 2WX r1) {
        return A01(r1, ((Number) r0.A03).floatValue());
    }

    public static final 2WX A01(2WX r2, float f) {
        if (2Sa.isZeroAlphaLoggingEnabled && f <= 0.0f) {
            RVZ.A00(2SO.A06, C13359TWt.A00);
        }
        IIV iiv = new IIV(AnonymousClass05K.A00, f);
        if (r2 == 2WX.A02) {
            r2 = null;
        }
        return new 2WX(r2, iiv);
    }
}
