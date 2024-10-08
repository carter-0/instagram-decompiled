package X;

/* renamed from: X.FTn  reason: case insensitive filesystem */
public final class C50207FTn implements X3L {
    public final int A00;
    public final Object A01;

    public C50207FTn(C47482E4h e4h, int i) {
        this.A00 = i;
        this.A01 = e4h;
    }

    public final void CtD() {
        int i = this.A00;
        C47482E4h e4h = (C47482E4h) this.A01;
        if (i != 0) {
            C47482E4h.A02(e4h);
            C18654Vw9 vw9 = e4h.A04;
            if (vw9 == null) {
                0qQ.A0F("actionButtonHolder");
                throw AnonymousClass00P.createAndThrow();
            } else {
                vw9.A05(false);
            }
        } else {
            C47482E4h.A03(e4h);
        }
    }
}
