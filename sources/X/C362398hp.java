package X;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: X.8hp  reason: invalid class name and case insensitive filesystem */
public final class C362398hp implements Executor {
    public final Handler A00 = new Handler(Looper.getMainLooper());

    public final void execute(Runnable runnable) {
        0qQ.A0B(runnable, 0);
        this.A00.post(runnable);
    }
}
