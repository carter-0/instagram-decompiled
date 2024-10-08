package X;

import com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro;
import java.util.Map;

public final class S1E {
    public final /* synthetic */ InAppPurchaseControllerCoro A00;
    public final /* synthetic */ Map A01;

    public S1E(InAppPurchaseControllerCoro inAppPurchaseControllerCoro, Map map) {
        this.A00 = inAppPurchaseControllerCoro;
        this.A01 = map;
    }

    public final void A00(C61073JwB jwB) {
        InAppPurchaseControllerCoro inAppPurchaseControllerCoro = this.A00;
        C13713Tfb tfb = inAppPurchaseControllerCoro.A01;
        if (tfb != null) {
            tfb.Db2(jwB);
        }
        inAppPurchaseControllerCoro.A06.A00.Cgp((Map) this.A01.get(jwB.A01), (Map) null, "client_execute_dcpiap_success");
    }
}
