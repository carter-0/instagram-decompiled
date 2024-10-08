package X;

public final class HAU extends C296935qt implements C296975qx {
    public long A00 = -1;
    public boolean A01 = true;
    public final C298795u2 A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HAU(C296905qq r3, C298795u2 r4) {
        super(r3, r4.A03);
        0qQ.A0B(r4, 1);
        this.A02 = r4;
    }

    public final boolean A03(C296935qt r4) {
        0qQ.A0B(r4, 0);
        if (!(r4 instanceof HAU) || ((HAU) r4).A01 != this.A01) {
            return false;
        }
        return true;
    }

    public final long A00() {
        return 28;
    }

    public final long BaJ() {
        return this.A00;
    }

    public final void EfJ(long j) {
        this.A00 = j;
    }
}
