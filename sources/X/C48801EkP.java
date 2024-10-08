package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.common.session.UserSession;

/* renamed from: X.EkP  reason: case insensitive filesystem */
public abstract class C48801EkP {
    public static final void A00(UserSession userSession) {
        2IS A04 = C41845B3m.A04();
        1vm.A01(userSession).ATL((2Kw) null, new FSC(userSession, 5), new PandoGraphQLRequest(DbU.A0J(A04, "nux_type", AnonymousClass000.A00(2305)), "ConsentStatusWriteMutation", A04.getParamsCopy(), C41845B3m.A04().getParamsCopy(), C42692Bgp.class, true, (PandoRealtimeInfoJNI) null, 0, (String) null, "xfb_messenger_gen_ai_nux_write_consent", AnonymousClass7TE.A1C()));
    }
}
