package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.common.session.UserSession;

/* renamed from: X.HaV  reason: case insensitive filesystem */
public abstract class C54998HaV {
    public static final void A00(2Kw r17, AnonymousClass2Kv r18, UserSession userSession, boolean z) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 0);
        2IS A04 = C41845B3m.A04();
        2IS A042 = C41845B3m.A04();
        A04.A01("is_undo");
        A04.A02("is_undo", Boolean.valueOf(z));
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(C41845B3m.A05(), "NifuDismissalEventMutation", A04.getParamsCopy(), A042.getParamsCopy(), Bl7.class, true, (PandoRealtimeInfoJNI) null, 0, (String) null, "xdt_log_nifu_dismissal_event", AnonymousClass7TE.A1C());
        1vm.A01(userSession2).ATL(r17, r18, pandoGraphQLRequest);
    }
}
