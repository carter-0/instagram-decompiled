package X;

/* renamed from: X.SgL  reason: case insensitive filesystem */
public final class C11773SgL implements C13515Tbk {
    public final float A00;
    public final int A01;
    public final Object A02;

    public C11773SgL(Q6Y q6y, float f, int i) {
        this.A01 = i;
        this.A02 = q6y;
        this.A00 = f;
    }

    public final void EJU(S7N s7n) {
        int i = this.A01;
        Object obj = this.A02;
        switch (i) {
            case 0:
                ((Q6Y) obj).A09(this.A00);
                return;
            case 1:
                ((Q6Y) obj).A0B(this.A00);
                return;
            default:
                ((Q6Y) obj).A0A(this.A00);
                return;
        }
    }
}
