package X;

import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeProtocol;
import com.instagram.user.model.User;
import java.util.List;
import java.util.Map;

/* renamed from: X.43y  reason: invalid class name and case insensitive filesystem */
public final class C2600143y implements C2598643j {
    public final UserSession A00;

    public final AnonymousClass6BN E4Y(AnonymousClass651 r6, AnonymousClass653 r7, List list, Map map, 0sL r10, 0sL r11, boolean z) {
        String str;
        0qQ.A0B(map, 0);
        0qQ.A0B(r7, 2);
        String str2 = (String) map.get(RealtimeProtocol.USER_ID);
        Boolean A002 = C48861ElN.A00(r7.A02);
        if (str2 == null || A002 == null || !"replace".equals(r7.A00)) {
            return AnonymousClass6BO.A00;
        }
        UserSession userSession = this.A00;
        boolean booleanValue = A002.booleanValue();
        if (booleanValue) {
            str = "pseudoblock";
        } else {
            str = "pseudounblock";
        }
        C49815F8c.A01(userSession, str);
        User A02 = 17h.A00(userSession).A02(str2);
        if (A02 == null) {
            return new CHW("MessagingOnlyBlockingDeltaProcessor", "No cached user to update");
        }
        A02.A1C(booleanValue);
        return AnonymousClass6BL.A00;
    }

    public C2600143y(UserSession userSession) {
        this.A00 = userSession;
    }
}
