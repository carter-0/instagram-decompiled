package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.67X  reason: invalid class name */
public final class AnonymousClass67X extends AtomicReference implements C65051aA, AnonymousClass67Y {
    public final 1aL A00;

    public AnonymousClass67X(1aL r1) {
        this.A00 = r1;
    }

    public final void A00(Throwable th) {
        if (get() == 1af.A01) {
            C318176oW.A01(th);
            return;
        }
        try {
            this.A00.onError(th);
        } finally {
            1af.A01(this);
        }
    }

    public final void dispose() {
        1af.A01(this);
    }

    public final String toString() {
        return String.format("%s{%s}", new Object[]{getClass().getSimpleName(), super.toString()});
    }
}
