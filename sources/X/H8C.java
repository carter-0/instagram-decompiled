package X;

public final class H8C extends 0ng {
    public final /* synthetic */ 1Ln A00;
    public final /* synthetic */ AnonymousClass9IV A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public H8C(1Ln r4, AnonymousClass9IV r5) {
        super(2015553371, 3, false, false);
        this.A00 = r4;
        this.A01 = r5;
    }

    public final void run() {
        long j;
        1Ln r3 = this.A00;
        AnonymousClass9IV r2 = this.A01;
        AnonymousClass9J4 r4 = (AnonymousClass9J4) r2.A01;
        r3.A0R("signal_id", r4.A06);
        r3.A0R("signal_type", r4.A04.toString());
        C253513qu r22 = (C253513qu) r2.A00;
        C51974G9v.A0u(r3, r4, "item_id", r22.A04());
        r3.A0R("container_module", r22.A02());
        C51973G9u.A15(r3);
        if (r22 instanceof C253533qw) {
            j = ((C253533qw) r22).A0A;
        } else {
            j = -1;
        }
        r3.A0Q("media_time_spent_in_ms", Long.valueOf(j));
        r3.A0R("not_sent_reason", AnonymousClass000.A00(249));
        r3.Cgf();
    }
}
