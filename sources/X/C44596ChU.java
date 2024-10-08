package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.common.session.UserSession;

/* renamed from: X.ChU  reason: case insensitive filesystem */
public abstract class C44596ChU {
    /* JADX WARNING: type inference failed for: r4v0, types: [X.DGc, java.lang.Object] */
    public static final boolean A00(UserSession userSession) {
        if (userSession == null) {
            return true;
        }
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(C41845B3m.A05(), "IGFxFbProfilePicIsSilhouetteQuery", C41845B3m.A04().getParamsCopy(), C41845B3m.A04().getParamsCopy(), Bp9.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "fx_accounts", AnonymousClass7TE.A1C());
        ? obj = new Object();
        1vm.A01(userSession).ATL(new C45917DEx(obj, 1), new C45926DFg(obj, 1), pandoGraphQLRequest);
        return obj.A00;
    }
}
