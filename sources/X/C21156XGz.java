package X;

/* renamed from: X.XGz  reason: case insensitive filesystem */
public final class C21156XGz extends C232322tW {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C22558YAp A02;
    public final /* synthetic */ C22558YAp A03;
    public final /* synthetic */ C252303ot A04;

    public C21156XGz(C22558YAp yAp, C22558YAp yAp2, C252303ot r3, int i, int i2) {
        this.A03 = yAp;
        this.A02 = yAp2;
        this.A04 = r3;
        this.A01 = i;
        this.A00 = i2;
    }

    public final Object A01(int i, int i2) {
        if (this.A03.B8H(i) == this.A02.B8H(i2)) {
            return AnonymousClass7TE.A0v();
        }
        return null;
    }

    public final boolean A04(int i, int i2) {
        Object B8H = this.A03.B8H(i);
        Object B8H2 = this.A02.B8H(i2);
        if (B8H == B8H2) {
            return true;
        }
        return this.A04.areContentsTheSame(B8H, B8H2);
    }

    public final boolean A05(int i, int i2) {
        Object B8H = this.A03.B8H(i);
        Object B8H2 = this.A02.B8H(i2);
        if (B8H == B8H2) {
            return true;
        }
        return this.A04.areItemsTheSame(B8H, B8H2);
    }

    public final int A02() {
        return this.A00;
    }

    public final int A03() {
        return this.A01;
    }
}
