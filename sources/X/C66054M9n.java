package X;

import com.android.billingclient.api.SkuDetails;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.M9n  reason: case insensitive filesystem */
public final class C66054M9n implements Runnable {
    public final /* synthetic */ C11230SGo A00;
    public final /* synthetic */ C307896Rx A01;
    public final /* synthetic */ C277014uI A02;
    public final /* synthetic */ C277014uI A03;
    public final /* synthetic */ Map A04;

    public C66054M9n(C11230SGo sGo, C307896Rx r2, C277014uI r3, C277014uI r4, Map map) {
        this.A00 = sGo;
        this.A04 = map;
        this.A03 = r3;
        this.A01 = r2;
        this.A02 = r4;
    }

    public final void run() {
        C277014uI r3;
        AnonymousClass6Tm r1;
        Map map;
        String str;
        if (this.A00.A00 != 0 || (map = this.A04) == null) {
            r3 = this.A02;
            r1 = new AnonymousClass6Tm(AnonymousClass7TE.A1I("Failed to quote"));
        } else {
            r3 = this.A03;
            C308276Tl r5 = new C308276Tl();
            LinkedHashMap A0o = C51975G9x.A0o(map);
            Iterator A0u = AnonymousClass7TF.A0u(map);
            while (A0u.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                A0o.put(A1J.getKey(), ((SkuDetails) A1J.getValue()).A00.optString("price"));
            }
            r5.A01(A0o);
            SkuDetails skuDetails = (SkuDetails) 00k.A0A(map.values());
            if (skuDetails != null) {
                str = skuDetails.A00.optString("price_currency_code");
            } else {
                str = null;
            }
            r5.A02(str);
            r1 = r5.A00();
        }
        C299275ur.A00(this.A01, r1, r3);
    }
}
