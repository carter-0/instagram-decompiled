package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;

/* renamed from: X.3zC  reason: invalid class name and case insensitive filesystem */
public abstract class C258513zC extends AbstractExecutorService implements C258483z9 {
    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.concurrent.RunnableFuture, java.lang.Object, X.3zD] */
    public final RunnableFuture newTaskFor(Callable callable) {
        ? obj = new Object();
        obj.A00 = new C258563zH(obj, callable);
        return obj;
    }

    /* renamed from: Eyj */
    public final ListenableFuture submit(Runnable runnable) {
        return super.submit(runnable);
    }

    /* renamed from: Eyk */
    public final ListenableFuture submit(Callable callable) {
        return super.submit(callable);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.concurrent.RunnableFuture, java.lang.Object, X.3zD] */
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        boolean z = 1K2.A02;
        Callable callable = Executors.callable(runnable, obj);
        ? obj2 = new Object();
        obj2.A00 = new C258563zH(obj2, callable);
        return obj2;
    }

    public final /* bridge */ /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return super.submit(runnable, obj);
    }
}
