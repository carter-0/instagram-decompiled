package X;

public final class JZI extends JZJ {
    public final /* synthetic */ JZH A00;
    public final /* synthetic */ Object A01;
    public final /* synthetic */ boolean A02;

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(-1248128195);
        CGO cgo = (CGO) obj;
        int A0D = AnonymousClass7TG.A0D(cgo, -1000780247);
        this.A00.A03.Dew(cgo, this.A01, this.A00, this.A02, cgo.CPt());
        AnonymousClass0fD.A0A(594594275, A0D);
        AnonymousClass0fD.A0A(-1628337119, A03);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JZI(JZH jzh, Object obj, boolean z) {
        super(jzh, obj);
        this.A00 = jzh;
        this.A02 = z;
        this.A01 = obj;
    }

    public final void onFail(C268654dm r4) {
        int A0D = AnonymousClass7TG.A0D(r4, 1636250784);
        this.A00.A03.DeK(r4, this.A00);
        AnonymousClass0fD.A0A(542583452, A0D);
    }
}
