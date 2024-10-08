package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.75o  reason: invalid class name and case insensitive filesystem */
public final class C3261475o {
    public 0sP A00;
    public final 1Ng A01;
    public final UserSession A02;
    public final C3261775r A03 = new C3261775r(this);
    public final C3261575p A04;
    public final AnonymousClass7IJ A05;

    public final void A00(C62799Kmb kmb) {
        AnonymousClass7IJ r1 = this.A05;
        if (!r1.A00()) {
            if (182.A06(0Tu.A05, r1.A00, 36318535512955105L)) {
                C3261575p r2 = this.A04;
                C74191PqX pqX = new C74191PqX(22, (Object) kmb, (Object) this);
                AnonymousClass9IB r0 = r2.A00;
                if (r0 != null) {
                    pqX.invoke(r0);
                    return;
                }
                C3261675q r4 = r2.A02;
                C74191PqX pqX2 = new C74191PqX(24, (Object) pqX, (Object) r2);
                2IS r22 = new 2IS();
                2IS r12 = new 2IS();
                AnonymousClass2IY r02 = PandoGraphQLRequest.Companion;
                PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AnonymousClass1vS.A00(), "IGSocialAvatarStickersDisclaimerInfoQuery", r22.getParamsCopy(), r12.getParamsCopy(), C15131UQu.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "xfb_social_avatar_stickers_disclaimer_info", new ArrayList());
                r4.A00.ATL(DF2.A00, new C19039WHr(pqX2), pandoGraphQLRequest);
            }
        }
    }

    public /* synthetic */ C3261475o(UserSession userSession) {
        AnonymousClass7IJ r3 = new AnonymousClass7IJ(userSession);
        0qQ.A0B(userSession, 0);
        C3261575p r2 = (C3261575p) userSession.A01(C3261575p.class, new MMO(userSession, 18));
        1Ng A002 = AnonymousClass1Nd.A00(userSession);
        0qQ.A0B(r2, 3);
        0qQ.A0B(A002, 4);
        this.A02 = userSession;
        this.A05 = r3;
        this.A04 = r2;
        this.A01 = A002;
    }
}
