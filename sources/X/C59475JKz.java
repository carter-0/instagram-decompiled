package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.JKz  reason: case insensitive filesystem */
public final class C59475JKz extends C252673pU implements C262224Cq, C249533jw {
    public final void A0M(Throwable th) {
        C249513ju r2 = this.A00;
        CancellationException cancellationException = null;
        if (th != null && (!(th instanceof CancellationException) || (cancellationException = (CancellationException) th) == null)) {
            cancellationException = new CancellationException(002.A0R(C51968G9o.A16(this), " was cancelled"));
            cancellationException.initCause(th);
        }
        r2.AG7(cancellationException);
    }

    public final boolean A0S(Throwable th) {
        C9878Rir.A00(this.A00, th);
        return true;
    }
}
