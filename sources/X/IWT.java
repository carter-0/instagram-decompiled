package X;

public final class IWT implements JPU {
    public final /* synthetic */ JPU A00;
    public final /* synthetic */ C55836HoJ A01;

    public IWT(JPU jpu, C55836HoJ hoJ) {
        this.A01 = hoJ;
        this.A00 = jpu;
    }

    public final void DEc(String str) {
        0KC.A0P("connectivity_prober", "Connectivity probe failed (%s).", new Object[]{str});
        C55836HoJ hoJ = this.A01;
        02m r4 = hoJ.A04;
        r4.markerAnnotate(79501264, "error_message", str);
        r4.markerAnnotate(79501264, C66579MXk.A00(71), hoJ.A02);
        r4.markerEnd(79501264, 3);
        this.A00.DEc(str);
    }

    public final void Do9(int i, int i2) {
        0KC.A0P("connectivity_prober", C66579MXk.A00(498), AnonymousClass7TF.A1b(i));
        02m r2 = this.A01.A04;
        r2.markerAnnotate(79501264, AnonymousClass000.A00(1838), i);
        r2.markerAnnotate(79501264, C66579MXk.A00(71), i2);
        r2.markerEnd(79501264, 2);
        this.A00.Do9(i, i2);
    }
}
