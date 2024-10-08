package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;

/* renamed from: X.Smv  reason: case insensitive filesystem */
public final class C12100Smv implements AnonymousClass39G {
    public 2IS A00 = C41845B3m.A04();
    public 2IS A01 = C41845B3m.A04();
    public boolean A02 = false;

    public final /* bridge */ /* synthetic */ 1Ef build() {
        return new PandoGraphQLRequest(C41845B3m.A06(this.A02), "FBPayMerchantServicesPayoutsQuery", this.A00.getParamsCopy(), this.A01.getParamsCopy(), C42198BUt.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "pay_financial_entity_wrapper", AnonymousClass7TE.A1C());
    }
}
