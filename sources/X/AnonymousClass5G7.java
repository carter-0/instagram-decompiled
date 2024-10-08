package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.5G7  reason: invalid class name */
public abstract class AnonymousClass5G7 {
    public static final void A00(Throwable th, C249533jw r3) {
        CancellationException cancellationException = null;
        if (th != null && (!(th instanceof CancellationException) || (cancellationException = (CancellationException) th) == null)) {
            cancellationException = new CancellationException("Channel was consumed, consumer had failed");
            cancellationException.initCause(th);
        }
        r3.AG7(cancellationException);
    }
}
