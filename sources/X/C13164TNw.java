package X;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: X.TNw  reason: case insensitive filesystem */
public final class C13164TNw implements Executor {
    public final Handler A00;

    public final void execute(Runnable runnable) {
        this.A00.post(runnable);
    }

    public C13164TNw(Looper looper) {
        this.A00 = new AnonymousClass64C(looper);
    }
}
