package X;

import android.app.Activity;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.SkuDetails;
import com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro;
import java.util.List;
import java.util.Map;

/* renamed from: X.ShO  reason: case insensitive filesystem */
public final class C11836ShO implements C13527Tbw {
    public final /* synthetic */ InAppPurchaseControllerCoro A00;
    public final /* synthetic */ Integer A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ Map A03;
    public final /* synthetic */ 0rm A04;

    public C11836ShO(InAppPurchaseControllerCoro inAppPurchaseControllerCoro, Integer num, String str, Map map, 0rm r5) {
        this.A00 = inAppPurchaseControllerCoro;
        this.A02 = str;
        this.A04 = r5;
        this.A01 = num;
        this.A03 = map;
    }

    public final void DlO(C11230SGo sGo, List list) {
        0qQ.A0B(sGo, 0);
        if (sGo.A00 != 0 || list == null || list.isEmpty()) {
            InAppPurchaseControllerCoro inAppPurchaseControllerCoro = this.A00;
            inAppPurchaseControllerCoro.A06.A05(sGo, this.A03);
            InAppPurchaseControllerCoro.A0E(inAppPurchaseControllerCoro, C8918RFl.USER_PAYMENT_FAILED);
            return;
        }
        InAppPurchaseControllerCoro inAppPurchaseControllerCoro2 = this.A00;
        Object A0I = 00k.A0I(list);
        0qQ.A07(A0I);
        InAppPurchaseControllerCoro.A09((SkuDetails) A0I, inAppPurchaseControllerCoro2);
        Activity A0K = Pxg.A0K(inAppPurchaseControllerCoro2.A03);
        String str = this.A02;
        Object A0I2 = 00k.A0I(list);
        0qQ.A07(A0I2);
        InAppPurchaseControllerCoro.A04(A0K, (Purchase) this.A04.A00, (SkuDetails) A0I2, inAppPurchaseControllerCoro2, this.A01, str);
    }
}
