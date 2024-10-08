package X;

public final class KV5 extends JZJ {
    public final /* synthetic */ JZH A00;
    public final /* synthetic */ Object A01;
    public final /* synthetic */ boolean A02;

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(-1292452917);
        C22326Xzb xzb = (C22326Xzb) obj;
        int A0D = AnonymousClass7TG.A0D(xzb, -264948103);
        this.A00.A03.Dew(xzb, this.A01, this.A00, this.A02, xzb.CPt());
        AnonymousClass0fD.A0A(-330687658, A0D);
        AnonymousClass0fD.A0A(196216436, A03);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KV5(JZH jzh, Object obj, boolean z) {
        super(jzh, obj);
        this.A00 = jzh;
        this.A02 = z;
        this.A01 = obj;
    }

    public final void onFail(C268654dm r4) {
        int A0D = AnonymousClass7TG.A0D(r4, -731839132);
        this.A00.A03.DeK(r4, this.A00);
        AnonymousClass0fD.A0A(-19750948, A0D);
    }
}
