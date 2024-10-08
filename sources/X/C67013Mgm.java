package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Mgm  reason: case insensitive filesystem */
public abstract class C67013Mgm {
    public static final void A00(UserSession userSession, AnonymousClass9HT r4) {
        AnonymousClass7TG.A1N(userSession, r4);
        AnonymousClass3H3 r2 = 2J7.A00(userSession).A00;
        int i = r2.A02;
        if (i != -1) {
            r4.A0G("total_badge_count", i);
            r4.A0G("open_badge_count", r2.A00);
            r4.A0G("e2ee_badge_count", r2.A01);
            r4.A0K("badge_count_excludes_muted_threads", 182.A06(0Tu.A06, userSession, 36320837615297421L));
        }
    }
}
