package X;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class XQJ extends C318286oh implements C65051aA {
    public final PriorityBlockingQueue A00 = new PriorityBlockingQueue();
    public final AtomicInteger A01 = new AtomicInteger();
    public final AtomicInteger A02 = new AtomicInteger();
    public volatile boolean A03;

    public final void dispose() {
        this.A03 = true;
    }

    public final C65051aA A00(Runnable runnable) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return A02(runnable, timeUnit.convert(System.currentTimeMillis(), timeUnit));
    }

    public final C65051aA A01(Runnable runnable, TimeUnit timeUnit, long j) {
        TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
        long convert = timeUnit2.convert(System.currentTimeMillis(), timeUnit2) + timeUnit.toMillis(j);
        return A02(new Y3W(this, runnable, convert), convert);
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [X.1aA, java.util.concurrent.atomic.AtomicReference] */
    public final C65051aA A02(Runnable runnable, long j) {
        if (!this.A03) {
            Y1V y1v = new Y1V(Long.valueOf(j), runnable, this.A01.incrementAndGet());
            PriorityBlockingQueue priorityBlockingQueue = this.A00;
            priorityBlockingQueue.add(y1v);
            AtomicInteger atomicInteger = this.A02;
            if (atomicInteger.getAndIncrement() != 0) {
                return new AtomicReference(new Y30(y1v, this));
            }
            int i = 1;
            while (true) {
                if (this.A03) {
                    priorityBlockingQueue.clear();
                    break;
                }
                Y1V y1v2 = (Y1V) priorityBlockingQueue.poll();
                if (y1v2 == null) {
                    i = atomicInteger.addAndGet(-i);
                    if (i == 0) {
                        break;
                    }
                } else if (!y1v2.A03) {
                    y1v2.A02.run();
                }
            }
        }
        return AnonymousClass6F8.INSTANCE;
    }
}
