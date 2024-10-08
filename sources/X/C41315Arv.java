package X;

import java.util.concurrent.Callable;

/* renamed from: X.Arv  reason: case insensitive filesystem */
public final class C41315Arv implements Callable {
    public final /* synthetic */ C340597lW A00;
    public final /* synthetic */ boolean A01;

    public C41315Arv(C340597lW r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        C340597lW r3 = this.A00;
        if (!r3.isConnected() || r3.A08 == null) {
            throw new C352928Fp("Camera disconnected, failed to lock automatics (focus, AE, AWB)");
        }
        C342757p7 r2 = new C342757p7();
        r2.A01(C342717p3.A0P, true);
        r2.A01(C342717p3.A0R, true);
        r3.CoY(new C341957no(), r2.A00());
        if (!this.A01) {
            return null;
        }
        C340827lt r1 = r3.A0P;
        r1.A0D = false;
        r1.A00();
        return null;
    }
}
