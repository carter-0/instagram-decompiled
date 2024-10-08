package X;

/* renamed from: X.3r2  reason: invalid class name and case insensitive filesystem */
public final class C253583r2 extends 0ng {
    public final /* synthetic */ 1Ln A00;
    public final /* synthetic */ AnonymousClass9IV A01;
    public final /* synthetic */ 1L3 A02;
    public final /* synthetic */ boolean A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C253583r2(1Ln r4, AnonymousClass9IV r5, 1L3 r6, boolean z) {
        super(2015553371, 3, false, false);
        this.A00 = r4;
        this.A01 = r5;
        this.A03 = z;
        this.A02 = r6;
    }

    public final void run() {
        long j;
        1Ln r2 = this.A00;
        AnonymousClass9IV r4 = this.A01;
        AnonymousClass9J4 r3 = (AnonymousClass9J4) r4.A01;
        r2.A0R("signal_id", r3.A06);
        r2.A0R("signal_type", r3.A04.toString());
        C253513qu r5 = (C253513qu) r4.A00;
        r2.A0R("item_id", r5.A04());
        r2.A0R("item_type", r3.A01.toString());
        r2.A0R("signal_surface", r3.A05.toString());
        r2.A0R("container_module", r5.A02());
        r2.A0P("timestamp_in_ms", Double.valueOf((double) System.currentTimeMillis()));
        if (r5 instanceof C253533qw) {
            j = ((C253533qw) r5).A0A;
        } else {
            j = -1;
        }
        r2.A0Q("media_time_spent_in_ms", Long.valueOf(j));
        r2.A0O("seen_state_exists", Boolean.valueOf(this.A03));
        r2.A0R("pigeon_session_id", ((C60640iu) this.A02.A02.getValue()).BcO());
        r2.Cgf();
    }
}
