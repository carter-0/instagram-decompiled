package X;

/* renamed from: X.OvA  reason: case insensitive filesystem */
public final /* synthetic */ class C72035OvA implements AnonymousClass68Z {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C304566Ea A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public /* synthetic */ C72035OvA(C304566Ea r1, String str, String str2, long j) {
        this.A01 = r1;
        this.A00 = j;
        this.A02 = str;
        this.A03 = str2;
    }

    public final Object apply(Object obj) {
        C304566Ea r1 = this.A01;
        long j = this.A00;
        String str = this.A02;
        String str2 = this.A03;
        C74233PrM prM = (C74233PrM) obj;
        if (prM instanceof C72176Oxl) {
            return C72176Oxl.A00(prM);
        }
        return r1.A00.A0M(new C72040OvF(prM, str, str2, DbS.A0k(), j));
    }
}
