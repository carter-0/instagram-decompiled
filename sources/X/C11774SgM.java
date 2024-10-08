package X;

/* renamed from: X.SgM  reason: case insensitive filesystem */
public final class C11774SgM implements C13515Tbk {
    public final int A00;
    public final int A01;
    public final Object A02;

    public C11774SgM(Q6Y q6y, int i, int i2) {
        this.A00 = i2;
        this.A02 = q6y;
        this.A01 = i;
    }

    public final void EJU(S7N s7n) {
        int i = this.A00;
        Object obj = this.A02;
        switch (i) {
            case 0:
                ((Q6Y) obj).A0C(this.A01);
                return;
            case 1:
                ((Q6Y) obj).A0E(this.A01);
                return;
            default:
                ((Q6Y) obj).A0D(this.A01);
                return;
        }
    }
}
