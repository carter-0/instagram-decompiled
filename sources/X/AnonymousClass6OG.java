package X;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: X.6OG  reason: invalid class name */
public final class AnonymousClass6OG implements Executor {
    public static final Executor A01 = new AnonymousClass6OG();
    public final Handler A00 = new Handler(Looper.getMainLooper());

    public final void execute(Runnable runnable) {
        0qQ.A0B(runnable, 0);
        if (Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            this.A00.post(runnable);
        }
    }
}
