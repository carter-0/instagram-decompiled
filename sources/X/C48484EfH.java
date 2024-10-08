package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: X.EfH  reason: case insensitive filesystem */
public abstract class C48484EfH {
    public static final Object A00(C307896Rx r17, AnonymousClass6Tm r18) {
        String str;
        AnonymousClass6Tm r0 = r18;
        Object A0g = DbW.A0g(r0, 0);
        Object A03 = r0.A03(1);
        0qQ.A0C(A03, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.Any, kotlin.Any>");
        Map map = (Map) A03;
        C307896Rx r4 = r17;
        C307786Rm r3 = r4.A03;
        if (r3 != null) {
            UserSession A0V = DbU.A0V(r4);
            HashMap A00 = C48297EcG.A00(map);
            if (A00 != null) {
                JSONObject A11 = DbS.A11();
                Iterator A0s = AnonymousClass7TF.A0s(A00);
                while (A0s.hasNext()) {
                    Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
                    String A13 = DbT.A13(A1J);
                    Object value = A1J.getValue();
                    if (value == null) {
                        value = JSONObject.NULL;
                    }
                    A11.put(A13, value);
                }
                str = DbT.A10(A11);
            } else {
                str = null;
            }
            AnonymousClass0K0 r9 = GraphQlCallInput.A02;
            0Df A032 = C41845B3m.A03(r9, A0g, "app_id");
            0Df.A00(A032, AnonymousClass000.A00(2070), AnonymousClass000.A00(4535));
            A032.A0E(C41845B3m.A03(r9, 0qv.A02.A05(r3.A00), Dbp.A02(0, 9, 37)), "infra_params");
            0Df.A00(A032, str, "params");
            2IS A04 = C41845B3m.A04();
            2IS A042 = C41845B3m.A04();
            DbW.A18(A032, A04, "params");
            A04.A00(C360628et.A00(), "bk_context");
            PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(C41845B3m.A05(), "BloksMetaAIFetchResponseStreamQuery", A04.getParamsCopy(), A042.getParamsCopy(), C42911Bmf.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "meta_ai_bloks_actions", AnonymousClass7TE.A1C());
            pandoGraphQLRequest.setEnsureCacheWrite(false);
            pandoGraphQLRequest.setMaxToleratedCacheAgeMs(0);
            pandoGraphQLRequest.setRequestPurpose(2);
            E88 e88 = new E88(pandoGraphQLRequest, new C360658ew(C307546Qn.A01), r4, 1vm.A01(A0V));
            E84.A00(e88, r4, 1);
            1ES.A06(e88, -6, true);
            C40248AXm aXm = new C40248AXm(e88);
            Set set = (Set) r3.A00(R.id.bk_context_key_cleanup_callbacks);
            if (set.contains(aXm)) {
                1Kn.A02("IBloksContextCleanupCallback", "Attempting to add a cleanup callback that already exists.");
                return null;
            }
            set.add(aXm);
        }
        return null;
    }
}
