package X;

import com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro;
import java.util.LinkedHashMap;
import java.util.Map;

public final class S1D {
    public final /* synthetic */ InAppPurchaseControllerCoro A00;
    public final /* synthetic */ Map A01;

    public S1D(InAppPurchaseControllerCoro inAppPurchaseControllerCoro, Map map) {
        this.A00 = inAppPurchaseControllerCoro;
        this.A01 = map;
    }

    public final void A00() {
        InAppPurchaseControllerCoro inAppPurchaseControllerCoro = this.A00;
        SPQ spq = inAppPurchaseControllerCoro.A06;
        Map map = this.A01;
        0qQ.A0B(map, 0);
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        SKS.A01("Mock purchase failed", linkedHashMap);
        spq.A00.Cgp(linkedHashMap, (Map) null, "client_create_dcppayment_fail");
        InAppPurchaseControllerCoro.A0E(inAppPurchaseControllerCoro, C8918RFl.USER_PAYMENT_FAILED);
    }
}
