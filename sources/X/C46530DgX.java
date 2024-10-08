package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.common.session.UserSession;

/* renamed from: X.DgX  reason: case insensitive filesystem */
public final class C46530DgX {
    public boolean A00;
    public boolean A01;
    public final UserSession A02;

    public C46530DgX(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
    }

    public final void A00(0sP r18, boolean z) {
        boolean z2 = z;
        this.A00 = z2;
        0Df A03 = C41845B3m.A03(GraphQlCallInput.A02, Boolean.valueOf(z2), "opted_in");
        2IS A04 = C41845B3m.A04();
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(C41847B3o.A04(A03, A04, "request_data"), "IGCommentInsightsOptinStatusMutation", A04.getParamsCopy(), C41845B3m.A04().getParamsCopy(), C42682Bgf.class, true, (PandoRealtimeInfoJNI) null, 0, (String) null, "xdt_update_comment_summary_opt_in_by_user_id", AnonymousClass7TE.A1C());
        0sP r3 = r18;
        1vm.A01(this.A02).ATL(new FS6(0, r3), new FSC(r3, 2), pandoGraphQLRequest);
    }
}
