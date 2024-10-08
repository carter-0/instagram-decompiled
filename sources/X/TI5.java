package X;

import java.util.concurrent.CancellationException;

public final class TI5 implements Runnable {
    public final /* synthetic */ Y95 A00;
    public final /* synthetic */ XtE A01;
    public final /* synthetic */ C21496Xcu A02;

    public TI5(Y95 y95, XtE xtE, C21496Xcu xcu) {
        this.A02 = xcu;
        this.A00 = y95;
        this.A01 = xtE;
    }

    public final void run() {
        try {
            XtE xtE = (XtE) this.A00.Ezi(this.A01);
            if (xtE == null) {
                this.A02.A02((Object) null);
            } else {
                xtE.A02(new C11767SgD(this, 0), XtE.A0A);
            }
        } catch (CancellationException unused) {
            this.A02.A00();
        } catch (Exception e) {
            this.A02.A01(e);
        }
    }
}
