package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelType;
import com.instagram.user.model.User;

/* renamed from: X.6Vx  reason: invalid class name and case insensitive filesystem */
public final class C308866Vx implements 1UV {
    public final UserSession A00;
    public final User A01;

    public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
        1Ns r2;
        ReelType reelType;
        Reel reel = (Reel) obj;
        if (reel == null || (r2 = reel.A0W) == null || (((reelType = reel.A0P) != null && reelType == ReelType.A0I) || !0qQ.A0K(r2.getId(), this.A01.getId()) || !reel.A15(this.A00))) {
            return true;
        }
        return false;
    }

    public C308866Vx(UserSession userSession, User user) {
        this.A01 = user;
        this.A00 = userSession;
    }
}
