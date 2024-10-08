package X;

import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeProtocol;
import com.instagram.user.model.User;
import java.util.List;
import java.util.Map;

/* renamed from: X.43v  reason: invalid class name and case insensitive filesystem */
public final class C2599843v implements C2598643j {
    public final UserSession A00;

    public final AnonymousClass6BN E4Y(AnonymousClass651 r9, AnonymousClass653 r10, List list, Map map, 0sL r13, 0sL r14, boolean z) {
        String str;
        0qQ.A0B(map, 0);
        0qQ.A0B(r10, 2);
        String str2 = (String) map.get(RealtimeProtocol.USER_ID);
        Boolean A002 = C48861ElN.A00(r10.A02);
        if (str2 == null || A002 == null || !"replace".equals(r10.A00)) {
            return AnonymousClass6BO.A00;
        }
        UserSession userSession = this.A00;
        boolean booleanValue = A002.booleanValue();
        if (booleanValue) {
            str = "restrict";
        } else {
            str = "unrestrict";
        }
        C49815F8c.A01(userSession, str);
        User A02 = 17h.A00(userSession).A02(str2);
        if (A02 == null) {
            return new CHW("RestrictingUsersDeltaProcessor", "No cached user to update");
        }
        Long BST = A02.BST();
        if (BST != null) {
            C295615oa.A01.A02(new C73942PmM(BST.longValue(), 0, booleanValue), userSession);
        }
        A02.A1E(booleanValue);
        AnonymousClass1Nd.A00(userSession).A00(new C290835g2(A02));
        return AnonymousClass6BL.A00;
    }

    public C2599843v(UserSession userSession) {
        this.A00 = userSession;
    }
}
