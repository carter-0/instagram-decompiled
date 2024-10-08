package X;

import com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Soc  reason: case insensitive filesystem */
public final class C12187Soc implements C13714Tfc {
    public final /* synthetic */ InAppPurchaseControllerCoro A00;
    public final /* synthetic */ List A01;
    public final /* synthetic */ Map A02;
    public final /* synthetic */ boolean A03;

    public C12187Soc(InAppPurchaseControllerCoro inAppPurchaseControllerCoro, List list, Map map, boolean z) {
        this.A00 = inAppPurchaseControllerCoro;
        this.A01 = list;
        this.A02 = map;
        this.A03 = z;
    }

    public final void DEk(Throwable th, List list) {
        InAppPurchaseControllerCoro inAppPurchaseControllerCoro = this.A00;
        inAppPurchaseControllerCoro.A06.A0A(this.A01, list);
        InAppPurchaseControllerCoro.A0E(inAppPurchaseControllerCoro, C8918RFl.NETWORK_FAILURE);
    }

    public final void Dot(QP6 qp6, List list, List list2) {
        if (list == null || list.isEmpty() || (list2 != null && !list2.isEmpty())) {
            InAppPurchaseControllerCoro inAppPurchaseControllerCoro = this.A00;
            inAppPurchaseControllerCoro.A06.A0A(this.A01, list2);
            InAppPurchaseControllerCoro.A0E(inAppPurchaseControllerCoro, C8918RFl.SERVER_VERIFICATION_FAILED);
            return;
        }
        InAppPurchaseControllerCoro inAppPurchaseControllerCoro2 = this.A00;
        SPQ spq = inAppPurchaseControllerCoro2.A06;
        List list3 = this.A01;
        Map map = this.A02;
        0qQ.A0B(map, 2);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C61073JwB jwB = (C61073JwB) it.next();
            0sm r0 = (Map) map.get(jwB.A03);
            if (r0 == null) {
                r0 = 0Yt.A0E();
            }
            LinkedHashMap A032 = 0Yt.A03(r0);
            A032.put("dcp_order_id", jwB.A01);
            spq.A00.Cgp(A032, (Map) null, "client_verify_dcppayment_success");
        }
        if (this.A03) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C61073JwB jwB2 = (C61073JwB) it2.next();
                C13713Tfb tfb = inAppPurchaseControllerCoro2.A01;
                if (tfb != null) {
                    tfb.Db2(jwB2);
                }
            }
            return;
        }
        inAppPurchaseControllerCoro2.A0H(new S1E(inAppPurchaseControllerCoro2, map), list3, list, map);
    }
}
