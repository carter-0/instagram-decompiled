package X;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: X.2gq  reason: invalid class name and case insensitive filesystem */
public final class C226452gq implements Executor {
    public final void execute(Runnable runnable) {
        new Handler(Looper.getMainLooper()).post(runnable);
    }
}
