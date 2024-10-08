package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;

/* renamed from: X.SnJ  reason: case insensitive filesystem */
public final class C12120SnJ implements AnonymousClass39G {
    public 2IS A00 = C41845B3m.A04();
    public boolean A01 = false;
    public 2IS A02 = C41845B3m.A04();

    /* renamed from: A00 */
    public final PandoGraphQLRequest build() {
        return new PandoGraphQLRequest(C41845B3m.A06(this.A01), "SubmitPayContainerMutation", this.A00.getParamsCopy(), this.A02.getParamsCopy(), QVV.class, true, (PandoRealtimeInfoJNI) null, 12, "input", "submit_payment_container", AnonymousClass7TE.A1C());
    }
}
