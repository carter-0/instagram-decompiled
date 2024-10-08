package X;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: X.2rf  reason: invalid class name and case insensitive filesystem */
public final class C231432rf implements Executor {
    public final Handler A00 = new Handler(Looper.getMainLooper());

    public final void execute(Runnable runnable) {
        this.A00.post(runnable);
    }
}
