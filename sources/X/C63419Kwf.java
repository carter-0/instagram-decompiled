package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Kwf  reason: case insensitive filesystem */
public abstract class C63419Kwf {
    public static final boolean A00(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        if (C363558jv.A00(userSession)) {
            return false;
        }
        0xa A0q = AnonymousClass7TE.A0q(userSession);
        long A06 = DbW.A06(A0q, "fb_feed_crossposting_toggle_tooltip_last_seen_time_in_ms");
        long currentTimeMillis = System.currentTimeMillis();
        if (A0q.getInt("fb_feed_crossposting_advanced_settings_tooltip", 0) >= 3 || currentTimeMillis - A06 <= LO1.A03) {
            return false;
        }
        if (C367998ru.A03(AnonymousClass818.IG_FEED_COMPOSER_SHARE_TO_FACEBOOK_TOGGLE_TOOLTIP, AnonymousClass819.TOOLTIP_AUTOSHARE_FEED, userSession)) {
            return true;
        }
        return false;
    }
}
