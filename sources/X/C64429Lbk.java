package X;

import com.android.billingclient.api.SkuDetails;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.Lbk  reason: case insensitive filesystem */
public final class C64429Lbk implements C13562Tcb {
    public final /* synthetic */ LCT A00;
    public final /* synthetic */ C60980Juc A01;

    public C64429Lbk(LCT lct, C60980Juc juc) {
        this.A01 = juc;
        this.A00 = lct;
    }

    public final void Df7(C11230SGo sGo, Map map) {
        SkuDetails skuDetails;
        if (sGo.A00 == 0) {
            C60980Juc juc = this.A01;
            HashMap hashMap = juc.A0B;
            List A002 = this.A00.A00();
            if (A002 != null) {
                for (Object next : A002) {
                    if (!(map == null || (skuDetails = (SkuDetails) map.get(next)) == null)) {
                        JSONObject jSONObject = skuDetails.A00;
                        if (jSONObject.optString("price") != null) {
                            hashMap.put(next, jSONObject.optString("price"));
                        }
                        if (jSONObject.optString("price_currency_code") != null) {
                            juc.A0A.put(next, jSONObject.optString("price_currency_code"));
                        }
                    }
                }
            }
        }
        C60980Juc juc2 = this.A01;
        juc2.A0D = false;
        this.A00.A00.A0A(juc2);
    }
}
