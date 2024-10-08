package X;

/* renamed from: X.4dc  reason: invalid class name and case insensitive filesystem */
public final class C268564dc extends 0ng {
    public final /* synthetic */ 1Ln A00;
    public final /* synthetic */ AnonymousClass9IV A01;
    public final /* synthetic */ 1L3 A02;
    public final /* synthetic */ String A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C268564dc(1Ln r4, AnonymousClass9IV r5, 1L3 r6, String str) {
        super(2015553371, 3, false, false);
        this.A00 = r4;
        this.A01 = r5;
        this.A02 = r6;
        this.A03 = str;
    }

    public final void run() {
        long j;
        long currentTimeMillis = System.currentTimeMillis();
        1Ln r3 = this.A00;
        AnonymousClass9IV r2 = this.A01;
        AnonymousClass9J4 r6 = (AnonymousClass9J4) r2.A01;
        r3.A0R("signal_id", r6.A06);
        r3.A0R("signal_type", r6.A04.toString());
        C253513qu r22 = (C253513qu) r2.A00;
        r3.A0R("item_id", r22.A04());
        r3.A0R("item_type", r6.A01.toString());
        r3.A0R("signal_surface", r6.A05.toString());
        r3.A0R("container_module", r22.A02());
        r3.A0P("timestamp_in_ms", Double.valueOf((double) currentTimeMillis));
        r3.A0Q("latency_between_collection_and_send_in_ms", Long.valueOf(currentTimeMillis - r22.A00()));
        if (r22 instanceof C253533qw) {
            j = ((C253533qw) r22).A0A;
        } else {
            j = -1;
        }
        r3.A0Q("media_time_spent_in_ms", Long.valueOf(j));
        1L3 r23 = this.A02;
        r3.A0R("pigeon_session_id", ((C60640iu) r23.A02.getValue()).BcO());
        r3.A0R("payload_api", this.A03);
        r3.A0v(r23.A01.getSessionId());
        r3.Cgf();
    }
}
