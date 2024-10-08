package X;

import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeProtocol;
import com.instagram.user.model.User;
import java.util.List;
import java.util.Map;

/* renamed from: X.44J  reason: invalid class name */
public final class AnonymousClass44J implements C2598643j {
    public final UserSession A00;

    public final AnonymousClass6BN E4Y(AnonymousClass651 r7, AnonymousClass653 r8, List list, Map map, 0sL r11, 0sL r12, boolean z) {
        0qQ.A0B(map, 0);
        0qQ.A0B(r8, 2);
        String str = (String) map.get(RealtimeProtocol.USER_ID);
        Boolean A002 = C48861ElN.A00(r8.A02);
        if (str == null || A002 == null) {
            return AnonymousClass6BO.A00;
        }
        boolean booleanValue = A002.booleanValue();
        UserSession userSession = this.A00;
        17i A003 = 17h.A00(userSession);
        User A02 = A003.A02(str);
        if (A02 == null && (A02 = A003.A00(Long.parseLong(str))) == null) {
            return new CHW("UpdateViewerUnconnectedDeltaProcessor", "No cached user to update");
        }
        A02.A1G(booleanValue);
        AnonymousClass1Nd.A00(userSession).A00(new C45960DGp(A02));
        return AnonymousClass6BL.A00;
    }

    public AnonymousClass44J(UserSession userSession) {
        this.A00 = userSession;
    }
}
