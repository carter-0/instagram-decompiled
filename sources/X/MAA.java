package X;

public final class MAA implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C53401GnY A01;
    public final /* synthetic */ AnonymousClass7IG A02;
    public final /* synthetic */ AnonymousClass3Q2 A03;
    public final /* synthetic */ C352218Cl A04;
    public final /* synthetic */ Long A05;
    public final /* synthetic */ boolean A06;

    public MAA(C53401GnY gnY, AnonymousClass7IG r2, AnonymousClass3Q2 r3, C352218Cl r4, Long l, int i, boolean z) {
        this.A02 = r2;
        this.A04 = r4;
        this.A00 = i;
        this.A06 = z;
        this.A03 = r3;
        this.A01 = gnY;
        this.A05 = l;
    }

    public final void run() {
        AnonymousClass7IA r0 = this.A02.A03;
        C352218Cl r4 = this.A04;
        int i = this.A00;
        boolean z = this.A06;
        r0.DX3(this.A01, (C381779cJ) null, this.A03, r4, this.A05, i, z);
    }
}
