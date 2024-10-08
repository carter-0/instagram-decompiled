package X;

public final class WWV implements C270594gz {
    public final int A00;
    public final Object A01;
    public final String A02;

    public WWV(String str, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    public final void A8S(C254523sc r4, AnonymousClass4DU r5, String str) {
        int i = this.A00;
        0qQ.A0B(r4, 2);
        if (i != 0) {
            r4.A6x = ((AnonymousClass0iw) this.A01).getModuleName();
            r4.A6S = this.A02;
            return;
        }
        C18782W1i w1i = (C18782W1i) this.A01;
        1Xj r1 = w1i.A01;
        if (r1 != null) {
            r4.A0G(w1i.A08, r1);
        }
        r4.A6x = w1i.A09.getModuleName();
        r4.A5C = this.A02;
    }
}
