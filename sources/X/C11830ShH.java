package X;

import com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro;
import java.util.List;
import java.util.Map;

/* renamed from: X.ShH  reason: case insensitive filesystem */
public final class C11830ShH implements C13523Tbs {
    public final /* synthetic */ C13560TcZ A00;
    public final /* synthetic */ InAppPurchaseControllerCoro A01;
    public final /* synthetic */ List A02;
    public final /* synthetic */ Map A03;

    public C11830ShH(C13560TcZ tcZ, InAppPurchaseControllerCoro inAppPurchaseControllerCoro, List list, Map map) {
        this.A01 = inAppPurchaseControllerCoro;
        this.A02 = list;
        this.A03 = map;
        this.A00 = tcZ;
    }

    public final void DZr(C11230SGo sGo, List list) {
        AnonymousClass7TG.A1N(sGo, list);
        InAppPurchaseControllerCoro inAppPurchaseControllerCoro = this.A01;
        List list2 = this.A02;
        0qQ.A0A(list2);
        InAppPurchaseControllerCoro.A06(sGo, this.A00, inAppPurchaseControllerCoro, 00k.A0S(list, list2), this.A03);
    }
}
