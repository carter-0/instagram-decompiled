package X;

public abstract class RT2 {
    public static final Object A00(AnonymousClass6Tm r11) {
        boolean A01 = Q0A.A01(r11.A03(0));
        RR5 rr5 = C10071Rm8.A00;
        if (rr5 == null) {
            return null;
        }
        QQ0 qq0 = (QQ0) rr5;
        0sP r0 = qq0.A04;
        if (r0 != null) {
            C51968G9o.A1O(r0, A01);
        }
        SUF suf = qq0.A01;
        if (suf == null) {
            return null;
        }
        String str = qq0.A0B;
        if (str == null) {
            str = "";
        }
        String str2 = qq0.A0A;
        long j = qq0.A06;
        String str3 = qq0.A03;
        String str4 = qq0.A09;
        String A1B = 002.A1B("{\"should_continue_checkout\":\"", "\"}", A01);
        String str5 = qq0.A02;
        AnonymousClass7TG.A0w(1, str2, str3, str4);
        0qQ.A0B(A1B, 6);
        0Aj A02 = SUF.A02(suf);
        if (!A02.isSampled()) {
            return null;
        }
        A02.AAJ(Q2M.A00(), str2);
        Pxh.A18(SUF.A03(suf), A02);
        0bb r5 = new 0bb();
        SUF.A09(r5, suf, "continue_checkout_callback");
        Pxi.A1B(A02, r5, DbY.A0q("csp_version", "2024-10", AnonymousClass7TE.A1L("shopify_sdk_payload", A1B), SUF.A08(str3)));
        0bb r02 = new 0bb();
        SUF.A0B(r02, str5, str, j);
        QKY.A00(A02, r02, suf, str, str4);
        A02.Cgf();
        return null;
    }
}
