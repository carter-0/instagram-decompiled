package X;

import java.io.Closeable;
import java.util.concurrent.CancellationException;

/* renamed from: X.3g7  reason: invalid class name and case insensitive filesystem */
public abstract class C247303g7 implements Closeable {
    public C262224Cq A00 = null;
    public boolean A01;

    public final C262224Cq A03() {
        C262224Cq r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass19S A02 = 19E.A02(new AnonymousClass19G((C262204Co) null).plus(AnonymousClass12T.A00.AOJ(1473286220, 3)));
        this.A00 = A02;
        return A02;
    }

    public final void close() {
        C262224Cq r1;
        if (!this.A01 && (r1 = this.A00) != null) {
            19E.A05((CancellationException) null, r1);
        }
    }

    public void A04(AnonymousClass8ZF r2, boolean z) {
        this.A00 = C318116oQ.A00(r2);
        this.A01 = true;
        r2.addCloseable(this);
    }
}
