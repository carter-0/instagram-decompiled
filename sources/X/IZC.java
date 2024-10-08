package X;

public final class IZC implements JQM {
    public final /* synthetic */ C54597HKg A00;

    public final void CvJ() {
    }

    public final void CvK() {
    }

    public IZC(C54597HKg hKg) {
        this.A00 = hKg;
    }

    public final void DO2() {
        C52058GDe gDe;
        C54597HKg hKg = this.A00;
        C267324bN r2 = hKg.A00;
        if (!(r2 == null || (gDe = hKg.A01) == null)) {
            C52146GGo.A00(r2, gDe, hKg.A03);
        }
        JRK jrk = hKg.A02;
        if (jrk != null && !jrk.isPlaying()) {
            hKg.EJ0("resume", false);
        }
    }
}
