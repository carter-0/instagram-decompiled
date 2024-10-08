package X;

import android.os.Handler;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class QLQ extends R21 implements Runnable, ListenableFuture, RunnableFuture, ScheduledFuture {
    public final C13271TSm A00;

    public final boolean cancel(boolean z) {
        return super.cancel(false);
    }

    public final /* bridge */ /* synthetic */ Object A00() {
        return this.A00;
    }

    public final void addListener(Runnable runnable, Executor executor) {
        this.A00.addListener(runnable, executor);
    }

    public final void run() {
        this.A00.run();
    }

    public QLQ(Handler handler, Object obj, Runnable runnable) {
        super(handler);
        this.A00 = new C13271TSm(runnable, obj);
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        throw C66580MXl.A11();
    }

    public final long getDelay(TimeUnit timeUnit) {
        throw C66580MXl.A11();
    }

    public QLQ(Handler handler, Callable callable) {
        super(handler);
        this.A00 = new C13271TSm(callable);
    }
}
