package X;

public final class OLC {
    public OA4 A00;
    public final O9X A01;
    public final 05G A02;
    public final AnonymousClass0Ud A03;

    public final void A00(Boolean bool) {
        boolean z;
        if (bool != null) {
            05G r5 = this.A02;
            N92 n92 = (N92) r5.getValue();
            boolean booleanValue = bool.booleanValue();
            N92 n922 = (N92) r5.getValue();
            if (n922 != null) {
                z = n922.A03;
            } else {
                z = false;
            }
            r5.FIA(new N92(booleanValue, z, n92.A01, n92.A02));
        }
    }

    public OLC(O9X o9x) {
        this.A01 = o9x;
        02z A10 = DbS.A10(new N92(false, false, false, false));
        this.A02 = A10;
        this.A03 = 10b.A03(A10);
    }
}
