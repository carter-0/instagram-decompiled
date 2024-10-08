package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.3PL  reason: invalid class name */
public abstract class AnonymousClass3PL {
    public static final boolean A00(UserSession userSession, String str, boolean z) {
        0Tu r3 = 0Tu.A05;
        if (182.A06(r3, userSession, 36317517610226947L) && !z) {
            return false;
        }
        if (182.A06(r3, userSession, 36317517610161410L) && !z) {
            return true;
        }
        if ("feed_timeline".equals(str) || "reel_server_prefetch".equals(str) || "reel_background_prefetch".equals(str) || "profile".equals(str) || "self_profile".equals(str) || "calendar_archive".equals(str)) {
            return false;
        }
        return true;
    }
}
