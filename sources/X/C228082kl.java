package X;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

/* renamed from: X.2kl  reason: invalid class name and case insensitive filesystem */
public final class C228082kl extends PhantomReference {
    public final Runnable A00;

    public C228082kl(Object obj, Runnable runnable, ReferenceQueue referenceQueue) {
        super(obj, referenceQueue);
        this.A00 = runnable;
    }
}
