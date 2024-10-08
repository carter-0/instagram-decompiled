package X;

import java.util.concurrent.Callable;

/* renamed from: X.9Vx  reason: invalid class name and case insensitive filesystem */
public final class C379939Vx implements Callable {
    public final /* synthetic */ C340597lW A00;
    public final /* synthetic */ boolean A01;

    public C379939Vx(C340597lW r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        C340597lW r3 = this.A00;
        if (!r3.isConnected() || r3.A08 == null) {
            throw new C352928Fp("Camera disconnected, failed to unlock automatics (focus, AE, AWB)");
        }
        C342757p7 r2 = new C342757p7();
        r2.A01(C342717p3.A0P, false);
        r2.A01(C342717p3.A0R, false);
        r3.CoY(new C341957no(), r2.A00());
        if (!this.A01) {
            return null;
        }
        r3.A0P.A0D = true;
        return null;
    }
}
