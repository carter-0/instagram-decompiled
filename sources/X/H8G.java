package X;

public final class H8G extends 0ng {
    public final /* synthetic */ 1Ln A00;
    public final /* synthetic */ AnonymousClass9IV A01;
    public final /* synthetic */ String A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public H8G(1Ln r4, AnonymousClass9IV r5, String str) {
        super(2015553371, 3, false, false);
        this.A00 = r4;
        this.A01 = r5;
        this.A02 = str;
    }

    public final void run() {
        1Ln r3 = this.A00;
        AnonymousClass9J4 r2 = (AnonymousClass9J4) this.A01.A01;
        r3.A0R("signal_id", r2.A06);
        C51974G9v.A0u(r3, r2, "signal_type", r2.A04.toString());
        r3.A0R("feature_signal_dispatched_to", this.A02);
        C51973G9u.A15(r3);
        r3.Cgf();
    }
}
