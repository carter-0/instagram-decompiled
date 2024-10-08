package X;

/* renamed from: X.Y2r  reason: case insensitive filesystem */
public final class C22409Y2r implements Runnable {
    public final /* synthetic */ Y00 A00;
    public final /* synthetic */ C17731Vd0 A01;

    public C22409Y2r(Y00 y00, C17731Vd0 vd0) {
        this.A00 = y00;
        this.A01 = vd0;
    }

    public final void run() {
        C17731Vd0 vd0 = this.A01;
        Y00 y00 = this.A00;
        YAE yae = y00.A00;
        if (vd0 == null) {
            yae.DME();
        } else {
            yae.DLp(vd0);
        }
        C279254yK.A02(y00.A01, y00.A02);
    }
}
