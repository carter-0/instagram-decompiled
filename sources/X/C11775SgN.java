package X;

/* renamed from: X.SgN  reason: case insensitive filesystem */
public final class C11775SgN implements C13515Tbk {
    public final int A00;
    public final Object A01;
    public final String A02;

    public C11775SgN(Q6Y q6y, String str, int i) {
        this.A00 = i;
        this.A01 = q6y;
        this.A02 = str;
    }

    public final void EJU(S7N s7n) {
        int i = this.A00;
        Object obj = this.A01;
        switch (i) {
            case 0:
                ((Q6Y) obj).A0J(this.A02);
                return;
            case 1:
                ((Q6Y) obj).A0I(this.A02);
                return;
            default:
                ((Q6Y) obj).A0H(this.A02);
                return;
        }
    }
}
