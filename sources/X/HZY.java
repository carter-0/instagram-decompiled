package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.common.session.UserSession;

public abstract class HZY {
    public static void A00(UserSession userSession, 0sP r17, 0sP r18) {
        1vn A01 = 1vm.A01(userSession);
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(C41845B3m.A05(), "IGEBPrimaryDeviceQuery", C41845B3m.A04().getParamsCopy(), C41845B3m.A04().getParamsCopy(), C42732BhT.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "viewer", AnonymousClass7TE.A1C());
        pandoGraphQLRequest.setMaxToleratedCacheAgeMs(0);
        pandoGraphQLRequest.setEnsureCacheWrite(false);
        pandoGraphQLRequest.setRetryPolicy(1);
        pandoGraphQLRequest.setNetworkTimeoutSeconds(15);
        0sP r4 = r18;
        A01.ATL(new C45917DEx(r4, 4), new DFQ(3, r17, r4), pandoGraphQLRequest);
    }
}
