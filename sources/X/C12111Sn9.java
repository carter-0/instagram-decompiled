package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;

/* renamed from: X.Sn9  reason: case insensitive filesystem */
public final class C12111Sn9 implements AnonymousClass39G {
    public 2IS A00 = C41845B3m.A04();
    public boolean A01 = false;
    public 2IS A02 = C41845B3m.A04();

    /* renamed from: A00 */
    public final PandoGraphQLRequest build() {
        return new PandoGraphQLRequest(C41845B3m.A06(this.A01), "CreatePayContainerMutation", this.A00.getParamsCopy(), this.A02.getParamsCopy(), QXJ.class, true, (PandoRealtimeInfoJNI) null, 12, "input", "request_payment_container", AnonymousClass7TE.A1C());
    }
}
