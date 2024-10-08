package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.common.session.UserSession;

/* renamed from: X.ClL  reason: case insensitive filesystem */
public abstract class C44809ClL {
    public static final void A00(0sP r16, UserSession userSession) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 0);
        1vm.A01(userSession2).A06(new PandoGraphQLRequest(C41845B3m.A05(), "IGSharedAccountsQuery", C41845B3m.A04().getParamsCopy(), C41845B3m.A04().getParamsCopy(), C43377BxF.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "me", AnonymousClass7TE.A1C()).setFreshCacheAgeMs(0).setMaxToleratedCacheAgeMs(0), new CHB(2, userSession2, r16));
    }
}
