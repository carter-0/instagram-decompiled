package X;

import com.instagram.common.session.UserSession;

public final class LT4 {
    public static final LT4 A00 = new Object();

    public final void A05(UserSession userSession, boolean z) {
        JZY jzy;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession, 0);
        AnonymousClass818 r2 = AnonymousClass818.IG_FEED_COMPOSER_ADVANCED_SETTINGS_SHARE_TO_THREADS_TOGGLE_ENABLE;
        if (z) {
            jzy = JZY.AUTO_ON;
        } else {
            jzy = JZY.AUTO_OFF;
        }
        A00(jzy, JZZ.FEED, r2, (C60757Jqo) null, userSession2, true);
    }

    public static final void A03(C62662KkO kkO, C62646Kk8 kk8, C62656KkI kkI, UserSession userSession, String str) {
        A01(C62640Kk2.A02, kkO, (C62655KkH) null, (C62644Kk6) null, (C62645Kk7) null, kk8, kkI, userSession, str);
    }

    public final void A04(UserSession userSession, String str, boolean z, boolean z2) {
        0bb r3;
        JZY jzy;
        if (str != null) {
            r3 = new 0bb();
            r3.A06("unavailable_reason", str);
        } else {
            r3 = null;
        }
        AnonymousClass818 r2 = AnonymousClass818.IG_FEED_COMPOSER_SHARE_TO_THREADS_TOGGLE_ENABLE;
        if (z) {
            jzy = JZY.VIEW;
        } else {
            jzy = JZY.UNAVAILABLE;
        }
        A00(jzy, JZZ.FEED, r2, r3, userSession, z2);
    }

    public static final void A00(JZY jzy, JZZ jzz, AnonymousClass818 r6, C60757Jqo jqo, UserSession userSession, boolean z) {
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(userSession), "crosspost_controls");
        0bb r3 = new 0bb();
        r3.A03("is_account_linked", Boolean.valueOf(z));
        r3.A03("is_auto_xpost_enabled", Boolean.valueOf(DbT.A1a(C347757xK.A00(userSession).A00, "PREFERENCE_SHARE_TO_BARCELONA_AUTO_POSTING")));
        if (A0e.isSampled()) {
            DbS.A1F(r6, A0e);
            A0e.A8M(jzy, "event_type");
            A0e.A8M(jzz, "product_type");
            A0e.AAK(r3, "user_info");
            A0e.AAK(jqo, "creation_info");
            A0e.Cgf();
        }
    }

    public static final void A01(C62640Kk2 kk2, C62662KkO kkO, C62655KkH kkH, C62644Kk6 kk6, C62645Kk7 kk7, C62646Kk8 kk8, C62656KkI kkI, UserSession userSession, String str) {
        0bb r3;
        String str2;
        AnonymousClass7TG.A1N(userSession, str);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(userSession), "ig_p92_onboarding_tap");
        if (A0e.isSampled()) {
            A0e.AAJ("onboarding_session_id", str);
            DbS.A1F(kk2, A0e);
            A0e.A8M(kkI, "step_name");
            A0e.A8M(kkO, "event_type");
            if (kk6 != null) {
                r3 = new 0bb();
                r3.A01(kk6, "interaction");
                str2 = "login_step_info";
            } else if (kk8 != null) {
                r3 = new 0bb();
                r3.A01(kk8, "toggle_state");
                if (kk7 != null) {
                    r3.A01(kk7, "interaction");
                }
                str2 = "privacy_selection_step_info";
            } else {
                if (kkH != null) {
                    r3 = new 0bb();
                    r3.A01(C62641Kk3.A02, "interaction");
                    r3.A01(kkH, "learn_more_section");
                    str2 = "how_it_works_step_info";
                }
                A0e.Cgf();
            }
            A0e.AAK(r3, str2);
            A0e.Cgf();
        }
    }

    public static final void A02(C62640Kk2 kk2, C62646Kk8 kk8, C62656KkI kkI, UserSession userSession, String str) {
        0Aj A0e = AnonymousClass7TE.A0e(DbX.A0Q(userSession), "ig_p92_onboarding_impression");
        if (A0e.isSampled()) {
            A0e.AAJ("onboarding_session_id", str);
            DbS.A1F(kk2, A0e);
            A0e.A8M(kkI, "step_name");
            if (kk8 != null) {
                0bb r1 = new 0bb();
                r1.A01(kk8, "toggle_state");
                A0e.AAK(r1, "privacy_selection_step_info");
            }
            A0e.Cgf();
        }
    }
}
