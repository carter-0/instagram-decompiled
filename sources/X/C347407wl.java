package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.7wl  reason: invalid class name and case insensitive filesystem */
public final class C347407wl {
    public boolean A00;
    public final 05G A01;
    public final AnonymousClass0Ud A02;
    public final UserSession A03;

    public static final void A00(C347407wl r17) {
        2IS r2 = new 2IS();
        2IS r1 = new 2IS();
        AnonymousClass2IY r0 = PandoGraphQLRequest.Companion;
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AnonymousClass1vS.A00(), "LinkedBarcelonaProfileQuery", r2.getParamsCopy(), r1.getParamsCopy(), C347417wm.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "xcxp_fetch_linked_threads_profile", new ArrayList());
        pandoGraphQLRequest.setMaxToleratedCacheAgeMs(0);
        pandoGraphQLRequest.setFreshCacheAgeMs(0);
        C347407wl r12 = r17;
        1vm.A01(r12.A03).ATM(new C347447wp(r12), new C347437wo(r12), pandoGraphQLRequest, new 0nX(752149842));
    }

    public final void A01() {
        if (this.A01.getValue() == null) {
            A00(this);
        }
    }

    public C347407wl(UserSession userSession) {
        this.A03 = userSession;
        02z A012 = 106.A01((Object) null);
        this.A01 = A012;
        this.A02 = A012;
    }
}
