package X;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: X.95h  reason: invalid class name and case insensitive filesystem */
public final class C3734295h implements Executor {
    public static final Handler A00 = new Handler(Looper.getMainLooper());

    public final void execute(Runnable runnable) {
        A00.post(runnable);
    }
}
