package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.6kK  reason: invalid class name and case insensitive filesystem */
public abstract class C315676kK {
    public static boolean A00(UserSession userSession, AnonymousClass3BQ r5) {
        0Tu r3 = 0Tu.A05;
        if (182.A06(r3, userSession, 36324737446916407L) || ((r5 == AnonymousClass3BQ.PROFILE_HIGHLIGHTS_TRAY || r5 == AnonymousClass3BQ.HIGHLIGHTS_IN_GRID_SUBTAB) && 182.A06(r3, userSession, 36324737446195503L))) {
            return true;
        }
        return false;
    }

    public static boolean A01(UserSession userSession, AnonymousClass3BQ r4) {
        0Tu r2 = 0Tu.A05;
        if (182.A06(r2, userSession, 36310379369922600L)) {
            return false;
        }
        if (r4 == AnonymousClass3BQ.MAIN_FEED_TRAY) {
            return 182.A06(r2, userSession, 36310379369857063L);
        }
        return true;
    }
}
