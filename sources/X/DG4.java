package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;

public final class DG4 implements AnonymousClass39G {
    public 2IS A00 = C41845B3m.A04();
    public boolean A01 = false;
    public 2IS A02 = C41845B3m.A04();

    /* renamed from: A00 */
    public final PandoGraphQLRequest build() {
        return new PandoGraphQLRequest(C41845B3m.A06(this.A01), "FBPayUpdatePhoneMutation", this.A00.getParamsCopy(), this.A02.getParamsCopy(), BVD.class, true, (PandoRealtimeInfoJNI) null, 12, "data", (String) null, AnonymousClass7TE.A1C());
    }
}
