package X;

import android.os.Process;

/* renamed from: X.TQy  reason: case insensitive filesystem */
public final class C13232TQy extends Thread {
    public final int A00;

    public final void run() {
        Process.setThreadPriority(this.A00);
        super.run();
    }

    public C13232TQy(Runnable runnable, String str, int i) {
        super(runnable, str);
        this.A00 = i;
    }
}
