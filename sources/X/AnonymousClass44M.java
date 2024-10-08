package X;

import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeProtocol;
import com.instagram.user.model.User;
import java.util.List;
import java.util.Map;

/* renamed from: X.44M  reason: invalid class name */
public final class AnonymousClass44M implements C2598643j {
    public final UserSession A00;

    public final AnonymousClass6BN E4Y(AnonymousClass651 r7, AnonymousClass653 r8, List list, Map map, 0sL r11, 0sL r12, boolean z) {
        0qQ.A0B(map, 0);
        0qQ.A0B(r8, 2);
        String str = (String) map.get(RealtimeProtocol.USER_ID);
        if (str == null) {
            return AnonymousClass6BO.A00;
        }
        String str2 = r8.A02;
        0qQ.A06(str2);
        int parseInt = Integer.parseInt(str2);
        UserSession userSession = this.A00;
        17i A002 = 17h.A00(userSession);
        User A02 = A002.A02(str);
        if (A02 == null && (A02 = A002.A00(Long.parseLong(str))) == null) {
            return new CHW("ReachabilityStatusDeltaProcessor", "No cached user to update");
        }
        A02.A0r(Integer.valueOf(parseInt));
        A002.A03(A02);
        AnonymousClass1Nd.A00(userSession).A00(new C331067Pj(A02));
        return AnonymousClass6BL.A00;
    }

    public AnonymousClass44M(UserSession userSession) {
        this.A00 = userSession;
    }
}
