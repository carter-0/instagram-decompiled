package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.JXz  reason: case insensitive filesystem */
public final class C59780JXz {
    public static final C59780JXz A00 = new Object();

    public static final void A00(2IV r13, UserSession userSession, MUD mud) {
        1vn A01 = 1vm.A01(userSession);
        2IS A04 = C41845B3m.A04();
        C64394LbB.A00(new C64397LbE(mud, 17), JTS.A0G(new PandoGraphQLRequest(JTP.A0L(r13, A04, "configs_request"), "IgBplAutoXpostingQuery", A04.getParamsCopy(), C41845B3m.A04().getParamsCopy(), AnonymousClass9R1.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "xcxp_bpl_auto_crosspost_settings_root", AnonymousClass7TE.A1C())), A01, mud, 19);
    }

    public final void A01(UserSession userSession, MUC muc, List list) {
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
        r4.A05("crosspost_setting_list", A0r);
        0Df A02 = GraphQlCallInput.A02.A02();
        A02.A0E(r4.A02(), "config_request");
        2IS A04 = C41845B3m.A04();
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(C41847B3o.A04(A02, A04, "configs_request"), "IGBplAutoXPostMutation", A04.getParamsCopy(), C41845B3m.A04().getParamsCopy(), C383489ff.class, true, (PandoRealtimeInfoJNI) null, 12, "configs_request", "xcxp_bpl_auto_crosspost_settings_mutation_root", AnonymousClass7TE.A1C());
        MUC muc2 = muc;
        C64394LbB.A00(new C64397LbE(muc2, 18), pandoGraphQLRequest, A01, muc2, 20);
    }
}
