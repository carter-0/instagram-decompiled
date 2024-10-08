package X;

public final class AhP implements C51890G6f {
    public final /* synthetic */ C52971GgO A00;
    public final /* synthetic */ 0lr A01;
    public final /* synthetic */ C337207ft A02;
    public final /* synthetic */ C337217fu A03;
    public final /* synthetic */ C357158Wt A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    public AhP(C52971GgO ggO, 0lr r2, C337207ft r3, C337217fu r4, C357158Wt r5, String str, String str2) {
        this.A00 = ggO;
        this.A06 = str;
        this.A05 = str2;
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = r4;
        this.A04 = r5;
    }

    public final void D9K() {
        C52971GgO ggO = this.A00;
        String str = this.A06;
        String str2 = this.A05;
        if (str2 == null) {
            str2 = "";
        }
        0lr r0 = this.A01;
        long A002 = r0.A00();
        int i = r0.A00;
        r0.A00 = 0;
        C53285GlX glX = new C53285GlX((AnonymousClass7a4) null, str, str2, i, A002, false);
        C337217fu r4 = this.A03;
        C337217fu.A00(r4);
        ggO.A0J(glX, (long) Math.max(r4.A02 - r4.A00, 0), true);
        C357158Wt r1 = this.A04;
        if (r1.A00 == null) {
            C357158Wt.A01(r4, r1);
            return;
        }
        throw AnonymousClass7TE.A0z("Check failed.");
    }
}
