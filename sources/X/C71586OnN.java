package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;

/* renamed from: X.OnN  reason: case insensitive filesystem */
public final class C71586OnN implements AnonymousClass39G {
    public 2IS A00 = C41845B3m.A04();
    public boolean A01 = false;
    public 2IS A02 = C41845B3m.A04();

    /* renamed from: A00 */
    public final PandoGraphQLRequest build() {
        return new PandoGraphQLRequest(C41845B3m.A06(this.A01), "VestaServerLoginBeginMutation", this.A00.getParamsCopy(), this.A02.getParamsCopy(), QW1.class, true, (PandoRealtimeInfoJNI) null, 96, (String) null, "fbid_based_auth_layer_vesta_begin_login_v2", AnonymousClass7TE.A1C());
    }
}
