package X;

public final class P92 implements C74403PuJ {
    public final /* synthetic */ AnonymousClass7NT A00;
    public final /* synthetic */ AnonymousClass5FV A01;
    public final /* synthetic */ PB1 A02;
    public final /* synthetic */ C68076Mzh A03;
    public final /* synthetic */ NYH A04;

    public final void D55(String str, boolean z) {
        0qQ.A0B(str, 0);
        C68076Mzh mzh = this.A03;
        mzh.A00 = null;
        PB1 pb1 = this.A02;
        NYH nyh = this.A04;
        PB1.A00(this.A00, this.A01, pb1, mzh, nyh, str);
    }

    public P92(AnonymousClass7NT r1, AnonymousClass5FV r2, PB1 pb1, C68076Mzh mzh, NYH nyh) {
        this.A03 = mzh;
        this.A02 = pb1;
        this.A04 = nyh;
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void onError(String str) {
        C68076Mzh mzh = this.A03;
        mzh.A00 = null;
        AnonymousClass7TF.A0D().post(new C73380Pbd(this.A00, this.A01, this.A02, mzh, this.A04));
    }
}
