package X;

import com.android.billingclient.api.SkuDetails;
import java.util.Map;

/* renamed from: X.FSk  reason: case insensitive filesystem */
public final class C50178FSk implements C13562Tcb {
    public final /* synthetic */ String A00;
    public final /* synthetic */ 1IX A01;

    public C50178FSk(String str, 1IX r2) {
        this.A00 = str;
        this.A01 = r2;
    }

    public final void Df7(C11230SGo sGo, Map map) {
        String str;
        1IX r1;
        Object obj;
        SkuDetails skuDetails;
        if (map == null || (skuDetails = (SkuDetails) map.get(this.A00)) == null) {
            str = null;
        } else {
            str = skuDetails.A00.optString("price");
        }
        if (sGo.A00 != 0 || str == null) {
            r1 = this.A01;
            obj = C47859EKf.A00;
        } else {
            r1 = this.A01;
            obj = new C47857EKd(str);
        }
        r1.resumeWith(obj);
    }
}
