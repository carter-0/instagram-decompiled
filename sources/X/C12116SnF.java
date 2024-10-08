package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;

/* renamed from: X.SnF  reason: case insensitive filesystem */
public final class C12116SnF implements AnonymousClass39G {
    public 2IS A00 = C41845B3m.A04();
    public boolean A01 = false;
    public 2IS A02 = C41845B3m.A04();

    /* renamed from: A00 */
    public final PandoGraphQLRequest build() {
        return new PandoGraphQLRequest(C41845B3m.A06(this.A01), "InitLinkPaypal", this.A00.getParamsCopy(), this.A02.getParamsCopy(), BWO.class, true, (PandoRealtimeInfoJNI) null, 40, "input", "init_link_paypal", AnonymousClass7TE.A1C());
    }
}
