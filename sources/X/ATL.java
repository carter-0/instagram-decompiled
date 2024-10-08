package X;

public final class ATL implements C341687nM {
    public final /* synthetic */ B16 A00;
    public final /* synthetic */ C341627nG A01;

    public ATL(B16 b16, C341627nG r2) {
        this.A01 = r2;
        this.A00 = b16;
    }

    public final void DCg(C391719tX r3) {
        C341627nG r1 = this.A01;
        r1.A04(r3);
        r1.A06(this.A00);
    }

    public final void onSuccess() {
        C341627nG r3 = this.A01;
        r3.A00 = 2;
        r3.A03.A04(new ATM(this.A00, r3));
    }
}
