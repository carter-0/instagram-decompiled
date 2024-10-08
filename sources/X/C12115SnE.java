package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;

/* renamed from: X.SnE  reason: case insensitive filesystem */
public final class C12115SnE implements AnonymousClass39G {
    public 2IS A00 = C41845B3m.A04();
    public boolean A01 = false;
    public 2IS A02 = C41845B3m.A04();

    /* renamed from: A00 */
    public final PandoGraphQLRequest build() {
        return new PandoGraphQLRequest(C41845B3m.A06(this.A01), "FbpayConvertPaypalBaToCib", this.A00.getParamsCopy(), this.A02.getParamsCopy(), BVN.class, true, (PandoRealtimeInfoJNI) null, 12, "input", "fbpay_convert_paypal_ba_to_cib", AnonymousClass7TE.A1C());
    }
}
