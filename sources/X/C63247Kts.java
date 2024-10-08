package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.common.session.UserSession;

/* renamed from: X.Kts  reason: case insensitive filesystem */
public abstract class C63247Kts {
    public static final Object A00(UserSession userSession, String str, AnonymousClass4D7 r18) {
        1IW A0q = C51973G9u.A0q(r18);
        2IS A04 = C41845B3m.A04();
        1vm.A01(userSession).A06(new PandoGraphQLRequest(C41845B3m.A06(C41848B3p.A1Z(A04, "query_string", str)), "IGDirectSearchMetaAIQueryStatePromptsQuery", A04.getParamsCopy(), C41845B3m.A04().getParamsCopy(), C42982Boy.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "xfb_igd_search_meta_ai_typeahead_suggestions", AnonymousClass7TE.A1C()), new C47697EDg(A0q, 47));
        return A0q.A0E();
    }
}
