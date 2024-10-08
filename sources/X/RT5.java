package X;

public abstract class RT5 {
    public static final Object A00() {
        RR5 rr5 = C10071Rm8.A00;
        if (rr5 == null) {
            return null;
        }
        QQ0 qq0 = (QQ0) rr5;
        SUF suf = qq0.A01;
        if (suf != null) {
            String str = qq0.A0B;
            if (str == null) {
                str = "";
            }
            String str2 = qq0.A0A;
            String str3 = qq0.A03;
            String str4 = qq0.A09;
            AnonymousClass7TG.A1U(str2, str3, str4);
            0Aj A0e = AnonymousClass7TE.A0e(suf.A0C(), "client_redirect_optout_success");
            if (A0e.isSampled()) {
                A0e.AAJ(Q2M.A00(), str2);
                Pxh.A18(2M7.A0G, A0e);
                0bb r2 = new 0bb();
                SUF.A09(r2, suf, SUF.A04(suf));
                Pxi.A1B(A0e, r2, DbY.A0p("checkout_url", str3, AnonymousClass7TE.A1L("csp_version", "2024-10")));
                0bb r22 = new 0bb();
                r22.A06("commerce_checkout_session_id", str2);
                QKY qky = (QKY) suf;
                QKY.A01(r22, qky);
                SUF.A0A(r22, suf, qky.A01, str);
                r22.A06("iaw_session_id", str);
                r22.A05("ad_id", DbV.A0q(str4));
                A0e.AAK(r22, "custom_fields");
                A0e.Cgf();
            }
        }
        qq0.A05 = true;
        return null;
    }
}
