package X;

import android.util.Pair;

/* renamed from: X.5eS  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C289915eS implements Runnable {
    public final /* synthetic */ Pair A00;
    public final /* synthetic */ C284595Ne A01;
    public final /* synthetic */ AnonymousClass4Y0 A02;
    public final /* synthetic */ AnonymousClass4Y4 A03;
    public final /* synthetic */ Object A04;
    public final /* synthetic */ Object A05;

    public /* synthetic */ C289915eS(Pair pair, C284595Ne r2, AnonymousClass4Y0 r3, AnonymousClass4Y4 r4, Object obj, Object obj2) {
        this.A01 = r2;
        this.A00 = pair;
        this.A02 = r3;
        this.A03 = r4;
        this.A04 = obj;
        this.A05 = obj2;
    }

    public final void run() {
        C284595Ne r0 = this.A01;
        Pair pair = this.A00;
        AnonymousClass4Y0 r3 = this.A02;
        AnonymousClass4Y4 r4 = this.A03;
        Object obj = this.A04;
        Object obj2 = this.A05;
        r0.A01.A04.DOB(r3, r4, (C264874Rq) pair.second, obj, obj2, ((Number) pair.first).intValue());
    }
}
