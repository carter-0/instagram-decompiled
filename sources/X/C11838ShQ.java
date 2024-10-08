package X;

import com.android.billingclient.api.SkuDetails;
import com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.ShQ  reason: case insensitive filesystem */
public final class C11838ShQ implements C13527Tbw {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C11838ShQ(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A03 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A04 = obj4;
    }

    public final void DlO(C11230SGo sGo, 0sn r8) {
        if (this.A00 != 0) {
            0qQ.A0B(sGo, 0);
            if (sGo.A00 == 0) {
                if (r8 != null) {
                    InAppPurchaseControllerCoro inAppPurchaseControllerCoro = (InAppPurchaseControllerCoro) this.A02;
                    Iterator it = r8.iterator();
                    while (it.hasNext()) {
                        SkuDetails skuDetails = (SkuDetails) it.next();
                        0qQ.A0A(skuDetails);
                        InAppPurchaseControllerCoro.A09(skuDetails, inAppPurchaseControllerCoro);
                    }
                }
                C10358Rqv rqv = (C10358Rqv) this.A03;
                if (rqv != null) {
                    ((C13851TiU) this.A01).E5s(rqv, new C11835ShN((InAppPurchaseControllerCoro) this.A02, (C13562Tcb) this.A04, r8), false);
                    return;
                }
            }
            InAppPurchaseControllerCoro.A08(sGo, (C13562Tcb) this.A04, r8);
            return;
        }
        0qQ.A0B(sGo, 0);
        InAppPurchaseControllerCoro inAppPurchaseControllerCoro2 = (InAppPurchaseControllerCoro) this.A04;
        0sn r0 = (Collection) this.A02;
        if (r0 == null) {
            r0 = 0sn.A00;
        }
        if (r8 == null) {
            r8 = 0sn.A00;
        }
        InAppPurchaseControllerCoro.A07(sGo, (C13560TcZ) this.A01, inAppPurchaseControllerCoro2, 00k.A0S(r8, r0), (Map) this.A03);
    }
}
