package X;

public final class AV2 implements C364018kj {
    public C363858kS A00;
    public C363858kS A01;
    public C363858kS A02;
    public C363858kS A03;
    public boolean A04;
    public final /* synthetic */ C364018kj A05;
    public final /* synthetic */ C340957m6 A06;

    public final /* synthetic */ void DaE(float f) {
    }

    public AV2(C364018kj r1, C340957m6 r2) {
        this.A06 = r2;
        this.A05 = r1;
    }

    public final void D16() {
        if (!this.A04) {
            this.A04 = true;
            this.A05.D16();
        }
    }

    public final void DCn(Exception exc) {
        this.A05.DCn(exc);
    }

    public final void DX5(C363858kS r5) {
        C363858kS r3;
        if (AnonymousClass7TE.A0M(r5.A03(C363858kS.A0K)) == this.A06.A00) {
            this.A02 = r5;
        } else {
            this.A00 = r5;
        }
        C363858kS r0 = this.A02;
        if (r0 != null && (r3 = this.A00) != null) {
            C364018kj r2 = this.A05;
            C364158kx r1 = new C364158kx(r0);
            r1.A01(C363858kS.A0Q, r3);
            r2.DX5(new C363858kS(r1));
        }
    }

    public final void DsK(C363858kS r5) {
        C363858kS r3;
        if (AnonymousClass7TE.A0M(r5.A03(C363858kS.A0K)) == this.A06.A00) {
            this.A03 = r5;
        } else {
            this.A01 = r5;
        }
        C363858kS r0 = this.A03;
        if (r0 != null && (r3 = this.A01) != null) {
            C364018kj r2 = this.A05;
            C364158kx r1 = new C364158kx(r0);
            r1.A01(C363858kS.A0Q, r3);
            r2.DsK(new C363858kS(r1));
        }
    }
}
