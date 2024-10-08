package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.LvN  reason: case insensitive filesystem */
public final class C65548LvN implements AnonymousClass2Zd {
    public final /* synthetic */ AnonymousClass3Q2 A00;
    public final /* synthetic */ 1ua A01;
    public final /* synthetic */ AnonymousClass4D7 A02;

    public final void DFp(AnonymousClass3Q2 r3) {
        0qQ.A0B(r3, 0);
        if (0qQ.A0K(r3.A3t, this.A00.A3t) && r3.A6J == r3.A1f) {
            AnonymousClass4D7 r1 = this.A02;
            r1.resumeWith(r3.A1C);
            this.A01.A0K(this);
            AnonymousClass5H8.A01((CancellationException) null, r1.getContext());
        }
    }

    public final /* synthetic */ void DQx(AnonymousClass3Q2 r1) {
    }

    public C65548LvN(AnonymousClass3Q2 r1, 1ua r2, AnonymousClass4D7 r3) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }
}
