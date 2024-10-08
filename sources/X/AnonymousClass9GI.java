package X;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: X.9GI  reason: invalid class name */
public final class AnonymousClass9GI implements Executor {
    public final Handler A00 = new AnonymousClass9GJ(Looper.getMainLooper());

    public final void execute(Runnable runnable) {
        this.A00.post(runnable);
    }
}
