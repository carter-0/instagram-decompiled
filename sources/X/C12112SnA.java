package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;

/* renamed from: X.SnA  reason: case insensitive filesystem */
public final class C12112SnA implements AnonymousClass39G {
    public 2IS A00 = C41845B3m.A04();
    public boolean A01 = false;
    public 2IS A02 = C41845B3m.A04();

    /* renamed from: A00 */
    public final PandoGraphQLRequest build() {
        return new PandoGraphQLRequest(C41845B3m.A06(this.A01), "FBPayECPHandleCheckoutEventMutation", this.A00.getParamsCopy(), this.A02.getParamsCopy(), C7682QSx.class, true, (PandoRealtimeInfoJNI) null, 96, (String) null, "handle_checkout_event", AnonymousClass7TE.A1C());
    }
}
