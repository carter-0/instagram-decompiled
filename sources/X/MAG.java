package X;

public final class MAG implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C53401GnY A01;
    public final /* synthetic */ AnonymousClass7IG A02;
    public final /* synthetic */ C381779cJ A03;
    public final /* synthetic */ AnonymousClass3Q2 A04;
    public final /* synthetic */ C352218Cl A05;
    public final /* synthetic */ Long A06;
    public final /* synthetic */ boolean A07;

    public MAG(C53401GnY gnY, AnonymousClass7IG r2, C381779cJ r3, AnonymousClass3Q2 r4, C352218Cl r5, Long l, int i, boolean z) {
        this.A02 = r2;
        this.A05 = r5;
        this.A00 = i;
        this.A07 = z;
        this.A04 = r4;
        this.A03 = r3;
        this.A01 = gnY;
        this.A06 = l;
    }

    public final void run() {
        AnonymousClass7IA r0 = this.A02.A03;
        C352218Cl r4 = this.A05;
        int i = this.A00;
        boolean z = this.A07;
        AnonymousClass3Q2 r3 = this.A04;
        r0.DX3(this.A01, this.A03, r3, r4, this.A06, i, z);
    }
}
