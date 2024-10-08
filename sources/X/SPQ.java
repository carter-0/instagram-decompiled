package X;

import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.SkuDetails;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class SPQ {
    public final C13888TjB A00;

    public final void A04(C11230SGo sGo, Map map) {
        String str;
        0qQ.A0B(map, 1);
        if (map.isEmpty()) {
            map = AnonymousClass7TE.A1H();
            SKS.A00(sGo, map);
        }
        int i = sGo.A00;
        C13888TjB tjB = this.A00;
        if (i == 1) {
            str = "user_create_dcppayment_cancel";
        } else {
            str = "client_create_dcppayment_fail";
        }
        tjB.Cgp(map, (Map) null, str);
    }

    public final void A07(String str, String str2, List list) {
        0qQ.A0B(str, 1);
        this.A00.Cgp(DbY.A0q(RH0.A0S.A00, str2, AnonymousClass7TE.A1L(RH0.A0n.A00, str), AnonymousClass7TE.A1L(RH0.A0U.A00, DbT.A0z(",", list, (0sP) null))), (Map) null, "client_fetch_dcpcatalog_fail");
    }

    public final void A08(List list, String str) {
        0qQ.A0B(str, 1);
        this.A00.Cgp(DbY.A0p(RH0.A0U.A00, DbT.A0z(",", list, (0sP) null), AnonymousClass7TE.A1L(RH0.A0n.A00, str)), (Map) null, "client_fetch_dcpcatalog_init");
    }

    public final void A09(List list, String str) {
        0qQ.A0B(str, 1);
        this.A00.Cgp(DbY.A0p(RH0.A0U.A00, DbT.A0z(",", list, (0sP) null), AnonymousClass7TE.A1L(RH0.A0n.A00, str)), (Map) null, "client_fetch_dcpcatalog_success");
    }

    public final void A0A(List list, List list2) {
        if (list2 == null || list2.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                LinkedHashMap A1H = AnonymousClass7TE.A1H();
                A1H.put(RH0.A0V.A00, ((Purchase) it.next()).A01());
                this.A00.Cgp(A1H, (Map) null, "client_verify_dcppayment_fail");
            }
            return;
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            QOn qOn = (QOn) it2.next();
            LinkedHashMap A1H2 = AnonymousClass7TE.A1H();
            A1H2.put(RH0.A0V.A00, qOn.A02);
            A1H2.put(RH0.A0R.A00, String.valueOf(qOn.A01));
            A1H2.put(RH0.A0S.A00, qOn.A03);
            this.A00.Cgp(A1H2, (Map) null, "client_verify_dcppayment_fail");
        }
    }

    public final void A03(C11230SGo sGo, String str, String str2, 0sm r8) {
        if (r8 == null) {
            r8 = 0Yt.A0E();
        }
        LinkedHashMap A03 = 0Yt.A03(r8);
        Pxe.A1U(RH0.A0Q, str, A03);
        if (sGo != null) {
            SKS.A00(sGo, A03);
        } else {
            SKS.A01("Server verification failed", A03);
        }
        if (str2 != null) {
            Pxe.A1U(RH0.A0V, str2, A03);
        }
        this.A00.Cgp(A03, (Map) null, "client_create_dcp_external_confirm_fail");
    }

    public final void A05(C11230SGo sGo, Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put("extra_error_message", 002.A0R("Unable to fetch SKU: ", DbT.A11(RH0.A0U.A00, map)));
        SKS.A00(sGo, linkedHashMap);
        this.A00.Cgp(linkedHashMap, (Map) null, "client_create_dcppayment_fail");
    }

    public final void A06(C8918RFl rFl, String str, 0sm r7) {
        if (r7 == null) {
            r7 = 0Yt.A0E();
        }
        LinkedHashMap A03 = 0Yt.A03(r7);
        SKS.A01(rFl.A00, A03);
        A03.put("DcpResultCode", rFl.name());
        Pxe.A1U(RH0.A0V, str, A03);
        this.A00.Cgp(A03, (Map) null, "client_create_iap_external_confirm_warning");
    }

    public SPQ(C13888TjB tjB) {
        this.A00 = tjB;
    }

    public static final LinkedHashMap A00(C11230SGo sGo, Collection collection) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        A1H.put("item_count", String.valueOf(collection.size()));
        int i = 0;
        for (Object next : collection) {
            int i2 = i + 1;
            if (i < 0) {
                0sr.A1T();
                throw AnonymousClass00P.createAndThrow();
            }
            Purchase purchase = (Purchase) next;
            A1H.put(002.A0c("item_", "_external_transaction_id", i), purchase.A01());
            A1H.put(002.A0c("item_", "_external_product_id", i), RWF.A00(purchase));
            String A0c = 002.A0c("item_", "_external_purchase_time", i);
            JSONObject jSONObject = purchase.A02;
            A1H.put(A0c, 002.A0Q("", jSONObject.optLong("purchaseTime")));
            A1H.put(002.A0c("item_", "_external_purchase_signature", i), purchase.A01);
            A1H.put(002.A0c("item_", "_developer_payload", i), jSONObject.optString("developerPayload"));
            A1H.put(002.A0c("item_", "_external_purchase_token", i), purchase.A02());
            A1H.put(002.A0c("item_", "_request_id", i), purchase.A01());
            i = i2;
        }
        SKS.A00(sGo, A1H);
        return A1H;
    }

    public static final LinkedHashMap A01(List list) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (list != null) {
            String str = RH0.A0W.A00;
            ArrayList A0r = AnonymousClass7TG.A0r(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A0r.add(((Purchase) it.next()).A02());
            }
            A1H.put(str, A0r);
        }
        return A1H;
    }

    public final LinkedHashMap A02(S1C s1c, String str, List list, boolean z) {
        LinkedHashMap A0t = C51972G9s.A0t(str);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Purchase purchase = (Purchase) it.next();
            LinkedHashMap A03 = 0Yt.A03(this.A00.BiK((C11230SGo) null, purchase, z));
            A03.put("product_type", str);
            SkuDetails A002 = s1c.A00(RWF.A00(purchase));
            if (A002 != null) {
                A03.put(RWF.A00(purchase), A002.toString());
            }
            A0t.put(purchase.A02(), A03);
        }
        return A0t;
    }
}
