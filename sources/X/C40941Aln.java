package X;

/* renamed from: X.Aln  reason: case insensitive filesystem */
public final class C40941Aln implements Runnable {
    public final /* synthetic */ C40098ARk A00;
    public final /* synthetic */ AXQ A01;

    public C40941Aln(C40098ARk aRk, AXQ axq) {
        this.A00 = aRk;
        this.A01 = axq;
    }

    public final void run() {
        C40098ARk aRk = this.A00;
        AXQ axq = this.A01;
        aRk.A0I = axq;
        if (aRk.A02 != null) {
            boolean A002 = C344237rX.A00();
            C346337v0 r0 = aRk.A02;
            if (A002) {
                r0 = ((C381079b8) r0).A00;
            }
            axq.A02(r0);
        }
    }
}
