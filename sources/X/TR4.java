package X;

import android.os.Process;

public final class TR4 extends Thread {
    public final int A00 = 9;

    public TR4(Runnable runnable, String str) {
        super(runnable, str);
    }

    public final void run() {
        Process.setThreadPriority(this.A00);
        super.run();
    }
}
