package X;

/* renamed from: X.ErE  reason: case insensitive filesystem */
public abstract class C49209ErE {
    public static final void A00(0lg r7, Boolean bool, String str, String str2, String str3, boolean z, boolean z2) {
        long j;
        boolean A1Z = AnonymousClass7TG.A1Z(r7, str);
        double A01 = DbS.A01();
        double A00 = DbS.A00();
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(r7), "facebook_sso_error");
        DbZ.A1H(A0e, A01, A00);
        DbW.A13(A0e, A01);
        FH8.A0E(A0e, "step", str);
        A0e.AAJ("error", str3);
        A0e.A9F("fbid", DbZ.A0d(str2));
        A0e.A7p("has_response", Boolean.valueOf(z));
        A0e.A7p("found_unlinked_account", Boolean.valueOf(z2));
        A0e.A7p("fb4a_installed", Boolean.valueOf(AnonymousClass1G3.A03()));
        if (bool.equals(Boolean.valueOf(A1Z))) {
            j = 1;
        } else {
            j = 0;
        }
        A0e.A9F("token_source", Long.valueOf(j));
        A0e.Cgf();
    }
}
