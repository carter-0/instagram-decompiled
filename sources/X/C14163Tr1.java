package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.Tr1  reason: case insensitive filesystem */
public final class C14163Tr1 {
    public final AnonymousClass9F5 A00;
    public final UserSession A01;

    public final void A00(AnonymousClass9JK r19, AnonymousClass9FE r20, String str) {
        AnonymousClass9JK r4 = r19;
        0qQ.A0B(r4, 0);
        AnonymousClass9FF r1 = AnonymousClass9FF.A00;
        UserSession userSession = this.A01;
        AnonymousClass9FE r3 = r20;
        if (!r1.A00(userSession, r4.A02)) {
            r3.onError(C20569Wum.A00);
            return;
        }
        2IV A0J = C13990Tnq.A0J(r4);
        0Df A02 = GraphQlCallInput.A02.A02();
        A02.A0E(A0J.A02(), "caller_context");
        0Df.A00(A02, str, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        2IS A0D = JTQ.A0D(A02, "IG_USER", "input_id_type");
        1vm.A01(userSession).A06(new PandoGraphQLRequest(C41847B3o.A04(A02, A0D, "input"), "IGOneLinkLoggedOutWAMiddlewareQuery", A0D.getParamsCopy(), new 2IS().getParamsCopy(), C14175TrD.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "xfb_one_link_logged_out_whatsapp_info_monoschema", new ArrayList()), new C15625Ufr(2, r3, r4, this));
    }

    public C14163Tr1(AnonymousClass9F5 r1, UserSession userSession) {
        this.A01 = userSession;
        this.A00 = r1;
    }
}
