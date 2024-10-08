package X;

public final class EIK extends 0ng {
    public final /* synthetic */ AnonymousClass5HJ A00;
    public final /* synthetic */ 0lg A01;
    public final /* synthetic */ C239473Gp A02;
    public final /* synthetic */ 1Xc A03;
    public final /* synthetic */ Runnable A04;
    public final /* synthetic */ String A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EIK(AnonymousClass5HJ r2, 0lg r3, C239473Gp r4, 1Xc r5, Runnable runnable, String str) {
        super(335);
        this.A03 = r5;
        this.A02 = r4;
        this.A01 = r3;
        this.A05 = str;
        this.A00 = r2;
        this.A04 = runnable;
    }

    public final void run() {
        C239473Gp r4 = this.A02;
        r4.ASb();
        r4.EED(this.A00, this.A01, this.A04, this.A05);
    }
}
