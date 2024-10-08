package X;

import android.os.Process;

/* renamed from: X.TQz  reason: case insensitive filesystem */
public final class C13233TQz extends Thread {
    public final /* synthetic */ TOE A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13233TQz(TOE toe, Runnable runnable) {
        super(runnable);
        this.A00 = toe;
    }

    public final void run() {
        Process.setThreadPriority(9);
        super.run();
    }
}
