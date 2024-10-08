package X;

import java.util.ArrayDeque;

public final /* synthetic */ class TDR implements Runnable {
    public final /* synthetic */ Runnable A00;

    public /* synthetic */ TDR(Runnable runnable) {
        this.A00 = runnable;
    }

    public final void run() {
        Runnable runnable = this.A00;
        C8496Qvs.A01.set(new ArrayDeque());
        runnable.run();
    }
}
