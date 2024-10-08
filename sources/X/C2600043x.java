package X;

import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeConstants;
import com.instagram.realtimeclient.RealtimeProtocol;
import com.instagram.user.model.User;
import java.util.List;
import java.util.Map;

/* renamed from: X.43x  reason: invalid class name and case insensitive filesystem */
public final class C2600043x implements C2598643j {
    public final UserSession A00;

    public final AnonymousClass6BN E4Y(AnonymousClass651 r10, AnonymousClass653 r11, List list, Map map, 0sL r14, 0sL r15, boolean z) {
        0qQ.A0B(map, 0);
        0qQ.A0B(r11, 2);
        String str = (String) map.get(RealtimeProtocol.USER_ID);
        Boolean A002 = C48861ElN.A00(r11.A02);
        if (str == null || A002 == null || !"replace".equals(r11.A00)) {
            return AnonymousClass6BO.A00;
        }
        boolean booleanValue = A002.booleanValue();
        UserSession userSession = this.A00;
        User A02 = 17h.A00(userSession).A02(str);
        if (A02 == null) {
            return new CHW("MessagingOnlyBlockingDeltaProcessor", "No cached user to update");
        }
        Long BST = A02.BST();
        if (BST != null) {
            long longValue = BST.longValue();
            int i = 0;
            if (booleanValue) {
                i = 2;
            }
            C295615oa.A01.A02(new C73931PmB(longValue, i), userSession);
        }
        A02.A1B(booleanValue);
        AnonymousClass1Nd.A00(userSession).A00(new C50276FWh(RealtimeConstants.SEND_SUCCESS, str, booleanValue));
        AnonymousClass1Nd.A00(userSession).A00(new 27U(A02));
        return AnonymousClass6BL.A00;
    }

    public C2600043x(UserSession userSession) {
        this.A00 = userSession;
    }
}
