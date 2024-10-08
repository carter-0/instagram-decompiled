package X;

/* renamed from: X.9qO  reason: invalid class name and case insensitive filesystem */
public final class C389889qO extends C262934Go {
    public final /* synthetic */ C52971GgO A00;
    public final /* synthetic */ 0lr A01;
    public final /* synthetic */ C337217fu A02;
    public final /* synthetic */ C357158Wt A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public C389889qO(C52971GgO ggO, 0lr r2, C337217fu r3, C357158Wt r4, String str, String str2) {
        this.A00 = ggO;
        this.A05 = str;
        this.A04 = str2;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
    }

    public final void D9d() {
        C52971GgO ggO = this.A00;
        String str = this.A05;
        String str2 = this.A04;
        if (str2 == null) {
            str2 = "";
        }
        0lr r0 = this.A01;
        long A002 = r0.A00();
        int i = r0.A00;
        r0.A00 = 0;
        C53285GlX glX = new C53285GlX((AnonymousClass7a4) null, str, str2, i, A002, false);
        C337217fu r4 = this.A02;
        C337217fu.A00(r4);
        ggO.A0J(glX, (long) Math.max(r4.A02 - r4.A00, 0), true);
        C357158Wt r1 = this.A03;
        if (r1.A00 == null) {
            C357158Wt.A01(r4, r1);
            return;
        }
        throw AnonymousClass7TE.A0z("Check failed.");
    }
}
