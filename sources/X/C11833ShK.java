package X;

import com.android.billingclient.api.PurchaseHistoryRecord;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.ShK  reason: case insensitive filesystem */
public final class C11833ShK implements C13524Tbt {
    public final /* synthetic */ AnonymousClass4D7 A00;

    public C11833ShK(AnonymousClass4D7 r1) {
        this.A00 = r1;
    }

    public final void Db1(C11230SGo sGo, List list) {
        ArrayList arrayList;
        0qQ.A0B(sGo, 0);
        int i = sGo.A00;
        AnonymousClass4D7 r5 = this.A00;
        if (i != 0 || list == null) {
            arrayList = 0sn.A00;
        } else {
            arrayList = AnonymousClass7TG.A0r(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                PurchaseHistoryRecord purchaseHistoryRecord = (PurchaseHistoryRecord) it.next();
                0qQ.A0A(purchaseHistoryRecord);
                ArrayList A0q = AnonymousClass7TF.A0q(purchaseHistoryRecord, 0);
                JSONObject jSONObject = purchaseHistoryRecord.A02;
                if (jSONObject.has("productIds")) {
                    JSONArray optJSONArray = jSONObject.optJSONArray("productIds");
                    if (optJSONArray != null) {
                        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                            A0q.add(optJSONArray.optString(i2));
                        }
                    }
                } else if (jSONObject.has("productId")) {
                    A0q.add(jSONObject.optString("productId"));
                }
                Object obj = A0q.get(0);
                0qQ.A07(obj);
                arrayList.add(obj);
            }
        }
        r5.resumeWith(arrayList);
    }
}
