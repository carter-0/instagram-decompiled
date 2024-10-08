package X;

import com.facebook.common.callercontext.CallerContextable;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.8k9  reason: invalid class name and case insensitive filesystem */
public final class C363668k9 implements CallerContextable {
    public static final String __redex_internal_original_name = "XpostLinkageTypeFetcher";
    public final UserSession A00;

    public C363668k9(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final void A00(String str) {
        UserSession userSession = this.A00;
        16V A01 = AnonymousClass0eD.A01(userSession);
        if (A01 == 16V.A06 || (A01 == 16V.A05 && 182.A06(0Tu.A05, userSession, 36326799029843939L))) {
            String str2 = str;
            C378219Oy.A00(userSession, false, AnonymousClass05K.A0J, str2, (String) null, (Map) null);
            AnonymousClass9PW r3 = new AnonymousClass9PW(this, str2);
            1vn A012 = 1vm.A01(userSession);
            2IS r2 = new 2IS();
            2IS r1 = new 2IS();
            AnonymousClass2IY r0 = PandoGraphQLRequest.Companion;
            1Ef maxToleratedCacheAgeMs = new PandoGraphQLRequest(AnonymousClass1vS.A00(), "IgCreatorDestinationTypeQuery", r2.getParamsCopy(), r1.getParamsCopy(), AnonymousClass9P0.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "xcxp_ig_crossposting_linkage", new ArrayList()).setFreshCacheAgeMs(0).setMaxToleratedCacheAgeMs(0);
            A012.ATL(new AnonymousClass9PX(r3), new C378229Oz(r3), maxToleratedCacheAgeMs);
        }
    }
}
