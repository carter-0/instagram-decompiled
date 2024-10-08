package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;

/* renamed from: X.TSm  reason: case insensitive filesystem */
public final class C13271TSm extends FutureTask implements ListenableFuture {
    public final C3722590c A00;
    public final WeakReference A01;
    public final WeakReference A02;

    public final void addListener(Runnable runnable, Executor executor) {
        this.A00.A02(runnable, executor);
    }

    public final void done() {
        this.A00.A01();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.90c] */
    public C13271TSm(Runnable runnable, Object obj) {
        super(runnable, obj);
        this.A00 = new Object();
        this.A01 = null;
        this.A02 = C51965G9l.A0v(runnable);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.90c] */
    public C13271TSm(Callable callable) {
        super(callable);
        this.A00 = new Object();
        this.A01 = C51965G9l.A0v(callable);
        this.A02 = null;
    }
}
