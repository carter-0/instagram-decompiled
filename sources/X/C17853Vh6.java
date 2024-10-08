package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.Vh6  reason: case insensitive filesystem */
public final class C17853Vh6 {
    public final VMH A00;
    public final UserSession A01;
    public final AnonymousClass0eM A02 = AnonymousClass0eN.A01(C20640WwY.A00);
    public final AnonymousClass0eM A03 = C20703Wxa.A01(this, 29);

    public C17853Vh6(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = new VMH(userSession);
    }

    public final void A00(N49 n49) {
        2IS r4 = new 2IS();
        N49 n492 = n49;
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(DbU.A0J(r4, "entrypoint", n492.A00), "IGProfessionalIdentityUpdateCacheMutation", r4.getParamsCopy(), new 2IS().getParamsCopy(), UPl.class, true, (PandoRealtimeInfoJNI) null, 0, (String) null, "update_ig_pro_identity_cache", new ArrayList());
        AnonymousClass7TE.A1Z(new C59819JZr(pandoGraphQLRequest, new C15619Ufl(1, n492, this), this, (AnonymousClass4D7) null, 15), (C262224Cq) this.A02.getValue());
    }
}
