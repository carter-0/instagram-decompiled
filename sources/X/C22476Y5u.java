package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Y5u  reason: case insensitive filesystem */
public final class C22476Y5u extends AtomicReference implements Runnable, C65051aA {
    public final C22475Y5s A00 = new AtomicReference();
    public final C22475Y5s A01 = new AtomicReference();

    public final void dispose() {
        if (getAndSet((Object) null) != null) {
            1af.A01(this.A01);
            1af.A01(this.A00);
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.concurrent.atomic.AtomicReference, X.Y5s] */
    /* JADX WARNING: type inference failed for: r0v1, types: [java.util.concurrent.atomic.AtomicReference, X.Y5s] */
    public C22476Y5u(Runnable runnable) {
        super(runnable);
    }

    public final void run() {
        Runnable runnable = (Runnable) get();
        if (runnable != null) {
            try {
                runnable.run();
            } finally {
                lazySet((Object) null);
                C22475Y5s y5s = this.A01;
                1af r1 = 1af.A01;
                y5s.lazySet(r1);
                this.A00.lazySet(r1);
            }
        }
    }
}
