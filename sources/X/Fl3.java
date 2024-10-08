package X;

public final class Fl3 implements B2F {
    public final /* synthetic */ C307896Rx A00;
    public final /* synthetic */ C277014uI A01;
    public final /* synthetic */ C277014uI A02;
    public final /* synthetic */ Object A03;

    public Fl3(C307896Rx r1, C277014uI r2, C277014uI r3, Object obj) {
        this.A03 = obj;
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public final void DEE(RHJ rhj) {
        DbS.A1Q(this.A00, this.A01);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        JV7 jv7 = (JV7) obj;
        Object obj2 = this.A03;
        if (obj2 != null) {
            C307896Rx r3 = this.A00;
            C308276Tl A0P = DbS.A0P();
            String str2 = null;
            if (jv7 != null) {
                str = jv7.A01;
            } else {
                str = null;
            }
            A0P.A01(str);
            if (jv7 != null) {
                str2 = jv7.A02;
            }
            C299275ur.A00(r3, DbT.A0V(A0P, str2), ((C280064zw) obj2).A00);
        }
    }
}
