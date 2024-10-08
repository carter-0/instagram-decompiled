package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.WSz  reason: case insensitive filesystem */
public final class C19291WSz implements AnonymousClass0lh {
    public boolean A00;
    public final UserSession A01;

    public C19291WSz(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
    }

    public final void A00(VYN vyn) {
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(C41845B3m.A05(), "FXSSOInfoQuery", new 2IS().getParamsCopy(), new 2IS().getParamsCopy(), URF.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "xfb_fx_sso_info", new ArrayList());
        VYN vyn2 = vyn;
        1vm.A01(this.A01).ATL(new C19028WHf(vyn2, 7), new C19044WHw(1, this, vyn2, new Object()), pandoGraphQLRequest);
    }

    public final void onSessionWillEnd() {
        this.A01.A03(C19291WSz.class);
    }
}
