package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;

/* renamed from: X.OnP  reason: case insensitive filesystem */
public final class C71588OnP implements AnonymousClass39G {
    public 2IS A00 = C41845B3m.A04();
    public boolean A01 = false;
    public 2IS A02 = C41845B3m.A04();

    /* renamed from: A00 */
    public final PandoGraphQLRequest build() {
        return new PandoGraphQLRequest(C41845B3m.A06(this.A01), "VestaServerRegisterBeginMutation", this.A00.getParamsCopy(), this.A02.getParamsCopy(), QWA.class, true, (PandoRealtimeInfoJNI) null, 96, (String) null, "fbid_based_auth_layer_vesta_begin_register_v2", AnonymousClass7TE.A1C());
    }
}
