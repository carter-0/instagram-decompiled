package X;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.6FM  reason: invalid class name */
public final class AnonymousClass6FM extends C318286oh implements Runnable {
    public final C65041a9 A00 = new Object();
    public final AnonymousClass6FN A01;
    public final Executor A02;
    public final AtomicInteger A03 = new AtomicInteger();
    public volatile boolean A04;

    public final void dispose() {
        if (!this.A04) {
            this.A04 = true;
            this.A00.dispose();
            if (this.A03.getAndIncrement() == 0) {
                this.A01.clear();
            }
        }
    }

    public final void run() {
        AnonymousClass6FN r3 = this.A01;
        int i = 1;
        while (!this.A04) {
            Runnable runnable = (Runnable) r3.poll();
            if (runnable == null) {
                if (this.A04) {
                    break;
                }
                i = this.A03.addAndGet(-i);
                if (i == 0) {
                    return;
                }
            } else {
                runnable.run();
            }
        }
        r3.clear();
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, X.1a9] */
    public AnonymousClass6FM(Executor executor) {
        this.A02 = executor;
        this.A01 = new AnonymousClass6FN();
    }
}
