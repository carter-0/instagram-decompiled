package X;

import android.util.Pair;

public final /* synthetic */ class Y3L implements Runnable {
    public final /* synthetic */ Pair A00;
    public final /* synthetic */ C284595Ne A01;
    public final /* synthetic */ Exception A02;

    public /* synthetic */ Y3L(Pair pair, C284595Ne r2, Exception exc) {
        this.A01 = r2;
        this.A00 = pair;
        this.A02 = exc;
    }

    public final void run() {
        C284595Ne r0 = this.A01;
        Pair pair = this.A00;
        Exception exc = this.A02;
        r0.A01.A04.DB4((C264874Rq) pair.second, exc, Pxf.A05(pair));
    }
}
