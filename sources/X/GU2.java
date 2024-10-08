package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.FollowStatus;

public abstract class GU2 {
    public static final C319986rY A00(UserSession userSession, FollowStatus followStatus, Integer num, String str) {
        DbY.A1S(userSession, num);
        if (str.equals(userSession.A06)) {
            return C319986rY.SELF;
        }
        if (AnonymousClass2f1.A00(userSession).A0M(followStatus, num, str) == FollowStatus.A05) {
            return C319986rY.FOLLOWING;
        }
        return C319986rY.NOT_FOLLOWING;
    }
}
