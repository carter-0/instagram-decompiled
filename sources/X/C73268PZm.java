package X;

/* renamed from: X.PZm  reason: case insensitive filesystem */
public final class C73268PZm implements Runnable {
    public final /* synthetic */ C67679MsF A00;
    public final /* synthetic */ boolean A01;

    public C73268PZm(C67679MsF msF, boolean z) {
        this.A00 = msF;
        this.A01 = z;
    }

    public final void run() {
        C67679MsF msF = this.A00;
        C74362Ptc ptc = msF.A02;
        if (ptc != null) {
            ptc.DyG(msF.A01, msF.A00);
        }
        if (this.A01) {
            C67679MsF.A00(msF);
        } else {
            msF.requestLayout();
        }
    }
}
