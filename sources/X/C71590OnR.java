package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;

/* renamed from: X.OnR  reason: case insensitive filesystem */
public final class C71590OnR implements AnonymousClass39G {
    public 2IS A00 = C41845B3m.A04();
    public boolean A01 = false;
    public boolean A02 = false;
    public 2IS A03 = C41845B3m.A04();

    /* renamed from: A00 */
    public final PandoGraphQLRequest build() {
        17k.A0E(this.A02);
        return new PandoGraphQLRequest(C41845B3m.A06(this.A01), "AcknowledgePushToken", this.A00.getParamsCopy(), this.A03.getParamsCopy(), BSb.class, true, (PandoRealtimeInfoJNI) null, 0, (String) null, "xfb_ack_token", AnonymousClass7TE.A1C());
    }
}
