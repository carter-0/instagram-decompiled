package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.5na  reason: invalid class name and case insensitive filesystem */
public abstract class C295105na {
    public static final void A02(UserSession userSession, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(userSession, 1);
        0wc A02 = AnonymousClass0kN.A02(userSession);
        0Aj A00 = A02.A00(A02.A00, "ig_fb_feed_xpost_audience");
        if (A00.isSampled()) {
            A00.AAJ("action_name", str);
            A00.A7p("current_cross_posting_setting", Boolean.valueOf(z2));
            A00.AAJ("default_audience_entry_point", str4);
            A00.AAJ("default_audience", str3);
            A00.AAJ("instagram_user_id", userSession.A06);
            A00.AAJ("default_privacy_migration_phase", str2);
            A00.A7p("has_opt_in_default_audience_migration", Boolean.valueOf(z));
            A00.A7p("is_old_crossposter", Boolean.valueOf(z3));
            A00.AAJ("audience_cohort", str5);
            A00.Cgf();
        }
    }

    public static final void A00(UserSession userSession) {
        0wc A02 = AnonymousClass0kN.A02(userSession);
        0Aj A00 = A02.A00(A02.A00, "ig_fb_feed_xpost_audience");
        if (A00.isSampled()) {
            A00.AAJ("action_name", "default_privacy_info_fetch_failure");
            A00.AAJ("instagram_user_id", userSession.A06);
            A00.Cgf();
        }
    }

    public static final void A01(UserSession userSession, Boolean bool, String str) {
        0wc A02 = AnonymousClass0kN.A02(userSession);
        0Aj A00 = A02.A00(A02.A00, "ig_fb_feed_xpost_audience");
        if (A00.isSampled()) {
            A00.AAJ("action_name", "default_privacy_info_fetch_success");
            A00.AAJ("instagram_user_id", userSession.A06);
            A00.A9F("audience_setting", (Long) null);
            A00.AAJ("default_audience", str);
            A00.A7p("has_opt_in_default_audience_migration", bool);
            A00.Cgf();
        }
    }
}
