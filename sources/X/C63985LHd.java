package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.LHd  reason: case insensitive filesystem */
public abstract class C63985LHd {
    public static final void A00(UserSession userSession, String str, String str2) {
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(userSession), AnonymousClass000.A00(3811));
        if (A0e.isSampled()) {
            DbS.A1N(A0e, str);
            JTS.A18(A0e, 1Q9.A01("boost_posts"));
            DbS.A1H(A0e, "media_selection");
            A0e.AAJ("fb_user_id", userSession.A06);
            A0e.AAJ("error_message", str2);
            A0e.Cgf();
        }
    }

    public static final void A01(UserSession userSession, String str, String str2) {
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(userSession), AnonymousClass000.A00(1724));
        if (A0e.isSampled()) {
            0bb r2 = new 0bb();
            r2.A03("is_business_user_access_token_enabled_and_cached", Boolean.valueOf(JTU.A1R(r2, userSession)));
            A0e.AAJ("component", str2);
            DbS.A1N(A0e, str);
            JTS.A18(A0e, 1Q9.A01("boost_posts"));
            DbS.A1H(A0e, "media_selection");
            A0e.AAK(r2, "configurations");
            A0e.Cgf();
        }
    }
}
