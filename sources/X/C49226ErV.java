package X;

/* renamed from: X.ErV  reason: case insensitive filesystem */
public abstract class C49226ErV {
    public static final void A00(0lg r6, EXD exd, C46634DiE diE, String str) {
        String str2;
        DbZ.A0t(0, r6, diE, str);
        double A01 = DbS.A01();
        double A00 = DbS.A00();
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(r6), "suggestion_prefilled");
        DbY.A1D(A0e, A01, A00);
        if (exd == null || (str2 = exd.A00) == null) {
            str2 = "null";
        }
        DbS.A1G(A0e, str2);
        DbS.A1H(A0e, diE.A01);
        Dbc.A0c(A0e, "username_suggestion_string", str, A00);
        DbW.A13(A0e, A01);
        FH8.A04(A0e);
        FH8.A09(A0e, r6);
        A0e.AAJ("app_device_id", FH8.A00());
        A0e.Cgf();
    }
}
