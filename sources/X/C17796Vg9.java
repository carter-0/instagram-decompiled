package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.Vg9  reason: case insensitive filesystem */
public final class C17796Vg9 {
    public final UserSession A00;
    public final AnonymousClass0eM A01 = C20703Wxa.A01(this, 23);

    public final void A00(AnonymousClass9JK r19, AnonymousClass9F2 r20, AnonymousClass9FE r21) {
        AnonymousClass9F2 r2 = r20;
        0qQ.A0B(r2, 1);
        AnonymousClass9FF r1 = AnonymousClass9FF.A00;
        UserSession userSession = this.A00;
        AnonymousClass9JK r3 = r19;
        boolean A002 = r1.A00(userSession, r3.A02);
        AnonymousClass9FE r12 = r21;
        if (!A002) {
            r12.onError(C20569Wum.A00);
            return;
        }
        1vn A012 = 1vm.A01(userSession);
        C10484Rsz rsz = new C10484Rsz(userSession);
        C20703Wxa wxa = new C20703Wxa(this, 24);
        VZF vzf = new VZF(rsz, (AH0) this.A01.getValue(), A012, wxa, C20738WyB.A00);
        2IV A0J = C13990Tnq.A0J(r3);
        0Df A03 = C41845B3m.A03(GraphQlCallInput.A02, "1L1D", "key");
        A03.A0E(A0J.A02(), "caller_context");
        2IS r6 = new 2IS();
        vzf.A02.A06(new PandoGraphQLRequest(C41847B3o.A04(A03, r6, "input"), "IGOneLinkMiddlewarePageWithBPLPageInfoQuery", r6.getParamsCopy(), new 2IS().getParamsCopy(), UPg.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "xfb_one_link_monoschema", new ArrayList()), new C15599UfR(3, r3, vzf, r2, r12));
    }

    public C17796Vg9(UserSession userSession) {
        this.A00 = userSession;
    }
}
