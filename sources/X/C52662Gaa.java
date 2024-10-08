package X;

/* renamed from: X.Gaa  reason: case insensitive filesystem */
public final class C52662Gaa implements JQM {
    public final /* synthetic */ C52661GaZ A00;

    public final void DO2() {
        C52661GaZ gaZ = this.A00;
        C52058GDe gDe = gaZ.A01;
        C267324bN r1 = gaZ.A00;
        if (!(gDe == null || r1 == null)) {
            C52146GGo.A00(r1, gDe, gaZ.A03);
        }
        JRK jrk = gaZ.A02;
        if (jrk != null && !jrk.isPlaying() && gaZ.A00 == AnonymousClass3OB.PREPARING) {
            gaZ.EJ0("resume", false);
        }
    }

    public C52662Gaa(C52661GaZ gaZ) {
        this.A00 = gaZ;
    }

    public final void CvJ() {
        C52661GaZ.A00(this.A00);
    }

    public final void CvK() {
        C52661GaZ.A00(this.A00);
    }
}
