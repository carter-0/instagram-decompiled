package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

/* renamed from: X.3NF  reason: invalid class name */
public abstract class AnonymousClass3NF {
    public static final boolean A00(UserSession userSession, AnonymousClass3BT r3) {
        0qQ.A0B(userSession, 0);
        if (AnonymousClass3BQ.MAIN_FEED_TRAY == r3.A04 && AnonymousClass3Mb.A00(userSession, r3) == 3) {
            return true;
        }
        return false;
    }

    public static final boolean A01(UserSession userSession, AnonymousClass3BT r2) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r2, 1);
        if (!A02(userSession, r2) || !A00(userSession, r2)) {
            return false;
        }
        return true;
    }

    public static final boolean A02(UserSession userSession, AnonymousClass3BT r3) {
        Reel reel = r3.A03;
        if (!reel.A1a || ((!r3.A06(userSession) && !reel.A0k()) || reel.A0i() || reel.A0p() || r3.A02)) {
            return false;
        }
        return true;
    }
}
