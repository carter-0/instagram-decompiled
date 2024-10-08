package X;

import android.os.Process;

public final class PyN implements Runnable {
    public final Runnable A00;

    public PyN(Runnable runnable) {
        this.A00 = runnable;
    }

    public final void run() {
        Process.setThreadPriority(0);
        this.A00.run();
    }
}
