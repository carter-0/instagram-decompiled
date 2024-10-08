package X;

import java.util.Map;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.6QY  reason: invalid class name */
public final class AnonymousClass6QY {
    public AnonymousClass6SE A00 = null;
    public RunnableFuture A01;
    public final AtomicInteger A02 = new AtomicInteger(-1);

    public AnonymousClass6QY(C307786Rm r3, AnonymousClass6S3 r4, AnonymousClass6SE r5, Map map) {
        this.A01 = new FutureTask(new AnonymousClass6QZ(r3, r4, r5, map));
    }
}
