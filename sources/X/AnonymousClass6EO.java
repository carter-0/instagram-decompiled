package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.6EO  reason: invalid class name */
public final class AnonymousClass6EO extends AtomicReference implements AnonymousClass6EP {
    public int A00;
    public AnonymousClass6EQ A01;
    public final int A02;

    public AnonymousClass6EO(int i) {
        this();
        this.A02 = 1;
    }

    public final void EFP(AnonymousClass6ER r5) {
        if (r5.getAndIncrement() == 0) {
            int i = 1;
            do {
                AnonymousClass6EQ r1 = (AtomicReference) r5.A00;
                if (r1 == null) {
                    r1 = (AtomicReference) get();
                    r5.A00 = r1;
                }
                while (!r5.A03) {
                    AnonymousClass6EQ r2 = (AnonymousClass6EQ) r1.get();
                    if (r2 != null) {
                        if (1ai.A00(r5.A01, r2.A00)) {
                            r5.A00 = null;
                            return;
                        }
                        r1 = r2;
                    } else {
                        r5.A00 = r1;
                        i = r5.addAndGet(-i);
                    }
                }
                return;
            } while (i != 0);
        }
    }

    public AnonymousClass6EO() {
        AnonymousClass6EQ r0 = new AnonymousClass6EQ((Object) null);
        this.A01 = r0;
        set(r0);
    }
}
