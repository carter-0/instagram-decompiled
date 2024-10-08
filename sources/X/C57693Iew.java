package X;

/* renamed from: X.Iew  reason: case insensitive filesystem */
public final class C57693Iew implements JQY {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C267324bN A01;
    public final /* synthetic */ C52058GDe A02;
    public final /* synthetic */ 1Xj A03;
    public final /* synthetic */ GCR A04;

    public C57693Iew(C267324bN r1, C52058GDe gDe, 1Xj r3, GCR gcr, int i) {
        this.A03 = r3;
        this.A04 = gcr;
        this.A01 = r1;
        this.A02 = gDe;
        this.A00 = i;
    }

    public final void Cvi(boolean z) {
        2EG r3;
        GCR gcr = this.A04;
        C267324bN r1 = this.A01;
        C52058GDe gDe = this.A02;
        int i = this.A00;
        if (z) {
            r3 = 2EG.A13;
        } else {
            r3 = 2EG.A0y;
        }
        gcr.Cvk(r1, gDe, r3, (String) null, -1.0f, -1.0f, i, false, false);
    }

    public final void CzM() {
        GCR.A00(this.A01, this.A04, this.A00);
    }

    public final boolean Esd() {
        1Xj r2 = this.A03;
        GCR gcr = this.A04;
        return C55256Hel.A00(gcr.A03, r2, gcr.A08);
    }
}
