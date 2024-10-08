package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.common.session.UserSession;
import java.util.List;

public abstract class F5s {
    public static final void A00(2Kw r16, AnonymousClass2Kv r17, UserSession userSession, List list, boolean z) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 0);
        1vn A01 = 1vm.A01(userSession2);
        2IV r4 = new 2IV();
        r4.A05("auto_confirm_accounts_to_disable_ids", list);
        r4.A08("should_disable_auto_confirm_for_all_reciprocal_requests", Boolean.valueOf(z));
        2IS A04 = C41845B3m.A04();
        2IS A042 = C41845B3m.A04();
        A04.A00(r4, "data");
        2Kw r1 = r16;
        A01.ATL(r1, r17, new PandoGraphQLRequest(C41845B3m.A05(), "DisableAutoConfirmReciprocalFollowRequests", A04.getParamsCopy(), A042.getParamsCopy(), BlR.class, true, (PandoRealtimeInfoJNI) null, 0, (String) null, "xdt_disable_auto_confirm_reciprocal_follow_requests", AnonymousClass7TE.A1C()));
    }

    public static final void A01(2Kw r16, AnonymousClass2Kv r17, UserSession userSession, List list, boolean z) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 0);
        1vn A01 = 1vm.A01(userSession2);
        2IV r4 = new 2IV();
        r4.A05("auto_confirm_accounts_ids", list);
        r4.A08("should_auto_confirm_all_reciprocal_requests", Boolean.valueOf(z));
        2IS A04 = C41845B3m.A04();
        2IS A042 = C41845B3m.A04();
        A04.A00(r4, "data");
        2Kw r1 = r16;
        A01.ATL(r1, r17, new PandoGraphQLRequest(C41845B3m.A05(), "EnableAutoConfirmReciprocalFollowRequests", A04.getParamsCopy(), A042.getParamsCopy(), BlT.class, true, (PandoRealtimeInfoJNI) null, 0, (String) null, "xdt_enable_auto_confirm_reciprocal_follow_requests", AnonymousClass7TE.A1C()));
    }
}
