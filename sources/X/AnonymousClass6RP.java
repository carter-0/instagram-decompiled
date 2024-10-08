package X;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: X.6RP  reason: invalid class name */
public final class AnonymousClass6RP implements Executor {
    public final Handler A00;

    public final void execute(Runnable runnable) {
        0qQ.A0B(runnable, 0);
        Thread currentThread = Thread.currentThread();
        Handler handler = this.A00;
        if (currentThread == handler.getLooper().getThread()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    public AnonymousClass6RP(Handler handler) {
        this.A00 = handler;
    }
}
