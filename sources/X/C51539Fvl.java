package X;

import com.android.billingclient.api.SkuDetails;
import java.util.Map;

/* renamed from: X.Fvl  reason: case insensitive filesystem */
public final class C51539Fvl implements Runnable {
    public final /* synthetic */ C11230SGo A00;
    public final /* synthetic */ C307896Rx A01;
    public final /* synthetic */ C277014uI A02;
    public final /* synthetic */ C277014uI A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ Map A05;

    public C51539Fvl(C11230SGo sGo, C307896Rx r2, C277014uI r3, C277014uI r4, String str, Map map) {
        this.A00 = sGo;
        this.A03 = r3;
        this.A05 = map;
        this.A04 = str;
        this.A01 = r2;
        this.A02 = r4;
    }

    public final void run() {
        C277014uI r3;
        AnonymousClass6Tm r1;
        String str;
        SkuDetails skuDetails;
        if (this.A00.A00 == 0) {
            r3 = this.A03;
            C308276Tl A0P = DbS.A0P();
            Map map = this.A05;
            if (map == null || (skuDetails = (SkuDetails) map.get(this.A04)) == null) {
                str = null;
            } else {
                str = skuDetails.A00.optString("price");
            }
            A0P.A01(str);
            r1 = A0P.A00();
        } else {
            r3 = this.A02;
            r1 = AnonymousClass6Tm.A01;
        }
        C299275ur.A00(this.A01, r1, r3);
    }
}
