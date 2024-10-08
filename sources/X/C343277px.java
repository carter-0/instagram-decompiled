package X;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: X.7px  reason: invalid class name and case insensitive filesystem */
public final class C343277px implements Executor {
    public final Handler A00;

    public final void execute(Runnable runnable) {
        Handler handler = this.A00;
        runnable.getClass();
        if (!handler.post(runnable)) {
            StringBuilder sb = new StringBuilder();
            sb.append(handler);
            sb.append(" is shutting down");
            throw new RejectedExecutionException(sb.toString());
        }
    }

    public C343277px(Handler handler) {
        handler.getClass();
        this.A00 = handler;
    }
}
