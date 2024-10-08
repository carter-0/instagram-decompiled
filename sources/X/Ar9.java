package X;

import android.os.Process;

public final class Ar9 implements Runnable {
    public static final Ar9 A00 = new Ar9();

    public final void run() {
        Process.setThreadPriority(-10);
    }
}
