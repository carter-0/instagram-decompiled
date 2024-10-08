package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Em2  reason: case insensitive filesystem */
public abstract class C48902Em2 {
    public static final void A00(UserSession userSession, String str, String str2, int i) {
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        Dba.A1H(A0a, "direct_v2/click_to_direct_ad_interaction_trigger/");
        A0a.A9m("ad_id", str);
        A0a.A9m("should_enable_ctd_thread_landing", "true");
        A0a.A0C("thread_landing_experience_type", i);
        1ES.A03(DbT.A0T(A0a, "encrypted_consumer_token", str2));
    }
}
