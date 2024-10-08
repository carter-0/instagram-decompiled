package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.6u6  reason: invalid class name and case insensitive filesystem */
public abstract class C321406u6 {
    public static final void A02(AnonymousClass0iw r3, UserSession userSession, 1Xj r5, String str, String str2, boolean z) {
        Long l;
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r3, 1);
        0wc A01 = AnonymousClass0kN.A01(r3, userSession);
        0Aj A00 = A01.A00(A01.A00, "instagram_organic_story_p92_link_tap");
        String A2n = r5.A2n();
        if (A2n != null) {
            A00.A9F("media_id", Long.valueOf(Long.parseLong(A2n)));
            A00.AAJ("nav_chain", AnonymousClass1QI.A00.A02.A00);
            A00.AAJ("module", r3.getModuleName());
            A00.AAJ("interaction_source", str);
            if (str2 != null) {
                l = 00y.A0n(10, str2);
            } else {
                l = null;
            }
            A00.A9F("target_user_id", l);
            A00.A7p("is_barcelona_installed", Boolean.valueOf(z));
            A00.Cgf();
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final void A03(AnonymousClass0iw r5, UserSession userSession, Integer num, Integer num2, Integer num3, String str, String str2, String str3, String str4, String str5, boolean z) {
        Long l;
        Long l2;
        Long l3;
        0qQ.A0B(r5, 1);
        0qQ.A0B(str2, 3);
        0wc A01 = AnonymousClass0kN.A01(r5, userSession);
        0Aj A00 = A01.A00(A01.A00, "barcelona_growth_integration_tap");
        Long l4 = null;
        if (str3 != null) {
            1Xv r0 = 1Xj.A0h;
            String A06 = 1Xv.A06(str3);
            0qQ.A0B(A06, 0);
            l = 00y.A0n(10, A06);
        } else {
            l = null;
        }
        A00.A9F("media_id", l);
        if (str3 != null) {
            1Xv r02 = 1Xj.A0h;
            String A04 = 1Xv.A04(str3);
            0qQ.A0B(A04, 0);
            l2 = 00y.A0n(10, A04);
        } else {
            l2 = null;
        }
        A00.A9F("media_author_id", l2);
        A00.AAJ("nav_chain", AnonymousClass1QI.A00.A02.A00);
        A00.AAJ("module", r5.getModuleName());
        A00.AAJ("interaction_source", str);
        A00.AAJ("interaction_string", String.valueOf(num3));
        A00.A9F("target_user_id", 00y.A0n(10, str2));
        A00.A7p("is_barcelona_installed", Boolean.valueOf(z));
        if (str4 != null) {
            l3 = 00y.A0n(10, str4);
        } else {
            l3 = null;
        }
        A00.A9F("quick_promotion_id", l3);
        if (str5 != null) {
            l4 = 00y.A0n(10, str5);
        }
        A00.A9F("netego_id", l4);
        A00.A8k("total_num_candidates", num2);
        A00.A8k("media_index", num);
        A00.AAJ("design_version", (String) null);
        A00.Cgf();
    }

    public static final void A04(AnonymousClass0iw r3, UserSession userSession, Integer num, String str, String str2, boolean z) {
        Long l;
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r3, 1);
        0qQ.A0B(str, 2);
        0wc A01 = AnonymousClass0kN.A01(r3, userSession);
        0Aj A00 = A01.A00(A01.A00, "barcelona_growth_integration_impression");
        A00.AAJ("nav_chain", AnonymousClass1QI.A00.A02.A00);
        A00.AAJ("module", r3.getModuleName());
        A00.AAJ("impression_source", str);
        A00.A9F("target_user_id", 00y.A0n(10, str2));
        A00.A7p("is_barcelona_installed", Boolean.valueOf(z));
        if (num != null) {
            l = Long.valueOf((long) num.intValue());
        } else {
            l = null;
        }
        A00.A9F("badge_num_notifs", l);
        A00.Cgf();
    }

    public static final void A05(AnonymousClass0iw r3, UserSession userSession, String str, String str2, boolean z) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r3, 1);
        0qQ.A0B(str, 2);
        0wc A01 = AnonymousClass0kN.A01(r3, userSession);
        0Aj A00 = A01.A00(A01.A00, "barcelona_get_app_tap");
        A00.AAJ("nav_chain", AnonymousClass1QI.A00.A02.A00);
        A00.AAJ("module", r3.getModuleName());
        A00.AAJ("interaction_source", str);
        A00.A9F("target_user_id", 00y.A0n(10, str2));
        A00.A7p("is_barcelona_installed", Boolean.valueOf(z));
        A00.Cgf();
    }

    public static final boolean A06(String str) {
        if (str != null) {
            return 00l.A0d(str, AnonymousClass000.A00(1893), false) || 00l.A0d(str, "www.threads.net", false);
        }
        return false;
    }

    public static final void A00(AnonymousClass0iw r3, UserSession userSession, 1Xj r5, String str, String str2, boolean z) {
        Long l;
        0wc A01 = AnonymousClass0kN.A01(r3, userSession);
        0Aj A00 = A01.A00(A01.A00, "instagram_organic_reel_p92_link_tap");
        String A2n = r5.A2n();
        if (A2n != null) {
            A00.A9F("media_id", Long.valueOf(Long.parseLong(A2n)));
            A00.AAJ("nav_chain", AnonymousClass1QI.A00.A02.A00);
            A00.AAJ("module", r3.getModuleName());
            A00.AAJ("interaction_source", str);
            if (str2 != null) {
                l = 00y.A0n(10, str2);
            } else {
                l = null;
            }
            A00.A9F("target_user_id", l);
            A00.A7p("is_barcelona_installed", Boolean.valueOf(z));
            A00.Cgf();
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final void A01(AnonymousClass0iw r3, UserSession userSession, 1Xj r5, String str, String str2, boolean z) {
        Long l;
        0wc A01 = AnonymousClass0kN.A01(r3, userSession);
        0Aj A00 = A01.A00(A01.A00, "instagram_organic_feed_p92_link_tap");
        String A2n = r5.A2n();
        if (A2n != null) {
            A00.A9F("media_id", Long.valueOf(Long.parseLong(A2n)));
            A00.AAJ("nav_chain", AnonymousClass1QI.A00.A02.A00);
            A00.AAJ("module", r3.getModuleName());
            A00.AAJ("interaction_source", str);
            if (str2 != null) {
                l = 00y.A0n(10, str2);
            } else {
                l = null;
            }
            A00.A9F("target_user_id", l);
            A00.A7p("is_barcelona_installed", Boolean.valueOf(z));
            A00.Cgf();
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
