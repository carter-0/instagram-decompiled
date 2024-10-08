package X;

import android.os.Handler;
import java.util.concurrent.Executor;

public final /* synthetic */ class Y4A implements Executor {
    public final /* synthetic */ Handler A00;

    public /* synthetic */ Y4A(Handler handler) {
        this.A00 = handler;
    }

    public final void execute(Runnable runnable) {
        this.A00.post(runnable);
    }
}
