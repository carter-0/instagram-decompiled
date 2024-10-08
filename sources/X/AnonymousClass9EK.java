package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.9EK  reason: invalid class name */
public final class AnonymousClass9EK extends 2Cl {
    public final /* synthetic */ UserSession A00;

    public final /* bridge */ /* synthetic */ Object call() {
        2IS r2 = new 2IS();
        2IS r1 = new 2IS();
        AnonymousClass2IY r0 = PandoGraphQLRequest.Companion;
        1Ef maxToleratedCacheAgeMs = new PandoGraphQLRequest(AnonymousClass1vS.A00(), "IGFxLinkedAccountsQuery", r2.getParamsCopy(), r1.getParamsCopy(), AnonymousClass9EM.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "fx_linked_accounts", new ArrayList()).setMaxToleratedCacheAgeMs(0);
        UserSession userSession = this.A00;
        1vm.A01(userSession).A06(maxToleratedCacheAgeMs, new AnonymousClass9EO(userSession));
        return null;
    }

    public final int getRunnableId() {
        return 713;
    }

    public AnonymousClass9EK(UserSession userSession) {
        this.A00 = userSession;
    }
}
