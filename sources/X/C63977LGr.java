package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.common.session.UserSession;

/* renamed from: X.LGr  reason: case insensitive filesystem */
public abstract class C63977LGr {
    public static final void A00(UserSession userSession, C262224Cq r4) {
        0qQ.A0B(userSession, 1);
        AnonymousClass7TF.A1O(C63563KzC.A01, true);
        AnonymousClass7TF.A1O(C63563KzC.A00, false);
        AnonymousClass7TE.A1Z(new C59712JUv(userSession, (AnonymousClass4D7) null, 39), r4);
    }

    public static final void A01(UserSession userSession, C262224Cq r16) {
        0qQ.A0B(userSession, 1);
        AnonymousClass7TF.A1O(C63563KzC.A01, true);
        AnonymousClass7TF.A1O(C63563KzC.A00, false);
        MHD.A00(1vm.A01(userSession), new PandoGraphQLRequest(C41845B3m.A05(), "KirbyTopicsAndTemplatesQuery", C41845B3m.A04().getParamsCopy(), C41845B3m.A04().getParamsCopy(), C43338Bwc.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "viewer", AnonymousClass7TE.A1C()).setFreshCacheAgeMs(182.A01(0Tu.A05, userSession, 36605550999508233L)), r16, 11);
    }
}
