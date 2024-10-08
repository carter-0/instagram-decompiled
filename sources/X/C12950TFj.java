package X;

import android.os.Process;

/* renamed from: X.TFj  reason: case insensitive filesystem */
public final class C12950TFj implements Runnable {
    public final /* synthetic */ TOQ A00;
    public final /* synthetic */ Runnable A01;

    public C12950TFj(TOQ toq, Runnable runnable) {
        this.A00 = toq;
        this.A01 = runnable;
    }

    public final void run() {
        Process.setThreadPriority(this.A00.A00);
        this.A01.run();
    }
}
