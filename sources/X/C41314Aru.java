package X;

import java.util.concurrent.Callable;

/* renamed from: X.Aru  reason: case insensitive filesystem */
public final /* synthetic */ class C41314Aru implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C340597lW A01;

    public /* synthetic */ C41314Aru(C340597lW r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public final Object call() {
        C340597lW r2 = this.A01;
        C340597lW.A03(r2, r2.A0O.A07(this.A00));
        r2.A0n = true;
        r2.A0r = true;
        return new C343367q6(r2.AlD(), (C343367q6) null, r2.Bt2(), r2.A00, false);
    }
}
