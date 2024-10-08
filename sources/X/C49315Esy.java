package X;

/* renamed from: X.Esy  reason: case insensitive filesystem */
public abstract class C49315Esy {
    public static volatile String A00;
    public static volatile String A01;

    public static final void A00(0lg r7, String str, String str2) {
        DbY.A1S(r7, str2);
        String A02 = DbT.A0P(r7).A02(19f.A2A);
        if (A02 != null && A02.length() != 0) {
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(r7), "send_phone_id_request");
            String A0m = DbZ.A0m(r7);
            double A012 = DbS.A01();
            if (A0e.isSampled()) {
                DbW.A13(A0e, A012);
                DbY.A1D(A0e, A012, DbS.A00());
                FH8.A06(A0e);
                A0e.AAJ("containermodule", str2);
                A0e.AAJ("prefill_type", "both");
                DbZ.A1F(A0e, DbS.A00());
                DbS.A1H(A0e, str);
                FH8.A04(A0e);
                FH8.A0A(A0e, r7);
                DbY.A1A(A0e);
                DbV.A1H(A0e, A0m);
            }
            1NY A0a = AnonymousClass7TG.A0a(r7);
            A0a.A0A("accounts/contact_point_prefill/");
            A0a.A9m("usage", "prefill");
            A0a.A9m("phone_id", A02);
            A0a.A0R(Dw1.class, F8O.class);
            1OC A0U = DbT.A0U(A0a, true);
            A0U.A00 = new EDP(r7, str, str2);
            1ES.A03(A0U);
        }
    }
}
