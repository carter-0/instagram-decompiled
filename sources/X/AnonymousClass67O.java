package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.67O  reason: invalid class name */
public final class AnonymousClass67O extends AtomicBoolean implements Runnable, C65051aA {
    public final Runnable A00;

    public final void dispose() {
        lazySet(true);
    }

    public AnonymousClass67O(Runnable runnable) {
        this.A00 = runnable;
    }

    public final void run() {
        if (!get()) {
            try {
                this.A00.run();
            } finally {
                lazySet(true);
            }
        }
    }
}
