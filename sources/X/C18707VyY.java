package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.VyY  reason: case insensitive filesystem */
public abstract class C18707VyY {
    public static final 0xG A00 = new 0xG("app");

    public static final void A01(UserSession userSession, String str) {
        0qQ.A0B(userSession, 1);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(A00, userSession), "payments_tap_entry_point");
        if (A0e.isSampled()) {
            DbS.A1N(A0e, str);
            JTS.A18(A0e, 1Q9.A01("ads_manager"));
            A0e.Cgf();
        }
    }

    public static final void A00(C16678UzE uzE, UserSession userSession, String str) {
        DbY.A1S(uzE, userSession);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(userSession), AnonymousClass000.A00(3811));
        if (A0e.isSampled()) {
            DbS.A1N(A0e, str);
            JTS.A18(A0e, 1Q9.A01("boost_posts"));
            DbS.A1H(A0e, uzE.toString());
            A0e.AAJ("fb_user_id", userSession.A06);
            A0e.Cgf();
        }
    }
}
