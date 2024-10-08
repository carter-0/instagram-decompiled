package X;

/* renamed from: X.Pc1  reason: case insensitive filesystem */
public final class C73404Pc1 implements Runnable {
    public final /* synthetic */ C2607246u A00;
    public final /* synthetic */ AnonymousClass79H A01;
    public final /* synthetic */ AnonymousClass7EB A02;
    public final /* synthetic */ AnonymousClass4kA A03;
    public final /* synthetic */ Long A04;
    public final /* synthetic */ String A05;

    public C73404Pc1(C2607246u r1, AnonymousClass79H r2, AnonymousClass7EB r3, AnonymousClass4kA r4, Long l, String str) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
        this.A04 = l;
        this.A05 = str;
        this.A03 = r4;
    }

    public final void run() {
        AnonymousClass4kA r0;
        AnonymousClass7EB r1 = this.A02;
        AnonymousClass79H r02 = this.A01;
        C2607246u r2 = this.A00;
        r1.A04(r2, r02);
        Long l = this.A04;
        if (l == null) {
            r2.A05 = true;
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
