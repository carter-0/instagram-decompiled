package X;

import java.util.concurrent.CancellationException;

public final class Y32 implements Runnable {
    public final /* synthetic */ Y95 A00;
    public final /* synthetic */ XtE A01;
    public final /* synthetic */ C21496Xcu A02;

    public Y32(Y95 y95, XtE xtE, C21496Xcu xcu) {
        this.A02 = xcu;
        this.A00 = y95;
        this.A01 = xtE;
    }

    public final void run() {
        try {
            this.A02.A02(this.A00.Ezi(this.A01));
        } catch (CancellationException unused) {
            this.A02.A00();
        } catch (Exception e) {
            this.A02.A01(e);
        }
    }
}
