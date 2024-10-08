package X;

/* renamed from: X.Fol  reason: case insensitive filesystem */
public final class C51113Fol implements X5O {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C51113Fol(C307896Rx r1, C277014uI r2, int i) {
        this.A00 = i;
        switch (i) {
            case 0:
            case 1:
            case 2:
                this.A01 = r2;
                this.A02 = r1;
                break;
            default:
                this.A02 = r2;
                this.A01 = r1;
                break;
        }
    }

    public final boolean CxY() {
        if (3 - this.A00 != 0) {
            C308276Tl A0P = DbS.A0P();
            C307896Rx r1 = (C307896Rx) this.A02;
            DbX.A1O(r1, A0P, (C277014uI) this.A01, r1.A03);
            return true;
        }
        DbS.A1R(AnonymousClass6Tm.A01, (C277014uI) this.A02, this.A01);
        return true;
    }
}
