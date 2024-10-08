package X;

import android.os.Process;

public final class THT implements Runnable {
    public final int A00;
    public final Runnable A01;

    public final void run() {
        Process.setThreadPriority(10 - this.A00);
        this.A01.run();
    }

    public THT(int i, Runnable runnable) {
        this.A01 = runnable;
        this.A00 = i;
    }
}
