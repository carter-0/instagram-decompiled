package X;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.TSq  reason: case insensitive filesystem */
public final class C13275TSq extends ThreadPoolExecutor {
    public final /* synthetic */ C11200SFa A00;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, java.util.concurrent.ThreadFactory] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13275TSq(C11200SFa sFa) {
        super(1, 1, 1, TimeUnit.MINUTES, new LinkedBlockingQueue());
        this.A00 = sFa;
        setThreadFactory(new Object());
        allowCoreThreadTimeOut(true);
    }

    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new C13268TSj(this, obj, runnable);
    }
}
