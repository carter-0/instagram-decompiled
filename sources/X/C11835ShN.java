package X;

import com.android.billingclient.api.SkuDetails;
import com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.ShN  reason: case insensitive filesystem */
public final class C11835ShN implements C13527Tbw {
    public final /* synthetic */ InAppPurchaseControllerCoro A00;
    public final /* synthetic */ C13562Tcb A01;
    public final /* synthetic */ List A02;

    public C11835ShN(InAppPurchaseControllerCoro inAppPurchaseControllerCoro, C13562Tcb tcb, List list) {
        this.A00 = inAppPurchaseControllerCoro;
        this.A02 = list;
        this.A01 = tcb;
    }

    public final void DlO(C11230SGo sGo, 0sn r5) {
        0qQ.A0B(sGo, 0);
        if (r5 != null) {
            InAppPurchaseControllerCoro inAppPurchaseControllerCoro = this.A00;
            Iterator it = r5.iterator();
            while (it.hasNext()) {
                SkuDetails skuDetails = (SkuDetails) it.next();
                0qQ.A0A(skuDetails);
                InAppPurchaseControllerCoro.A09(skuDetails, inAppPurchaseControllerCoro);
            }
        }
        0sn r0 = this.A02;
        if (r0 == null) {
            r0 = 0sn.A00;
        }
        if (r5 == null) {
            r5 = 0sn.A00;
        }
        InAppPurchaseControllerCoro.A08(sGo, this.A01, 00k.A0S(r5, r0));
    }
}
