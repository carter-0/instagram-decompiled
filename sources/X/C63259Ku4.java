package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ku4  reason: case insensitive filesystem */
public abstract class C63259Ku4 {
    public static final C60340gF A00(UserSession userSession, String str, 0sP r15) {
        1vn A01 = 1vm.A01(userSession);
        2IS A04 = C41845B3m.A04();
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(C41845B3m.A06(C41848B3p.A1Z(A04, "media_id", str)), "MetaAiContentDeepDiveQuery", A04.getParamsCopy(), C41845B3m.A04().getParamsCopy(), C42829Bjb.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "xdt_media__meta_ai_content_dive_response", AnonymousClass7TE.A1C());
        A01.ATL(C64391Lb8.A00, new C64397LbE(r15, 12), pandoGraphQLRequest);
        return C60340gF.A00;
    }
}
