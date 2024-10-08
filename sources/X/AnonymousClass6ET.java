package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.6ET  reason: invalid class name */
public final class AnonymousClass6ET extends 0ng {
    public final /* synthetic */ 2DU A00;

    public final void run() {
        2DU r1 = this.A00;
        UserSession userSession = r1.A09;
        if (2HM.A00(userSession).A03()) {
            r1.A03 = true;
            0qQ.A0B(userSession, 0);
            AnonymousClass61F r3 = (AnonymousClass61F) 1y0.A00(userSession).A01(AnonymousClass61F.class, new C73911Plm(userSession, 20));
            AnonymousClass61G r5 = new AnonymousClass61G(this);
            UserSession userSession2 = r3.A01;
            if (AnonymousClass61H.A00(userSession2)) {
                C70745OJr A002 = C70112NxS.A00(userSession2);
                C72595PCa pCa = new C72595PCa(r5, r3);
                2IS r6 = new 2IS();
                2IS r52 = new 2IS();
                AnonymousClass2IY r12 = PandoGraphQLRequest.Companion;
                PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AnonymousClass1vS.A00(), "IGDirectSecureConsentFrameworkSettingsLiveQuery", r6.getParamsCopy(), r52.getParamsCopy(), C7775QWm.class, false, PandoRealtimeInfoJNI.forLiveQuery("ig_messaging_secure_consent_framework_live_query"), 0, (String) null, "read_scf_settings", new ArrayList());
                1vm.A01(A002.A00).A01(new C71551Omm(pCa), new C71571On8(pCa, A002), pandoGraphQLRequest);
            } else {
                r3.A00.A02(AnonymousClass61I.A00(userSession2).A00(), new C3022562h(r5));
            }
            if (!AnonymousClass61H.A00(userSession2)) {
                r3.A00.A02(MYb.A00(MYc.A01(userSession2, "SecureUserConsentObserver").A01).A0N(new C3023362p(C3023162n.A00)).A0M(new C3023462q(new C377089Km(r3, 38))), C3023562r.A00);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6ET(2DU r2) {
        super(509922277);
        this.A00 = r2;
    }
}
