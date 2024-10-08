package X;

import java.util.concurrent.Future;

/* renamed from: X.Aut  reason: case insensitive filesystem */
public final class C41495Aut implements AnonymousClass19L {
    public final Future A00;

    public final void dispose() {
        this.A00.cancel(false);
    }

    public C41495Aut(Future future) {
        this.A00 = future;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("DisposableFutureHandle[");
        A1A.append(this.A00);
        A1A.append(']');
        return A1A.toString();
    }
}
