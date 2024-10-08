package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.5Xh  reason: invalid class name and case insensitive filesystem */
public final class C286665Xh implements AnonymousClass2DP {
    public C262204Co A00;
    public final 0sL A01;
    public final C262224Cq A02;

    public final void Csx() {
        C262204Co r1 = this.A00;
        if (r1 != null) {
            r1.AG7(new PzS());
        }
        this.A00 = null;
    }

    public final void DGg() {
        C262204Co r1 = this.A00;
        if (r1 != null) {
            r1.AG7(new PzS());
        }
        this.A00 = null;
    }

    public final void DdA() {
        C262204Co r3 = this.A00;
        if (r3 != null) {
            CancellationException cancellationException = new CancellationException("Old job was still running!");
            cancellationException.initCause((Throwable) null);
            r3.AG7(cancellationException);
        }
        C262224Cq r32 = this.A02;
        0sL r2 = this.A01;
        this.A00 = 1Eo.A03(AnonymousClass05K.A00, 19B.A00, r2, r32);
    }

    public C286665Xh(C262094Cc r2, 0sL r3) {
        this.A01 = r3;
        this.A02 = 19E.A02(r2);
    }
}
