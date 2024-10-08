package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.common.session.UserSession;

public abstract class O07 {
    public static final void A00(UserSession userSession, C74418PuY puY) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 0);
        2IS A04 = C41845B3m.A04();
        2IS A042 = C41845B3m.A04();
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(C41845B3m.A05(), "InstagramContactSyncForWearablesQuery", A04.getParamsCopy(), A042.getParamsCopy(), QWV.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, Pxd.A00(935), AnonymousClass7TE.A1C());
        pandoGraphQLRequest.setFreshCacheAgeMs((long) (182.A00(0Tu.A05, userSession2, 37172757263417926L) * 60.0d * 60.0d * 1000.0d));
        pandoGraphQLRequest.setEnsureCacheWrite(true);
        pandoGraphQLRequest.setAdditionalCacheQueryKey(userSession2.A06);
        C74418PuY puY2 = puY;
        C71567On2.A00(new C12093Smn(puY2, 6), pandoGraphQLRequest, 1vm.A01(userSession2), puY2, 17);
    }
}
