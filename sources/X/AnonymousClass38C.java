package X;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: X.38C  reason: invalid class name */
public final class AnonymousClass38C {
    public final AnonymousClass38G A00 = new Object();
    public final AnonymousClass38J A01 = AnonymousClass38J.A00;
    public final AnonymousClass38L A02 = new AnonymousClass38K();
    public final AnonymousClass38I A03 = new AnonymousClass38H();
    public final String A04;
    public final Executor A05;
    public final Executor A06;

    /* JADX WARNING: type inference failed for: r0v13, types: [X.38G, java.lang.Object] */
    public AnonymousClass38C(String str) {
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new AnonymousClass38E(false));
        0qQ.A07(newFixedThreadPool);
        this.A05 = newFixedThreadPool;
        ExecutorService newFixedThreadPool2 = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new AnonymousClass38E(true));
        0qQ.A07(newFixedThreadPool2);
        this.A06 = newFixedThreadPool2;
        this.A04 = str;
    }
}
