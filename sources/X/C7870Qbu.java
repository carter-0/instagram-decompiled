package X;

import android.os.Handler;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Qbu  reason: case insensitive filesystem */
public class C7870Qbu extends C7874Qby implements Runnable, C13987Tnd, ScheduledFuture {
    public final C13269TSk A00;

    public final void run() {
        this.A00.run();
    }

    public C7870Qbu(Handler handler, Object obj, Runnable runnable) {
        super(handler);
        this.A00 = new C13269TSk(runnable, obj);
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        throw C66580MXl.A11();
    }

    public final long getDelay(TimeUnit timeUnit) {
        throw C66580MXl.A11();
    }

    public C7870Qbu(Handler handler, Callable callable) {
        super(handler);
        this.A00 = new C13269TSk(callable);
    }
}
