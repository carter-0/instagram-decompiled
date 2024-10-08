package X;

/* renamed from: X.IXc  reason: case insensitive filesystem */
public final class C57319IXc implements B2F {
    public final /* synthetic */ C307896Rx A00;
    public final /* synthetic */ C277014uI A01;
    public final /* synthetic */ C277014uI A02;
    public final /* synthetic */ Object A03;

    public C57319IXc(C307896Rx r1, C277014uI r2, C277014uI r3, Object obj) {
        this.A03 = obj;
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public final void DEE(RHJ rhj) {
        C299275ur.A00(this.A00, AnonymousClass6Tm.A01, this.A01);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        C53375Gn5 gn5 = (C53375Gn5) obj;
        Object obj2 = this.A03;
        if (obj2 != null) {
            C307896Rx r4 = this.A00;
            C308276Tl r3 = new C308276Tl();
            String str5 = null;
            if (gn5 != null) {
                str = gn5.A03;
            } else {
                str = null;
            }
            r3.A01(str);
            if (gn5 != null) {
                str2 = gn5.A06;
            } else {
                str2 = null;
            }
            r3.A02(str2);
            if (gn5 != null) {
                str3 = gn5.A05;
            } else {
                str3 = null;
            }
            r3.A03(str3, 2);
            if (gn5 != null) {
                str4 = gn5.A04;
            } else {
                str4 = null;
            }
            r3.A03(str4, 3);
            if (gn5 != null) {
                str5 = gn5.A02;
            }
            r3.A03(str5, 4);
            C299275ur.A00(r4, r3.A00(), ((C280064zw) obj2).A00);
        }
    }
}
