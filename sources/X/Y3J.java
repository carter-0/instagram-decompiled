package X;

import android.util.Pair;

public final /* synthetic */ class Y3J implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Pair A01;
    public final /* synthetic */ C284595Ne A02;

    public /* synthetic */ Y3J(Pair pair, C284595Ne r2, int i) {
        this.A02 = r2;
        this.A01 = pair;
        this.A00 = i;
    }

    public final void run() {
        C284595Ne r0 = this.A02;
        Pair pair = this.A01;
        int i = this.A00;
        r0.A01.A04.DB3((C264874Rq) pair.second, Pxf.A05(pair), i);
    }
}
