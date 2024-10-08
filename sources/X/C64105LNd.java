package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.LNd  reason: case insensitive filesystem */
public final class C64105LNd {
    public static final C64105LNd A00 = new Object();

    public final void A00(UserSession userSession, MUB mub, List list) {
        List list2 = list;
        0qQ.A0B(list2, 1);
        1vn A01 = 1vm.A01(userSession);
        ArrayList A0r = AnonymousClass7TG.A0r(list2);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            C39876ACx.A00(A0r, it);
        }
        2IV r4 = new 2IV();
        r4.A09("IG", "source_app");
        r4.A05(AnonymousClass000.A00(4675), A0r);
        0Df A02 = GraphQlCallInput.A02.A02();
        A02.A0E(r4.A02(), "config_request");
        2IS A04 = C41845B3m.A04();
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(C41847B3o.A04(A02, A04, "configs_request"), "UpdateAutoCrossPostingSettingMutation", A04.getParamsCopy(), C41845B3m.A04().getParamsCopy(), C383559fm.class, true, (PandoRealtimeInfoJNI) null, 12, "configs_request", "xcxp_unified_crossposting_configs_mutation_root", AnonymousClass7TE.A1C());
        MUB mub2 = mub;
        C64394LbB.A00(new C64397LbE(mub2, 16), pandoGraphQLRequest, A01, mub2, 18);
    }
}
