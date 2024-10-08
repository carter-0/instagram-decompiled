package X;

import android.util.Pair;

/* renamed from: X.5eR  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C289905eR implements Runnable {
    public final /* synthetic */ Pair A00;
    public final /* synthetic */ C284595Ne A01;
    public final /* synthetic */ AnonymousClass4Y0 A02;
    public final /* synthetic */ AnonymousClass4Y4 A03;

    public /* synthetic */ C289905eR(Pair pair, C284595Ne r2, AnonymousClass4Y0 r3, AnonymousClass4Y4 r4) {
        this.A01 = r2;
        this.A00 = pair;
        this.A02 = r3;
        this.A03 = r4;
    }

    public final void run() {
        C284595Ne r0 = this.A01;
        Pair pair = this.A00;
        AnonymousClass4Y0 r4 = this.A02;
        AnonymousClass4Y4 r3 = this.A03;
        r0.A01.A04.DOT(r4, r3, (C264874Rq) pair.second, ((Number) pair.first).intValue());
    }
}
