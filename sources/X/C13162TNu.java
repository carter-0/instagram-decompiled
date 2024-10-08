package X;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: X.TNu  reason: case insensitive filesystem */
public final class C13162TNu implements Executor {
    public final Handler A00 = AnonymousClass7TF.A0D();

    public final void execute(Runnable runnable) {
        this.A00.post(runnable);
    }
}
