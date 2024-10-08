package X;

/* renamed from: X.WXv  reason: case insensitive filesystem */
public final class C19402WXv implements X4E {
    public final int A00;
    public final int A01;
    public final Object A02;

    public C19402WXv(Object obj, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
    }

    public final C17355VSi getState(C17355VSi vSi, CharSequence charSequence, boolean z) {
        C61072JwA jwA;
        C61072JwA jwA2;
        int i = this.A00;
        0qQ.A0B(vSi, 0);
        Object obj = this.A02;
        if (i != 0) {
            C15312UaJ uaJ = (C15312UaJ) obj;
            2Fk r0 = (2Fk) 00k.A0O(uaJ.A01().A09, this.A01);
            if (!(r0 == null || (jwA2 = (C61072JwA) r0.A02()) == null)) {
                C15312UaJ.A00(jwA2, vSi, uaJ);
            }
        } else {
            C15308UaF uaF = (C15308UaF) obj;
            2Fk r02 = (2Fk) 00k.A0O(uaF.A01().A05, this.A01);
            if (!(r02 == null || (jwA = (C61072JwA) r02.A02()) == null)) {
                C15308UaF.A00(jwA, vSi, uaF);
                return vSi;
            }
        }
        return vSi;
    }
}
