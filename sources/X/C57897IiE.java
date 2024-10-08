package X;

/* renamed from: X.IiE  reason: case insensitive filesystem */
public final class C57897IiE implements Runnable {
    public final /* synthetic */ C15324UaW A00;
    public final /* synthetic */ AnonymousClass5Gv A01;
    public final /* synthetic */ 1Av A02;

    public C57897IiE(C15324UaW uaW, AnonymousClass5Gv r2, 1Av r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = uaW;
    }

    public final void run() {
        0xY A0p = AnonymousClass7TE.A0p(this.A02);
        A0p.E5T("has_seen_promote_lead_gen_add_new_form_tooltip", true);
        A0p.apply();
        this.A01.A07(this.A00.getSession());
    }
}
