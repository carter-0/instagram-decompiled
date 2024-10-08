package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.KWf  reason: case insensitive filesystem */
public final class C62029KWf extends C252733pa {
    public final 1vn A00;
    public final UserSession A01;

    public final void A00(ImageUrl imageUrl, String str, String str2) {
        String str3 = str;
        String str4 = str2;
        boolean A1U = AnonymousClass7TF.A1U(0, str3, str4);
        0Df A03 = C41845B3m.A03(GraphQlCallInput.A02, str3, "media_id");
        2IS A0D = JTQ.A0D(A03, str4, "caption");
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(C41847B3o.A04(A03, A0D, "input"), "SpotlightCreatePostMutation", A0D.getParamsCopy(), C41845B3m.A04().getParamsCopy(), C55.class, A1U, (PandoRealtimeInfoJNI) null, 0, (String) null, "xdt_create_spotlight_post", AnonymousClass7TE.A1C());
        AnonymousClass7TE.A1Z(new JVS(imageUrl, pandoGraphQLRequest, this, str3, str4, (AnonymousClass4D7) null, 12), this.A01);
    }

    public C62029KWf(UserSession userSession) {
        super("SpotlightAddContentRepository", AnonymousClass43D.A00(715519324));
        this.A01 = userSession;
        this.A00 = 1vm.A01(userSession);
    }
}
