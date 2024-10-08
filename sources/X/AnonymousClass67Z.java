package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.67Z  reason: invalid class name */
public final class AnonymousClass67Z {
    public AnonymousClass67Y A00;

    public final void A00() {
        AnonymousClass67X r2 = (AnonymousClass67X) this.A00;
        if (r2.get() != 1af.A01) {
            try {
                r2.A00.onComplete();
            } finally {
                1af.A01(r2);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.1aA, java.lang.Object, java.util.concurrent.atomic.AtomicReference] */
    public final void A01(C3030867i r5) {
        1af r1;
        AtomicReference atomicReference = (AtomicReference) this.A00;
        ? atomicReference2 = new AtomicReference(new C3030967j(r5));
        do {
            r1 = (C65051aA) atomicReference.get();
            if (r1 == 1af.A01) {
                atomicReference2.dispose();
                return;
            }
        } while (!1FH.A00(r1, atomicReference2, atomicReference));
        if (r1 != null) {
            r1.dispose();
        }
    }

    public final void A02(Object obj) {
        AnonymousClass67X r2 = (AnonymousClass67X) this.A00;
        if (obj == null) {
            r2.A00(new NullPointerException(AnonymousClass000.A00(3691)));
        } else if (r2.get() != 1af.A01) {
            r2.A00.DUK(obj);
        }
    }
}
