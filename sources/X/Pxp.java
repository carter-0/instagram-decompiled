package X;

public final /* synthetic */ class Pxp implements Runnable {
    public final /* synthetic */ Pxm A00;

    public /* synthetic */ Pxp(Pxm pxm) {
        this.A00 = pxm;
    }

    public final void run() {
        Pxm pxm = this.A00;
        Pxm pxm2 = Pxm.A08;
        if (pxm.A00 == 0) {
            pxm.A03 = true;
            pxm.A05.A0B(07T.ON_PAUSE);
        }
        if (pxm.A01 == 0 && pxm.A03) {
            pxm.A05.A0B(07T.ON_STOP);
            pxm.A04 = true;
        }
    }
}
