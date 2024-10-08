package X;

import android.os.SystemClock;
import com.android.billingclient.api.SkuDetails;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.Lbl  reason: case insensitive filesystem */
public final class C64430Lbl implements C13562Tcb {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C64430Lbl(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A02 = obj;
        this.A03 = obj2;
        this.A01 = obj3;
    }

    public final void Df7(C11230SGo sGo, Map map) {
        C249523jv r5;
        C11230SGo sGo2 = sGo;
        Map map2 = map;
        if (this.A00 != 0) {
            11Z.A02(new C66054M9n(sGo2, (C307896Rx) this.A01, (C277014uI) this.A03, (C277014uI) this.A02, map2));
            return;
        }
        if (sGo2.A00 != 0 || map == null || map2.isEmpty()) {
            r5 = (C249523jv) this.A01;
            r5.FIG(new C61131Jxh("iap_query_sku_price_failure", String.valueOf(sGo2.A00), sGo2.A01));
        } else {
            C61071Jw9 jw9 = (C61071Jw9) this.A02;
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (C60944Ju2 ju2 : (List) jw9.A04) {
                SkuDetails skuDetails = (SkuDetails) map2.get(ju2.A04);
                if (skuDetails != null) {
                    String str = ju2.A03;
                    String str2 = ju2.A05;
                    int i = ju2.A00;
                    int i2 = ju2.A01;
                    int i3 = ju2.A02;
                    JSONObject jSONObject = skuDetails.A00;
                    String optString = jSONObject.optString("productId");
                    0qQ.A07(optString);
                    String optString2 = jSONObject.optString("price");
                    0qQ.A07(optString2);
                    A1C.add(new C60962JuK(optString, str, str2, optString2, i, i2, i3, 0, jSONObject.optLong(Pxd.A00(844))));
                }
            }
            C61081JwJ jwJ = (C61081JwJ) jw9.A01;
            Integer num = (Integer) jw9.A00;
            0qQ.A0B(num, 2);
            LNj.A00 = SystemClock.uptimeMillis();
            C61071Jw9 jw92 = LNj.A01;
            List list = (List) jw92.A04;
            list.clear();
            list.addAll(A1C);
            jw92.A01 = jwJ;
            jw92.A00 = num;
            r5 = (C249523jv) this.A01;
            r5.FIG(new C61132Jxi(jwJ, num, A1C, jw9.A02, false));
        }
        r5.AI3((Throwable) null);
    }
}
