package X;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public final class Ni3 extends C318286oh {
    public final AtomicBoolean A00 = new AtomicBoolean();
    public final C65041a9 A01;
    public final C318346on A02;
    public final C318336om A03;

    public final C65051aA A01(Runnable runnable, TimeUnit timeUnit, long j) {
        C65041a9 r1 = this.A01;
        if (r1.A01) {
            return AnonymousClass6F8.INSTANCE;
        }
        return this.A03.A02(r1, runnable, timeUnit, j);
    }

    public final void dispose() {
        if (this.A00.compareAndSet(false, true)) {
            this.A01.dispose();
            C318346on r5 = this.A02;
            C318336om r4 = this.A03;
            r4.A00 = System.nanoTime() + r5.A00;
            r5.A02.offer(r4);
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, X.1a9] */
    /* JADX WARNING: type inference failed for: r2v0, types: [X.6om, X.6og, X.1aA] */
    public Ni3(C318346on r5) {
        C318336om r2;
        this.A02 = r5;
        this.A01 = new Object();
        C65041a9 r3 = r5.A01;
        if (!r3.A01) {
            while (true) {
                ConcurrentLinkedQueue concurrentLinkedQueue = r5.A02;
                if (concurrentLinkedQueue.isEmpty()) {
                    ? r22 = new C318276og(r5.A05);
                    r22.A00 = 0;
                    r3.A7i(r22);
                    r2 = r22;
                    break;
                }
                C318336om r23 = (C318336om) concurrentLinkedQueue.poll();
                if (r23 != null) {
                    r2 = r23;
                    break;
                }
            }
        } else {
            r2 = C318326ol.A04;
        }
        this.A03 = r2;
    }
}
