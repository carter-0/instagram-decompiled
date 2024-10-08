package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import java.util.ArrayList;

/* renamed from: X.4sJ  reason: invalid class name and case insensitive filesystem */
public final class C275994sJ implements AnonymousClass39G {
    public 2IS A00 = new 2IS();
    public boolean A01 = false;
    public boolean A02 = false;
    public 2IS A03 = new 2IS();

    /* renamed from: A00 */
    public final PandoGraphQLRequest build() {
        17k.A0E(this.A01);
        17k.A0E(this.A02);
        AnonymousClass2IY r0 = PandoGraphQLRequest.Companion;
        return new PandoGraphQLRequest(AnonymousClass1vS.A00(), "InitiatePushabilityHealthcheck", this.A00.getParamsCopy(), this.A03.getParamsCopy(), C276004sK.class, true, (PandoRealtimeInfoJNI) null, 0, (String) null, "xfb_init_push_healthcheck", new ArrayList());
    }
}
