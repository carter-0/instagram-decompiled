package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.common.session.UserSession;

/* renamed from: X.EmP  reason: case insensitive filesystem */
public abstract class C48925EmP {
    public static final void A00(UserSession userSession, String str) {
        if (182.A06(0Tu.A05, userSession, 36314485360560727L)) {
            2IS A04 = C41845B3m.A04();
            1Ef maxToleratedCacheAgeMs = new PandoGraphQLRequest(DbU.A0J(A04, "upsell_name", str), "FXGrowthLogImpressionForISUpsell", A04.getParamsCopy(), C41845B3m.A04().getParamsCopy(), BnI.class, true, (PandoRealtimeInfoJNI) null, 0, (String) null, "fx_growth_log_impression_for_is_upsell", AnonymousClass7TE.A1C()).setMaxToleratedCacheAgeMs(0);
            1vm.A01(userSession).ATL(C50166FRy.A00, FSU.A00, maxToleratedCacheAgeMs);
            return;
        }
        2IS A042 = C41845B3m.A04();
        A042.A04("upsell_name", str);
        C239113Fa r3 = new C239113Fa(A042, C47081DqI.class, "FXGrowthLogImpressionForISUpsell", true);
        0qQ.A0A(C363088j4.A00(userSession).ATL(C50167FRz.A00, FSV.A00, r3));
    }
}
