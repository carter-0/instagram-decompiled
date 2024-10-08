package X;

public final class KV6 extends JZJ {
    public final /* synthetic */ JZH A00;
    public final /* synthetic */ Object A01;
    public final /* synthetic */ boolean A02;

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(-1501588058);
        CTD ctd = (CTD) obj;
        int A0D = AnonymousClass7TG.A0D(ctd, 1631363951);
        this.A00.A03.Dew(ctd, this.A01, this.A00, this.A02, ctd.CPt());
        AnonymousClass0fD.A0A(-1324184006, A0D);
        AnonymousClass0fD.A0A(-261248581, A03);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KV6(JZH jzh, Object obj, boolean z) {
        super(jzh, obj);
        this.A00 = jzh;
        this.A02 = z;
        this.A01 = obj;
    }

    public final void onFail(C268654dm r4) {
        int A0D = AnonymousClass7TG.A0D(r4, 1330587410);
        this.A00.A03.DeK(r4, this.A00);
        AnonymousClass0fD.A0A(-28943565, A0D);
    }
}
