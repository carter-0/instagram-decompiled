package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.ReelType;
import com.instagram.user.model.User;

/* renamed from: X.VIq  reason: case insensitive filesystem */
public abstract class C17120VIq {
    public static final boolean A00(UserSession userSession, C255773uh r3, C250973mM r4) {
        User user = r3.A0i;
        if ((r3.A0b != null || r3.A17()) && user != null && ((DbV.A1Z(user, userSession.A06) || user.A0N() == AnonymousClass05K.A01) && r4.A0H.A0P != ReelType.A0c)) {
            return true;
        }
        return false;
    }
}
