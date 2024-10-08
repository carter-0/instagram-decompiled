package X;

/* renamed from: X.FRh  reason: case insensitive filesystem */
public final class C50149FRh implements 2Kw {
    public final int A00;
    public final Object A01;
    public final boolean A02;

    public C50149FRh(int i, Object obj, boolean z) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = z;
    }

    public final void invoke(Throwable th) {
        switch (this.A00) {
            case 0:
                ((C50331FYl) this.A01).A02 = DbT.A0l(this.A02);
                return;
            case 1:
                PR9 pr9 = ((ESI) this.A01).A07;
                if (pr9 != null) {
                    pr9.A0D = !this.A02;
                    return;
                }
                return;
            default:
                ESG esg = (ESG) this.A01;
                PR9 pr92 = esg.A03;
                if (pr92 != null) {
                    pr92.A0D = !this.A02;
                }
                ESG.A07(esg);
                return;
        }
    }
}
