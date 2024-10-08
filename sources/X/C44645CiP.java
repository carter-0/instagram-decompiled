package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.common.session.UserSession;
import com.instagram.crossposting.feed.graphql.FBToIGFeedDefaultPrivacyOptInMutationResponseImpl;

/* renamed from: X.CiP  reason: case insensitive filesystem */
public abstract class C44645CiP {
    public static final void A00(UserSession userSession, C46204DQh dQh) {
        1vn A01 = 1vm.A01(userSession);
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(C41845B3m.A05(), "FBToIGFeedDefaultPrivacyOptInMutation", C41845B3m.A04().getParamsCopy(), C41845B3m.A04().getParamsCopy(), FBToIGFeedDefaultPrivacyOptInMutationResponseImpl.class, true, (PandoRealtimeInfoJNI) null, 0, (String) null, "xcxp_set_ig_user_opt_in_default_audience_true", AnonymousClass7TE.A1C());
        C46204DQh dQh2 = dQh;
        A01.ATL(new C45917DEx(dQh2, 3), new C45926DFg(dQh2, 8), pandoGraphQLRequest);
    }
}
