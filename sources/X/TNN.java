package X;

import android.os.Bundle;
import android.text.TextUtils;
import com.android.billingclient.api.Purchase;
import com.google.android.gms.internal.play_billing.zzs;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONException;

public final class TNN implements Callable {
    public final /* synthetic */ STX A00;
    public final /* synthetic */ C13525Tbu A01;
    public final /* synthetic */ String A02;

    public TNN(STX stx, C13525Tbu tbu, String str) {
        this.A02 = str;
        this.A01 = tbu;
        this.A00 = stx;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        C10360Rqx rqx;
        Bundle bundle;
        STX stx = this.A00;
        String str = this.A02;
        SUN.A09("BillingClient", "Querying owned items, item type: ".concat(String.valueOf(str)));
        ArrayList A1C = AnonymousClass7TE.A1C();
        Bundle A03 = SUN.A03(stx.A0G, stx.A06);
        String str2 = null;
        while (true) {
            try {
                if (stx.A06) {
                    zzs zzs = stx.A0K;
                    int i = 19;
                    if (true != stx.A0C) {
                        i = 9;
                    }
                    bundle = zzs.FQ8(A03, stx.A01.getPackageName(), str, str2, i);
                } else {
                    bundle = stx.A0K.FQ4(stx.A01.getPackageName(), str, str2, 3);
                }
                C10361Rqy A002 = RSO.A00(bundle, "getPurchase()");
                C11230SGo sGo = A002.A01;
                C11230SGo sGo2 = C10139RnG.A0C;
                if (sGo == sGo2) {
                    ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                    ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                    ArrayList<String> stringArrayList3 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                    int i2 = 0;
                    boolean z = false;
                    while (i2 < stringArrayList2.size()) {
                        String str3 = stringArrayList2.get(i2);
                        String str4 = stringArrayList3.get(i2);
                        SUN.A09("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList.get(i2))));
                        try {
                            Purchase purchase = new Purchase(str3, str4);
                            if (TextUtils.isEmpty(purchase.A02())) {
                                SUN.A0A("BillingClient", "BUG: empty/null token!");
                                z = true;
                            }
                            A1C.add(purchase);
                            i2++;
                        } catch (JSONException e) {
                            SUN.A0B("BillingClient", "Got an exception trying to decode the purchase!", e);
                            C13891TjE tjE = stx.A02;
                            C11230SGo sGo3 = C10139RnG.A0B;
                            Pxf.A1C(sGo3, tjE, 51, 9);
                            rqx = new C10360Rqx(sGo3, (List) null);
                        }
                    }
                    if (z) {
                        Pxf.A1C(C10139RnG.A0B, stx.A02, 26, 9);
                    }
                    str2 = bundle.getString("INAPP_CONTINUATION_TOKEN");
                    SUN.A09("BillingClient", "Continuation token: ".concat(String.valueOf(str2)));
                    if (TextUtils.isEmpty(str2)) {
                        rqx = new C10360Rqx(sGo2, A1C);
                        break;
                    }
                } else {
                    Pxf.A1C(sGo, stx.A02, A002.A00, 9);
                    rqx = new C10360Rqx(sGo, (List) null);
                    break;
                }
            } catch (Exception e2) {
                C13891TjE tjE2 = stx.A02;
                C11230SGo sGo4 = C10139RnG.A0D;
                Pxf.A1C(sGo4, tjE2, 52, 9);
                SUN.A0B("BillingClient", "Got exception trying to get purchasesm try to reconnect", e2);
                rqx = new C10360Rqx(sGo4, (List) null);
            }
        }
        List list = rqx.A01;
        C13525Tbu tbu = this.A01;
        if (list != null) {
            tbu.Db6(rqx.A00, list);
            return null;
        }
        tbu.Db6(rqx.A00, C8553Qwr.A00());
        return null;
    }
}
