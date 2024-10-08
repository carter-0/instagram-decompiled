package X;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: X.6R4  reason: invalid class name */
public final class AnonymousClass6R4 implements Executor {
    public final Handler A00;

    public final void execute(Runnable runnable) {
        0qQ.A0B(runnable, 0);
        this.A00.post(runnable);
    }

    public AnonymousClass6R4(Handler handler) {
        this.A00 = handler;
    }
}
