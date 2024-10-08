package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.common.session.UserSession;

public abstract class F9X {
    public static C43753C7x A00;

    public static void A01(1P0 r14, UserSession userSession, String str) {
        2IS A04 = C41845B3m.A04();
        DbZ.A1M(new PandoGraphQLRequest(C41845B3m.A06(C41848B3p.A1Z(A04, "identity_id", str)), "IGFxImBusinessReminderQuery", A04.getParamsCopy(), C41845B3m.A04().getParamsCopy(), C43753C7x.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "business_presence", AnonymousClass7TE.A1C()), r14, userSession);
    }

    public static C43751C7v A00() {
        C43753C7x c7x = A00;
        if (c7x == null || c7x.A0E() == null) {
            return null;
        }
        return c7x.A0E().A0E();
    }
}
