package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

/* renamed from: X.Eqz  reason: case insensitive filesystem */
public abstract class C49194Eqz {
    public static void A00(UserSession userSession, User user, boolean z) {
        user.A0y(z);
        AnonymousClass1Nd.A00(userSession).A00(new 27U(user));
        C294695ms.A00(userSession).A0D(FollowStatus.A06, user, true);
        user.A0d(userSession);
        if (z) {
            C14025ToR.A00(userSession).A00(user);
            AnonymousClass2f1.A00(userSession).A0P(user);
        }
    }
}
