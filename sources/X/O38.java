package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.facebook.proxygen.TraceFieldType;

public abstract class O38 {
    public static void A00(AnonymousClass2hV r14, 1vn r15, T7O t7o, String str) {
        Object obj;
        String str2 = str;
        if (str != null) {
            obj = t7o.A00.BEh(str2);
        } else {
            obj = null;
        }
        0Df A03 = C41845B3m.A03(GraphQlCallInput.A02, obj, "share_id");
        0Df.A00(A03, str2, "media_id");
        2IS A0D = JTQ.A0D(A03, "media", TraceFieldType.ContentType);
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(C41847B3o.A04(A03, A0D, "input"), "GenerateExternalShareUrlInfo", A0D.getParamsCopy(), C41845B3m.A04().getParamsCopy(), C62.class, true, (PandoRealtimeInfoJNI) null, 0, (String) null, "xdt__generate_share_url_info", AnonymousClass7TE.A1C());
        CH8 ch8 = new CH8(r14, 2);
        1OC A00 = AnonymousClass9D0.A00(r15.A03(pandoGraphQLRequest));
        A00.A00 = ch8;
        1ES.A03(A00);
    }
}
