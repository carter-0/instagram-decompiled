package X;

public final /* synthetic */ class TH2 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C11450SVm A01;

    public /* synthetic */ TH2(C11450SVm sVm, int i) {
        this.A01 = sVm;
        this.A00 = i;
    }

    public final void run() {
        int i;
        C11450SVm sVm = this.A01;
        int i2 = this.A00;
        SwE swE = sVm.A01;
        if (i2 == -3) {
            i = 3;
        } else if (i2 == -2) {
            SwE.A00(swE, 0);
            i = 2;
        } else if (i2 == -1) {
            SwE.A00(swE, -1);
            if (swE.A00 != 0) {
                i = 0;
            } else {
                return;
            }
        } else if (i2 != 1) {
            2AG.A04(C66579MXk.A00(204), 002.A0O("Unknown focus change type: ", i2));
            return;
        } else {
            SwE.A01(swE, 1);
            SwE.A00(swE, 1);
            return;
        }
        SwE.A01(swE, i);
    }
}
