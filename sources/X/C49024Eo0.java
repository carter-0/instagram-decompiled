package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Eo0  reason: case insensitive filesystem */
public abstract class C49024Eo0 {
    public static final void A00(UserSession userSession, G7G g7g, String str, String str2, String str3, List list) {
        0qQ.A0B(userSession, 0);
        1vn A01 = 1vm.A01(userSession);
        2IS A04 = C41845B3m.A04();
        2IS A042 = C41845B3m.A04();
        2IV r1 = new 2IV();
        r1.A09(str2, Dbj.A01());
        r1.A09(str3, "guid");
        r1.A09(str, "contact_point");
        r1.A05("google_tokens", list);
        A04.A00(r1, "data");
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(C41845B3m.A05(), "NUXUpdateContactPointMutation", A04.getParamsCopy(), A042.getParamsCopy(), C8L.class, true, (PandoRealtimeInfoJNI) null, 0, (String) null, "xdt_async_send_confirmation_code", AnonymousClass7TE.A1C());
        G7G g7g2 = g7g;
        FS6.A00(new FSC(g7g2, 13), pandoGraphQLRequest, A01, g7g2, 10);
    }
}
