package X;

import com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro;
import java.util.List;
import java.util.Map;

/* renamed from: X.ShI  reason: case insensitive filesystem */
public final class C11831ShI implements C13523Tbs {
    public final /* synthetic */ C10161Rnc A00;
    public final /* synthetic */ C13851TiU A01;
    public final /* synthetic */ C13560TcZ A02;
    public final /* synthetic */ InAppPurchaseControllerCoro A03;
    public final /* synthetic */ Map A04;

    public C11831ShI(C10161Rnc rnc, C13851TiU tiU, C13560TcZ tcZ, InAppPurchaseControllerCoro inAppPurchaseControllerCoro, Map map) {
        this.A00 = rnc;
        this.A01 = tiU;
        this.A03 = inAppPurchaseControllerCoro;
        this.A04 = map;
        this.A02 = tcZ;
    }

    public final void DZr(C11230SGo sGo, List list) {
        C10161Rnc rnc;
        AnonymousClass7TG.A1N(sGo, list);
        if (sGo.A00 != 0 || (rnc = this.A00) == null) {
            InAppPurchaseControllerCoro.A06(sGo, this.A02, this.A03, list, this.A04);
            return;
        }
        this.A01.E5p(new C11830ShH(this.A02, this.A03, list, this.A04), rnc, false);
    }
}
