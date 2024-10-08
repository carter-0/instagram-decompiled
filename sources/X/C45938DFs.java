package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;

/* renamed from: X.DFs  reason: case insensitive filesystem */
public final class C45938DFs implements AnonymousClass39G {
    public 2IS A00 = C41845B3m.A04();
    public boolean A01 = false;
    public 2IS A02 = C41845B3m.A04();

    /* renamed from: A00 */
    public final PandoGraphQLRequest build() {
        return new PandoGraphQLRequest(C41845B3m.A06(this.A01), "FBPayAddPhoneMutation", this.A00.getParamsCopy(), this.A02.getParamsCopy(), BTT.class, true, (PandoRealtimeInfoJNI) null, 68, "data", (String) null, AnonymousClass7TE.A1C());
    }
}
