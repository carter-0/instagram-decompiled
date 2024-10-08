package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;

/* renamed from: X.SnM  reason: case insensitive filesystem */
public final class C12123SnM implements AnonymousClass39G {
    public 2IS A00 = C41845B3m.A04();
    public boolean A01 = false;
    public boolean A02 = false;
    public 2IS A03 = C41845B3m.A04();

    /* renamed from: A00 */
    public final PandoGraphQLRequest build() {
        17k.A0E(this.A01);
        return new PandoGraphQLRequest(C41845B3m.A06(this.A02), "ComponentDataMutation", this.A00.getParamsCopy(), this.A03.getParamsCopy(), QXI.class, true, (PandoRealtimeInfoJNI) null, 96, (String) null, "fbpay_account_mutation", AnonymousClass7TE.A1C());
    }
}
