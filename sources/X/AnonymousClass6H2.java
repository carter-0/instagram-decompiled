package X;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.6H2  reason: invalid class name */
public final class AnonymousClass6H2 {
    public final AtomicReference A00 = new AtomicReference((Object) null);
    public final 136 A01 = new 136();

    public static final void A00(C59715JUy jUy, AnonymousClass6H2 r5) {
        AtomicReference atomicReference;
        C59715JUy jUy2;
        do {
            atomicReference = r5.A00;
            jUy2 = (C59715JUy) atomicReference.get();
            if (jUy2 != null && jUy.A00.compareTo(jUy2.A00) < 0) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        } while (!1FH.A00(jUy2, jUy, atomicReference));
        if (jUy2 != null) {
            jUy2.A01.AG7(new C378089Ol());
        }
    }
}
