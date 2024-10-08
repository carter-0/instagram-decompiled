package X;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;

public final class Y2M implements Runnable {
    public final /* synthetic */ C21496Xcu A00;
    public final /* synthetic */ Callable A01;

    public Y2M(C21496Xcu xcu, Callable callable) {
        this.A00 = xcu;
        this.A01 = callable;
    }

    public final void run() {
        try {
            this.A00.A02(this.A01.call());
        } catch (CancellationException unused) {
            this.A00.A00();
        } catch (Exception e) {
            this.A00.A01(e);
        }
    }
}
