package X;

/* renamed from: X.Pc0  reason: case insensitive filesystem */
public final class C73403Pc0 implements Runnable {
    public final /* synthetic */ C2607246u A00;
    public final /* synthetic */ AnonymousClass7E5 A01;
    public final /* synthetic */ C66869Me5 A02;
    public final /* synthetic */ AnonymousClass4kA A03;
    public final /* synthetic */ Long A04;
    public final /* synthetic */ String A05;

    public C73403Pc0(C2607246u r1, AnonymousClass7E5 r2, C66869Me5 me5, AnonymousClass4kA r4, Long l, String str) {
        this.A02 = me5;
        this.A01 = r2;
        this.A00 = r1;
        this.A04 = l;
        this.A05 = str;
        this.A03 = r4;
    }

    public final void run() {
        AnonymousClass4kA r0;
        C66869Me5 me5 = this.A02;
        AnonymousClass7E5 r1 = this.A01;
        C2607246u r4 = this.A00;
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        C332807Wl r3 = me5.A0B;
        if (r3 != null) {
            r3.Ewv(me5.A0A, r1.A09, r4.A02);
        }
        Long l = this.A04;
        if (l == null) {
            r4.A05 = true;
            return;
        }
        String str = this.A05;
        if (str != null && (r0 = this.A03) != null) {
            long longValue = l.longValue();
            0xY AR4 = r0.A00.AR4();
            AR4.E5c(002.A0R(C273654mx.A00(668), str), longValue);
            AR4.apply();
        }
    }
}
