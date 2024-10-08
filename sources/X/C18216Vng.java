package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.Vng  reason: case insensitive filesystem */
public abstract class C18216Vng {
    public static PandoGraphQLRequest A00(String str) {
        0Df A03 = C41845B3m.A03(GraphQlCallInput.A02, str, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        2IS A0D = JTQ.A0D(A03, "PAGE", "input_id_type");
        return new PandoGraphQLRequest(C41847B3o.A04(A03, A0D, "input"), "IGLocationBusinessUserInfoQuery", A0D.getParamsCopy(), new 2IS().getParamsCopy(), C15124UQn.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "xfb_one_link_logged_out_page_info_monoschema", new ArrayList());
    }

    public static 1OC A01(UserSession userSession, C20956X6j x6j, String str) {
        1NY A0O = DbU.A0O(userSession);
        A0O.A0K("locations/%s/location_info/", new Object[]{str});
        1OC A0S = DbT.A0S(A0O, C15260UXv.class, C18218Vni.class);
        if (x6j != null) {
            C15621Ufn.A00(A0S, x6j, 35);
        }
        return A0S;
    }
}
