package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;

/* renamed from: X.SnL  reason: case insensitive filesystem */
public final class C12122SnL implements AnonymousClass39G {
    public 2IS A00 = C41845B3m.A04();
    public boolean A01 = false;
    public 2IS A02 = C41845B3m.A04();

    /* renamed from: A00 */
    public final PandoGraphQLRequest build() {
        return new PandoGraphQLRequest(C41845B3m.A06(this.A01), "UpdateOffsiteOrderMutation", this.A00.getParamsCopy(), this.A02.getParamsCopy(), C42273BXq.class, true, (PandoRealtimeInfoJNI) null, 12, "input", "update_offsite_order", AnonymousClass7TE.A1C());
    }
}
