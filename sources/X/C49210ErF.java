package X;

/* renamed from: X.ErF  reason: case insensitive filesystem */
public abstract class C49210ErF {
    public static final void A00(0lg r7, C49922FEx fEx, Boolean bool, String str, String str2) {
        String str3;
        double A01 = DbS.A01();
        double A00 = DbS.A00();
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(r7), "facebook_sso_success");
        DbZ.A1H(A0e, A01, A00);
        DbW.A13(A0e, A01);
        FH8.A0E(A0e, "step", str);
        FH8.A0D(A0e, r7, "instagram_id", str2);
        Boolean bool2 = null;
        if (fEx != null) {
            str3 = fEx.A00.getString(DbX.A0s(C48071EUp.A0B));
        } else {
            str3 = null;
        }
        A0e.AAJ("recovery_type", str3);
        if (fEx != null) {
            bool2 = DbU.A0g(fEx.A00, DbX.A0s(C48071EUp.A0C));
        }
        A0e.A7p("was_from_recovery_flow", bool2);
        A0e.A7p("is_facebook_linking_flow", (Boolean) null);
        A0e.A7p("found_unlinked_account", bool);
        A0e.A7p("is_signup_with_confirmed_phone_flow", (Boolean) null);
        A0e.Cgf();
    }
}
