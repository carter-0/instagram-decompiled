package X;

/* renamed from: X.8tM  reason: invalid class name and case insensitive filesystem */
public final class C368808tM {
    public int A00;
    public boolean A01;
    public final C368638t3 A02;

    public final void A00(ASJ asj) {
        int i;
        if (asj != null) {
            C368638t3 r3 = this.A02;
            if (r3.BOt().frameDataNeeded) {
                ADH adh = (ADH) asj.get();
                int i2 = this.A00;
                if (!(adh == null || (i = adh.A01) == -1)) {
                    i2 = i;
                }
                r3.FKR(asj, i2, this.A01);
            }
        }
    }

    public C368808tM(C368638t3 r1) {
        this.A02 = r1;
    }
}
