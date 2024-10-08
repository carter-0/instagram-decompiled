package X;

import com.instagram.api.schemas.IGAIAgentType;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.7Ey  reason: invalid class name and case insensitive filesystem */
public abstract class C328477Ey {
    public static final boolean A00(UserSession userSession, AnonymousClass7LQ r4) {
        String str;
        User user = r4.A0K;
        IGAIAgentType iGAIAgentType = null;
        if (user != null) {
            str = user.A03.AaZ();
        } else {
            str = null;
        }
        if (0qQ.A0K(str, userSession.A06)) {
            User user2 = r4.A0K;
            if (user2 != null) {
                iGAIAgentType = user2.A03.AaX();
            }
            if (iGAIAgentType != IGAIAgentType.A04 || r4.A0G.A08 == 1013) {
                return false;
            }
            return true;
        }
        return false;
    }
}
