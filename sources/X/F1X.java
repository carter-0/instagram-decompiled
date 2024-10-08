package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.common.session.UserSession;
import com.instagram.reels.api.ReelsTrayQueryResponseImpl;

public final class F1X {
    public final AnonymousClass4Z6 A00(UserSession userSession, Integer num, Integer num2) {
        Integer num3 = num;
        Integer num4 = num2;
        AnonymousClass7TG.A1O(num3, num4);
        String A0j = AnonymousClass7TG.A0j();
        String A0j2 = AnonymousClass7TG.A0j();
        1vn A01 = 1vm.A01(userSession);
        2IS A04 = C41845B3m.A04();
        2IS A042 = C41845B3m.A04();
        A04.A04("reason", 1NZ.A00(num4));
        A04.A03(AnonymousClass000.A00(344), 25);
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(C41845B3m.A05(), "ReelsTrayQuery", A04.getParamsCopy(), A042.getParamsCopy(), ReelsTrayQueryResponseImpl.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "xdt_api__v1__feed__reels_tray", AnonymousClass7TE.A1C());
        0qQ.A0C(pandoGraphQLRequest, C273654mx.A00(848));
        return new AnonymousClass4Z6(new FZ9(pandoGraphQLRequest, (2IR) null, A01, new 0nX(146195775)), num3, num4, AnonymousClass05K.A00, A0j, A0j2);
    }
}
