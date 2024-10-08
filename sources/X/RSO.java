package X;

import android.os.Bundle;
import java.util.ArrayList;

public abstract class RSO {
    public static C10361Rqy A00(Bundle bundle, String str) {
        int i;
        C11230SGo sGo = C10139RnG.A0B;
        if (bundle == null) {
            SUN.A0A("BillingClient", String.format("%s got null owned items list", new Object[]{str}));
            i = 54;
        } else {
            int A02 = SUN.A02(bundle, "BillingClient");
            C11230SGo A00 = C11230SGo.A00(SUN.A07(bundle, "BillingClient"), A02);
            if (A02 != 0) {
                SUN.A0A("BillingClient", String.format("%s failed. Response code: %s", C51968G9o.A1Z(str, A02)));
                return new C10361Rqy(A00, 23);
            } else if (!bundle.containsKey("INAPP_PURCHASE_ITEM_LIST") || !bundle.containsKey("INAPP_PURCHASE_DATA_LIST") || !bundle.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
                SUN.A0A("BillingClient", String.format("Bundle returned from %s doesn't contain required fields.", new Object[]{str}));
                i = 55;
            } else {
                ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                if (stringArrayList == null) {
                    SUN.A0A("BillingClient", String.format("Bundle returned from %s contains null SKUs list.", new Object[]{str}));
                    i = 56;
                } else if (stringArrayList2 == null) {
                    SUN.A0A("BillingClient", String.format("Bundle returned from %s contains null purchases list.", new Object[]{str}));
                    i = 57;
                } else if (stringArrayList3 != null) {
                    return new C10361Rqy(C10139RnG.A0C, 1);
                } else {
                    SUN.A0A("BillingClient", String.format("Bundle returned from %s contains null signatures list.", new Object[]{str}));
                    i = 58;
                }
            }
        }
        return new C10361Rqy(sGo, i);
    }
}
