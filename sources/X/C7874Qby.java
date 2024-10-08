package X;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Qby  reason: case insensitive filesystem */
public abstract class C7874Qby extends C7875Qbz {
    public final Handler A00;

    public C7874Qby(Handler handler) {
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
