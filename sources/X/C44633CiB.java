package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.common.session.UserSession;
import com.instagram.creator.inspiration.repository.graphql.GetTopAudioTrendsEligibleCategoriesResponseImpl;

/* renamed from: X.CiB  reason: case insensitive filesystem */
public abstract class C44633CiB {
    public static final void A00(0sP r17, UserSession userSession) {
        UserSession userSession2 = userSession;
        long A01 = 182.A01(0Tu.A05, userSession2, 36609876029544387L);
        2IS A04 = C41845B3m.A04();
        2IS A042 = C41845B3m.A04();
        1Ef maxToleratedCacheAgeMs = new PandoGraphQLRequest(C41845B3m.A05(), "GetTopAudioTrendsEligibleCategories", A04.getParamsCopy(), A042.getParamsCopy(), GetTopAudioTrendsEligibleCategoriesResponseImpl.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, AnonymousClass000.A00(1947), AnonymousClass7TE.A1C()).setFreshCacheAgeMs(A01).setMaxToleratedCacheAgeMs(A01);
        1vm.A01(userSession2).ATL(DF1.A00, new FSC(r17, 3), maxToleratedCacheAgeMs);
    }
}
