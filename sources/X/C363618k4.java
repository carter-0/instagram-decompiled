package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.8k4  reason: invalid class name and case insensitive filesystem */
public abstract class C363618k4 {
    public static final void A00(2IV r13, UserSession userSession, AnonymousClass8k3 r15) {
        1vn A01 = 1vm.A01(userSession);
        2IS r3 = new 2IS();
        2IS r1 = new 2IS();
        r3.A00(r13, "configs_request");
        AnonymousClass2IY r0 = PandoGraphQLRequest.Companion;
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AnonymousClass1vS.A00(), "CrosspostingUnifiedConfigsQuery", r3.getParamsCopy(), r1.getParamsCopy(), C363628k5.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "xcxp_unified_crossposting_configs_root", new ArrayList());
        A01.ATL(new C363648k7(r15), new C363638k6(r15), pandoGraphQLRequest);
    }
}
