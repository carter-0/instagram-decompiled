package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.business.onelink.cache.BusinessAccountCacheInfo;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

public final class WO1 implements AnonymousClass9F7 {
    public VRZ A00;
    public final C10483Rsy A01;
    public final AnonymousClass9F5 A02;
    public final 1Ng A03;
    public final UserSession A04;

    public WO1(AnonymousClass9F5 r2, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A04 = userSession;
        this.A02 = r2;
        this.A01 = new C10483Rsy(userSession);
        this.A03 = AnonymousClass1Nd.A00(userSession);
    }

    public final void AHV(AnonymousClass9JK r5) {
        0qQ.A0B(r5, 0);
        if (AnonymousClass9FF.A00.A00(this.A04, r5.A02)) {
            this.A00 = null;
            C10483Rsy rsy = this.A01;
            0xW.A09(rsy.A00, new C58728Iwb(rsy, 39));
            this.A03.A00(WQR.A00);
        }
    }

    public final void AUs(AnonymousClass9JK r25, AnonymousClass9F2 r26, AnonymousClass9FE r27) {
        AnonymousClass9JK r3 = r25;
        AnonymousClass9F2 r2 = r26;
        boolean A1U = AnonymousClass7TF.A1U(0, r3, r2);
        AnonymousClass9FF r5 = AnonymousClass9FF.A00;
        UserSession userSession = this.A04;
        AnonymousClass9FE r1 = r27;
        if (!r5.A00(userSession, r3.A02)) {
            r1.onError(C20569Wum.A00);
            return;
        }
        0Df A0I = C13990Tnq.A0I(GraphQlCallInput.A02, C13990Tnq.A0J(r3), r2, r2);
        2IS r7 = new 2IS();
        1vm.A01(userSession).A06(new PandoGraphQLRequest(C41847B3o.A04(A0I, r7, "input"), "IGOneLinkMiddlewareBusinessAccountQuery", r7.getParamsCopy(), new 2IS().getParamsCopy(), UPe.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "xfb_one_link_monoschema", new ArrayList()), new C15599UfR(A1U ? 1 : 0, r3, this, r2, r1));
    }

    public final /* bridge */ /* synthetic */ Object Au3(AnonymousClass9JK r5) {
        BusinessAccountCacheInfo businessAccountCacheInfo;
        C375999Gd r1;
        0qQ.A0B(r5, 0);
        if (!AnonymousClass9FF.A00.A00(this.A04, r5.A02)) {
            return null;
        }
        C10483Rsy rsy = this.A01;
        String string = rsy.A00.getString(AnonymousClass000.A00(1148), (String) null);
        if (string == null || (businessAccountCacheInfo = (BusinessAccountCacheInfo) rsy.A01.A00(string, C20506Wsm.A00)) == null) {
            return null;
        }
        String str = businessAccountCacheInfo.A01;
        String str2 = businessAccountCacheInfo.A00;
        if (str2 != null) {
            r1 = new C375999Gd(str2);
        } else {
            r1 = null;
        }
        return new VRZ(r1, str);
    }
}
