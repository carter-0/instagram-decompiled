package X;

public final class FTN implements 2IR {
    public final /* synthetic */ 1P0 A00;
    public final /* synthetic */ AnonymousClass92f A01;

    public final void onFailure(Throwable th) {
    }

    public FTN(1P0 r1, AnonymousClass92f r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        AnonymousClass3JC r4 = (AnonymousClass3JC) obj;
        if (r4 != null) {
            11Z.A02(new C51390FtM(this.A00, B6X.A00(r4, this.A01.A01)));
        }
    }
}
