package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.66n  reason: invalid class name */
public final class AnonymousClass66n extends AtomicInteger implements Runnable, AnonymousClass66o {
    public final 1aL A00;
    public final Object A01;

    public final int EHR(int i) {
        if ((i & 1) == 0) {
            return 0;
        }
        lazySet(1);
        return 1;
    }

    public final void clear() {
        lazySet(3);
    }

    public final void dispose() {
        set(3);
    }

    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public AnonymousClass66n(1aL r1, Object obj) {
        this.A00 = r1;
        this.A01 = obj;
    }

    public final boolean isEmpty() {
        if (get() == 1) {
            return false;
        }
        return true;
    }

    public final Object poll() {
        if (get() != 1) {
            return null;
        }
        lazySet(3);
        return this.A01;
    }

    public final void run() {
        if (get() == 0 && compareAndSet(0, 2)) {
            1aL r1 = this.A00;
            r1.DUK(this.A01);
            if (get() == 2) {
                lazySet(3);
                r1.onComplete();
            }
        }
    }
}
