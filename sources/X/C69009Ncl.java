package X;

/* renamed from: X.Ncl  reason: case insensitive filesystem */
public final class C69009Ncl extends C296935qt {
    public final C298795u2 A00;
    public final boolean A01;
    public final boolean A02;

    public final boolean A03(C296935qt r4) {
        0qQ.A0B(r4, 0);
        if (r4 instanceof C69009Ncl) {
            C69009Ncl ncl = (C69009Ncl) r4;
            if (ncl.A02 == this.A02 && ncl.A01 == this.A01) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C69009Ncl(C296905qq r2, C298795u2 r3, boolean z, boolean z2) {
        super(r2, r3.A03);
        this.A00 = r3;
        this.A02 = z;
        this.A01 = z2;
    }

    public final long A00() {
        return 29;
    }
}
