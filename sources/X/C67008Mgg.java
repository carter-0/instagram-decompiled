package X;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: X.Mgg  reason: case insensitive filesystem */
public final class C67008Mgg implements Executor {
    public final Handler A00 = AnonymousClass7TF.A0D();

    public final void execute(Runnable runnable) {
        this.A00.post(runnable);
    }
}
