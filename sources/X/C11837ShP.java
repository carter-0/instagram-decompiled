package X;

import com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro;
import java.util.List;
import java.util.Map;

/* renamed from: X.ShP  reason: case insensitive filesystem */
public final class C11837ShP implements C13527Tbw {
    public final /* synthetic */ C10358Rqv A00;
    public final /* synthetic */ C13851TiU A01;
    public final /* synthetic */ C13560TcZ A02;
    public final /* synthetic */ InAppPurchaseControllerCoro A03;
    public final /* synthetic */ Map A04;

    public C11837ShP(C10358Rqv rqv, C13851TiU tiU, C13560TcZ tcZ, InAppPurchaseControllerCoro inAppPurchaseControllerCoro, Map map) {
        this.A00 = rqv;
        this.A01 = tiU;
        this.A03 = inAppPurchaseControllerCoro;
        this.A04 = map;
        this.A02 = tcZ;
    }

    public final void DlO(C11230SGo sGo, List list) {
        C10358Rqv rqv;
        List list2 = list;
        0qQ.A0B(sGo, 0);
        if (sGo.A00 != 0 || (rqv = this.A00) == null) {
            InAppPurchaseControllerCoro inAppPurchaseControllerCoro = this.A03;
            if (list == null) {
                list2 = 0sn.A00;
            }
            InAppPurchaseControllerCoro.A07(sGo, this.A02, inAppPurchaseControllerCoro, list2, this.A04);
            return;
        }
        this.A01.E5s(rqv, new C11838ShQ(0, this.A04, this.A02, list2, this.A03), false);
    }
}
