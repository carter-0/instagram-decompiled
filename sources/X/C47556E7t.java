package X;

/* renamed from: X.E7t  reason: case insensitive filesystem */
public final class C47556E7t extends C361158fl {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C229382nI A01;
    public final /* synthetic */ AnonymousClass35E A02;

    public final void A04(C268654dm r7) {
        0qQ.A0B(r7, 0);
        AnonymousClass7TG.A1I(0wj.A01, "ig_ndx_show_flows_error", r7.A01(), 817895070);
        this.A02.A02.A00(AnonymousClass05K.A05, Long.valueOf(System.currentTimeMillis() - this.A00));
    }

    public C47556E7t(C229382nI r1, AnonymousClass35E r2, long j) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = j;
    }

    public final /* bridge */ /* synthetic */ void A05(Object obj) {
        C48382Edd.A00(this.A01, DbV.A0Q(obj));
        AnonymousClass35E r4 = this.A02;
        0xY AR4 = 1Al.A01(r4.A01).A03(1An.A2I).AR4();
        AR4.E5c("ndx_impression_timestamp", System.currentTimeMillis());
        AR4.apply();
        r4.A02.A00(AnonymousClass05K.A03, Long.valueOf(System.currentTimeMillis() - this.A00));
    }
}
