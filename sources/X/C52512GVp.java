package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.GVp  reason: case insensitive filesystem */
public final class C52512GVp implements 2IR {
    public final /* synthetic */ C379629Uq A00;
    public final /* synthetic */ JPC A01;

    public final void onFailure(Throwable th) {
        0qQ.A0B(th, 0);
        boolean z = th instanceof CancellationException;
        C379629Uq r0 = this.A00;
        if (z) {
            r0.DeE();
        } else {
            r0.DeO(th);
        }
        this.A01.DYj(th);
    }

    public C52512GVp(C379629Uq r1, JPC jpc) {
        this.A00 = r1;
        this.A01 = jpc;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        this.A00.A02.A03();
        this.A01.DYk();
    }
}
