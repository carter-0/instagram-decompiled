package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

/* renamed from: X.6WN  reason: invalid class name */
public abstract class AnonymousClass6WN {
    public static final boolean A00(UserSession userSession, Reel reel) {
        if (!reel.getId().equals("election:rollcall_v2") || AnonymousClass3BJ.A00(userSession).A03) {
            return false;
        }
        return true;
    }
}
