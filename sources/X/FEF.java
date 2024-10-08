package X;

import com.instagram.common.session.UserSession;

public final class FEF {
    public static final FEF A00 = new Object();

    public static final void A00(UserSession userSession, String str, String str2) {
        String str3;
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(userSession), "instagram_pro_dash_error");
        A0e.AAJ("component", "self_profile_pro_home_hypercard_entrypoint");
        A0e.AAJ(AnonymousClass000.A00(1313), str);
        A0e.A9F(C273654mx.A00(310), Long.valueOf(DbZ.A07(userSession.A06)));
        16V A0J = AnonymousClass7TF.A0Q(userSession).A0J();
        if (A0J == null || (str3 = A0J.A01) == null) {
            str3 = "business";
        }
        A0e.AAJ("interest_account_type", str3);
        A0e.AAJ(AnonymousClass000.A00(1311), str2);
        A0e.AAJ("origin", "self_profile");
        A0e.Cgf();
    }
}
