package X;

import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeProtocol;
import com.instagram.user.model.User;
import java.util.List;
import java.util.Map;

/* renamed from: X.43w  reason: invalid class name and case insensitive filesystem */
public final class C2599943w implements C2598643j {
    public final UserSession A00;

    public final AnonymousClass6BN E4Y(AnonymousClass651 r8, AnonymousClass653 r9, List list, Map map, 0sL r12, 0sL r13, boolean z) {
        String str;
        0qQ.A0B(map, 0);
        0qQ.A0B(r9, 2);
        String str2 = (String) map.get(RealtimeProtocol.USER_ID);
        Boolean A002 = C48861ElN.A00(r9.A02);
        if (str2 == null || A002 == null || !"replace".equals(r9.A00)) {
            return AnonymousClass6BO.A00;
        }
        UserSession userSession = this.A00;
        boolean booleanValue = A002.booleanValue();
        if (booleanValue) {
            str = "block";
        } else {
            str = "unblock";
        }
        C49815F8c.A01(userSession, str);
        User A02 = 17h.A00(userSession).A02(str2);
        if (A02 == null) {
            return new CHW("BlockingUsersDeltaProcessor:updateUserBlockingState", "No cached user to update");
        }
        Long BST = A02.BST();
        if (BST != null) {
            C295615oa.A01.A02(new C73931PmB(BST.longValue(), booleanValue ? 1 : 0), userSession);
        }
        A02.A0y(booleanValue);
        AnonymousClass1Nd.A00(userSession).A00(new C2370836g(A02, false));
        AnonymousClass1Nd.A00(userSession).A00(new 27U(A02));
        return AnonymousClass6BL.A00;
    }

    public C2599943w(UserSession userSession) {
        this.A00 = userSession;
    }
}
