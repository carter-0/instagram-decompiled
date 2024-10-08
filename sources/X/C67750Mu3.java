package X;

/* renamed from: X.Mu3  reason: case insensitive filesystem */
public final class C67750Mu3 extends 2YL {
    public final 05G A00;
    public final AnonymousClass0Ud A01;

    public final void A01(C69373NkD nkD, String str) {
        Object value;
        C69369Nk9 nk9;
        05G r3 = this.A00;
        do {
            value = r3.getValue();
            nk9 = (C69369Nk9) ((C61079JwH) value).A00;
            0qQ.A0B(nk9, 0);
        } while (!r3.AIY(value, new C61079JwH(nk9, nkD, str)));
    }

    public C67750Mu3() {
        02z A10 = DbS.A10(new C61079JwH(C69369Nk9.ONE_DAY, C69373NkD.SHOUTOUT, ""));
        this.A00 = A10;
        this.A01 = A10;
    }

    public static C61079JwH A00(NKF nkf) {
        return (C61079JwH) nkf.A04().A01.getValue();
    }
}
