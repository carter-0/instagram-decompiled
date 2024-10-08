package X;

/* renamed from: X.AkW  reason: case insensitive filesystem */
public final class C40862AkW implements Runnable {
    public final /* synthetic */ C388789oO A00;

    public C40862AkW(C388789oO r1) {
        this.A00 = r1;
    }

    public final void run() {
        C388789oO r3 = this.A00;
        C41838B2t b2t = r3.A04;
        if (b2t != null) {
            b2t.DxW(r3.A07());
        }
        for (C352278Cs Dxn : r3.A0A) {
            Dxn.Dxn(r3.A07());
        }
    }
}
