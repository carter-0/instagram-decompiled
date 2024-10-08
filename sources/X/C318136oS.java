package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.6oS  reason: invalid class name and case insensitive filesystem */
public final class C318136oS implements C262224Cq, AutoCloseable {
    public final C262094Cc A00;

    public C318136oS(C262094Cc r2) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
    }

    public final C262094Cc ArX() {
        return this.A00;
    }

    public final void close() {
        AnonymousClass5H8.A01((CancellationException) null, this.A00);
    }
}
