package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.9EP  reason: invalid class name */
public abstract class AnonymousClass9EP {
    public static final void A00(UserSession userSession, AnonymousClass9EN r17, String str, boolean z) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 0);
        String str2 = str;
        0qQ.A0B(str2, 2);
        2IS r4 = new 2IS();
        2IS r3 = new 2IS();
        r4.A04("caller_name", "fx_company_identity_switcher");
        r4.A04("family_device_id", str2);
        r4.A02("should_force_badge_refresh", Boolean.valueOf(z));
        AnonymousClass2IY r0 = PandoGraphQLRequest.Companion;
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AnonymousClass1vS.A00(), "FxIgXavSwitcherBadgingDataQuery", r4.getParamsCopy(), r3.getParamsCopy(), AnonymousClass9EQ.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "switcher_accounts_data", new ArrayList());
        pandoGraphQLRequest.setMaxToleratedCacheAgeMs(0);
        AnonymousClass9EN r02 = r17;
        1vm.A01(userSession2).ATM(new AnonymousClass9ES(r02), new AnonymousClass9ER(r02), pandoGraphQLRequest, new 0nX(1793449280));
    }
}
