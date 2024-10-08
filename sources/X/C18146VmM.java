package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.VmM  reason: case insensitive filesystem */
public abstract class C18146VmM {
    public static final 1OC A00(UserSession userSession, String str, String str2, int i, int i2) {
        0qQ.A0B(userSession, 0);
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A0A("ads/ads_manager/fetch_promotions_v2/");
        A0a.A9m("ads_manager_section", str);
        A0a.A0C("count", i);
        A0a.A0C("cursor", i2);
        A0a.A0C("include_split_tests", 1);
        A0a.A0G("fb_auth_token", str2);
        return DbU.A0S(A0a, C15255UXp.class, C18149VmP.class);
    }

    public static final 1OC A01(UserSession userSession, String str, String str2, String str3, String str4) {
        AnonymousClass7TG.A1N(userSession, str);
        0qQ.A0B(str4, 4);
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        C51968G9o.A1K(A0a, "ads/ads_manager/resume_promotion_v2/", str);
        A0a.A9m("fb_auth_token", str3);
        A0a.A0G("flow_id", str4);
        A0a.A0G("boosted_id", str2);
        return DbU.A0S(A0a, UXS.class, C18148VmO.class);
    }
}
