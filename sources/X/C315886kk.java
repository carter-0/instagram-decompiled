package X;

/* renamed from: X.6kk  reason: invalid class name and case insensitive filesystem */
public final class C315886kk {
    public float A00 = -1.0f;
    public float A01 = -1.0f;
    public long A02;
    public long A03;
    public boolean A04;
    public boolean A05;
    public final AnonymousClass0JP A06;
    public final C315876kj A07;

    public C315886kk(AnonymousClass0JP r2, C315876kj r3) {
        0qQ.A0B(r2, 1);
        this.A06 = r2;
        this.A07 = r3;
    }

    public final void A00(float f, float f2) {
        if (this.A05) {
            this.A05 = false;
            C315796kZ r1 = this.A07.A00;
            C8836RBw rBw = r1.A04;
            if (rBw != null) {
                rBw.A05(new C10711Rwp(AnonymousClass05K.A0C, 1.0f, f / ((float) r1.A01), f2 / ((float) r1.A00)));
            }
        }
    }
}
