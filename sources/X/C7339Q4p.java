package X;

/* renamed from: X.Q4p  reason: case insensitive filesystem */
public final class C7339Q4p {
    public float A00;
    public float A01;
    public float A02;
    public final float A03;
    public final float A04;
    public final C13863Tij A05;
    public final C13821Thq A06;

    public static final void A00(C7339Q4p q4p) {
        C13863Tij tij = q4p.A05;
        tij.DtM(q4p.A01);
        float f = (q4p.A00 * q4p.A03) + (q4p.A02 * q4p.A04);
        tij.Dtc(f);
        q4p.A06.DaE((q4p.A01 * 0.4f) + (f * 0.6f));
    }

    public C7339Q4p(C13863Tij tij, C13821Thq thq, boolean z) {
        this.A06 = thq;
        this.A05 = tij;
        float f = z ? 0.0f : 0.1f;
        this.A03 = f;
        this.A04 = 1.0f - f;
    }
}
