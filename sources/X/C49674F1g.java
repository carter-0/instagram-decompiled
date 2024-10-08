package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.common.session.UserSession;
import com.instagram.creator.agent.sandbox.profilebutton.graphql.IGCreatorAgentSandboxThreadMutationResponseImpl;

/* renamed from: X.F1g  reason: case insensitive filesystem */
public final class C49674F1g {
    public final 1vn A00;

    public final void A00(DQZ dqz, String str) {
        2IS A04 = C41845B3m.A04();
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(DbU.A0J(A04, "user_igid", str), "IGCreatorAgentSandboxThreadMutation", A04.getParamsCopy(), C41845B3m.A04().getParamsCopy(), IGCreatorAgentSandboxThreadMutationResponseImpl.class, true, (PandoRealtimeInfoJNI) null, 0, (String) null, "xig_create_creator_agent_thread", AnonymousClass7TE.A1C());
        DQZ dqz2 = dqz;
        this.A00.ATL(new C45917DEx(dqz2, 2), new C45926DFg(dqz2, 5), pandoGraphQLRequest);
    }

    public C49674F1g(UserSession userSession) {
        this.A00 = 1vm.A01(userSession);
    }
}
