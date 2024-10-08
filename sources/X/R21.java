package X;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.TimeUnit;

public abstract class R21 extends Q2Z {
    public final Handler A00;

    public R21(Handler handler) {
        this.A00 = handler;
    }

    public final Object get(long j, TimeUnit timeUnit) {
        if (Looper.myLooper() != this.A00.getLooper() || isDone()) {
            return super.get(j, timeUnit);
        }
        throw AnonymousClass7TE.A0z("Must not call get() function from this Handler thread. Will deadlock!");
    }

    public final Object get() {
        if (Looper.myLooper() != this.A00.getLooper() || isDone()) {
            return super.get();
        }
        throw AnonymousClass7TE.A0z("Must not call get() function from this Handler thread. Will deadlock!");
    }
}
