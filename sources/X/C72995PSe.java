package X;

/* renamed from: X.PSe  reason: case insensitive filesystem */
public final class C72995PSe implements 1aV {
    public final /* synthetic */ 1a8 A00;
    public final /* synthetic */ AnonymousClass7L9 A01;
    public final /* synthetic */ C254743sy A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public C72995PSe(1a8 r1, AnonymousClass7L9 r2, C254743sy r3, String str, String str2, String str3) {
        this.A03 = str;
        this.A01 = r2;
        this.A02 = r3;
        this.A05 = str2;
        this.A04 = str3;
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        C74233PrM prM = (C74233PrM) obj;
        if (this.A03 == null && !(prM instanceof C72176Oxl)) {
            Object A022 = C66996MgU.A02(prM);
            0qQ.A07(A022);
            String str = (String) A022;
            AnonymousClass7L9 r5 = this.A01;
            C254743sy r4 = this.A02;
            String str2 = this.A05;
            String str3 = this.A04;
            if (AnonymousClass7L9.A01(r5, r4)) {
                C70171NyP.A00(r5.A00).A00(C66647MaG.A06(r4), str, str2, str3);
                r5.A02.AvL().E2N();
            }
        } else if (prM instanceof C72176Oxl) {
            0wb.A08("Failed to send Armadillo Text message", (Throwable) C66996MgU.A01(prM));
        }
        this.A00.A01();
    }
}
