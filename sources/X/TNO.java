package X;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.android.billingclient.api.PurchaseHistoryRecord;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

public final class TNO implements Callable {
    public final /* synthetic */ STX A00;
    public final /* synthetic */ C13524Tbt A01;
    public final /* synthetic */ String A02;

    public TNO(STX stx, C13524Tbt tbt, String str) {
        this.A02 = str;
        this.A01 = tbt;
        this.A00 = stx;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        C10359Rqw rqw;
        STX stx = this.A00;
        String str = this.A02;
        SUN.A09("BillingClient", "Querying purchase history, item type: ".concat(String.valueOf(str)));
        ArrayList A1C = AnonymousClass7TE.A1C();
        Bundle A03 = SUN.A03(stx.A0G, stx.A06);
        String str2 = null;
        while (true) {
            if (!stx.A05) {
                SUN.A0A("BillingClient", "getPurchaseHistory is not supported on current device");
                rqw = new C10359Rqw(C10139RnG.A0G, (List) null);
                break;
            }
            try {
                Bundle FQ0 = stx.A0K.FQ0(A03, stx.A01.getPackageName(), str, str2, 6);
                C10361Rqy A002 = RSO.A00(FQ0, "getPurchaseHistory()");
                C11230SGo sGo = A002.A01;
                C11230SGo sGo2 = C10139RnG.A0C;
                if (sGo == sGo2) {
                    ArrayList<String> stringArrayList = FQ0.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                    ArrayList<String> stringArrayList2 = FQ0.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                    ArrayList<String> stringArrayList3 = FQ0.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                    int i = 0;
                    boolean z = false;
                    while (i < stringArrayList2.size()) {
                        String str3 = stringArrayList2.get(i);
                        String str4 = stringArrayList3.get(i);
                        SUN.A09("BillingClient", "Purchase record found for sku : ".concat(String.valueOf(stringArrayList.get(i))));
                        try {
                            PurchaseHistoryRecord purchaseHistoryRecord = new PurchaseHistoryRecord(str3, str4);
                            JSONObject jSONObject = purchaseHistoryRecord.A02;
                            if (TextUtils.isEmpty(jSONObject.optString("token", jSONObject.optString("purchaseToken")))) {
                                SUN.A0A("BillingClient", "BUG: empty/null token!");
                                z = true;
                            }
                            A1C.add(purchaseHistoryRecord);
                            i++;
                        } catch (JSONException e) {
                            SUN.A0B("BillingClient", "Got an exception trying to decode the purchase!", e);
                            C13891TjE tjE = stx.A02;
                            C11230SGo sGo3 = C10139RnG.A0B;
                            Pxf.A1C(sGo3, tjE, 51, 11);
                            rqw = new C10359Rqw(sGo3, (List) null);
                        }
                    }
                    if (z) {
                        Pxf.A1C(C10139RnG.A0B, stx.A02, 26, 11);
                    }
                    str2 = FQ0.getString("INAPP_CONTINUATION_TOKEN");
                    SUN.A09("BillingClient", "Continuation token: ".concat(String.valueOf(str2)));
                    if (TextUtils.isEmpty(str2)) {
                        rqw = new C10359Rqw(sGo2, A1C);
                        break;
                    }
                } else {
                    Pxf.A1C(sGo, stx.A02, A002.A00, 11);
                    rqw = new C10359Rqw(sGo, (List) null);
                    break;
                }
            } catch (RemoteException e2) {
                SUN.A0B("BillingClient", "Got exception trying to get purchase history, try to reconnect", e2);
                C13891TjE tjE2 = stx.A02;
                C11230SGo sGo4 = C10139RnG.A0D;
                Pxf.A1C(sGo4, tjE2, 59, 11);
                rqw = new C10359Rqw(sGo4, (List) null);
            }
        }
        this.A01.Db1(rqw.A00, rqw.A01);
        return null;
    }
}
