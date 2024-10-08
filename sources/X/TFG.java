package X;

import android.os.Process;

public final class TFG implements Runnable {
    public final /* synthetic */ TOJ A00;
    public final /* synthetic */ Runnable A01;

    public TFG(TOJ toj, Runnable runnable) {
        this.A00 = toj;
        this.A01 = runnable;
    }

    public final void run() {
        Process.setThreadPriority(10);
        this.A01.run();
    }
}
