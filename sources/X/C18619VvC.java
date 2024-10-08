package X;

/* renamed from: X.VvC  reason: case insensitive filesystem */
public final class C18619VvC {
    public float A00 = 0.0f;
    public float A01 = 0.0f;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public float A08;
    public float A09;

    public C18619VvC() {
        A00(this);
    }

    public static void A00(C18619VvC vvC) {
        vvC.A08 = 0.0f;
        vvC.A09 = 0.0f;
        vvC.A07 = 0.0f;
        vvC.A04 = 0.0f;
        vvC.A05 = 0.0f;
        vvC.A06 = 0.0f;
        vvC.A03 = -3.4028235E38f;
        vvC.A02 = Float.MAX_VALUE;
    }

    public final void A02(C18573VuP vuP, float f) {
        0qQ.A0B(vuP, 0);
        vuP.A05 += this.A08 * f;
        vuP.A06 += this.A09 * f;
        vuP.A02 += this.A04 * f;
        vuP.A03 += this.A05 * f;
        vuP.A04 += f * this.A06;
    }

    public final void A01(float f) {
        this.A08 += this.A00 * f;
        this.A09 = C229632nm.A02(this.A09 + (this.A01 * f), this.A03, this.A02);
        this.A04 += f * this.A07;
    }
}
