package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.7vs  reason: invalid class name and case insensitive filesystem */
public final class C346857vs {
    public final C346847vr A00;
    public final 07U A01;
    public final AnonymousClass07V A02;
    public final AnonymousClass0hF A03;

    public C346857vs(C346847vr r4, 07U r5, AnonymousClass07V r6, C262204Co r7) {
        0qQ.A0B(r6, 1);
        0qQ.A0B(r5, 2);
        0qQ.A0B(r4, 3);
        this.A02 = r6;
        this.A01 = r5;
        this.A00 = r4;
        C346867vt r2 = new C346867vt(this, r7);
        this.A03 = r2;
        if (r6.A07() == 07U.A02) {
            r7.AG7((CancellationException) null);
            A00();
            return;
        }
        r6.A09(r2);
    }

    public final void A00() {
        this.A02.A0A(this.A03);
        C346847vr r1 = this.A00;
        r1.A00 = true;
        r1.A00();
    }
}
