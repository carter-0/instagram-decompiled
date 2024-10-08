package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;

/* renamed from: X.FSg  reason: case insensitive filesystem */
public final class C50174FSg implements AnonymousClass39G {
    public 2IS A00 = C41845B3m.A04();
    public 2IS A01 = C41845B3m.A04();
    public boolean A02 = false;

    public final /* bridge */ /* synthetic */ 1Ef build() {
        return new PandoGraphQLRequest(C41845B3m.A06(this.A02), "ProfileUserInfoByUsername", this.A00.getParamsCopy(), this.A01.getParamsCopy(), C2E.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "xdt_api__v1__username__info", AnonymousClass7TE.A1C());
    }
}
