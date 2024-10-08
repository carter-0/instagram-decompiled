package X;

import com.android.billingclient.api.Purchase;
import com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Sod  reason: case insensitive filesystem */
public final class C12188Sod implements C13714Tfc {
    public final /* synthetic */ InAppPurchaseControllerCoro A00;
    public final /* synthetic */ List A01;
    public final /* synthetic */ List A02;
    public final /* synthetic */ Map A03;

    public C12188Sod(InAppPurchaseControllerCoro inAppPurchaseControllerCoro, List list, List list2, Map map) {
        this.A00 = inAppPurchaseControllerCoro;
        this.A03 = map;
        this.A01 = list;
        this.A02 = list2;
    }

    public final void DEk(Throwable th, List list) {
        this.A00.A0J(C8918RFl.FB_SYNC_FAILED, this.A01, 0Yt.A0E());
    }

    public final void Dot(QP6 qp6, List list, List list2) {
        List list3 = list;
        if (list2 == null || list2.isEmpty()) {
            InAppPurchaseControllerCoro inAppPurchaseControllerCoro = this.A00;
            SPQ spq = inAppPurchaseControllerCoro.A06;
            Map map = this.A03;
            0qQ.A0B(map, 0);
            Iterator A0v = AnonymousClass7TF.A0v(map);
            while (A0v.hasNext()) {
                spq.A00.Cgp((Map) A0v.next(), (Map) null, "client_verify_dcppayment_success");
            }
            List list4 = this.A01;
            0qQ.A0B(list4, 0);
            inAppPurchaseControllerCoro.A0H((S1E) null, list4, list3, map);
            inAppPurchaseControllerCoro.A0J(C8918RFl.SUCCESSFUL, list4, (Map) null);
            return;
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : list2) {
            String str = ((QOn) next).A02;
            if (!(str == null || str.length() == 0)) {
                A1C.add(next);
            }
        }
        LinkedHashMap A0x = DbS.A0x(JTT.A08(A1C));
        Iterator it = A1C.iterator();
        while (it.hasNext()) {
            Object next2 = it.next();
            A0x.put(((QOn) next2).A02, next2);
        }
        InAppPurchaseControllerCoro inAppPurchaseControllerCoro2 = this.A00;
        Map map2 = this.A03;
        Iterator A0s = AnonymousClass7TF.A0s(A0x);
        while (A0s.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
            SPQ spq2 = inAppPurchaseControllerCoro2.A06;
            Object key = A1J.getKey();
            0qQ.A0B(map2, 1);
            spq2.A00.Cgp((Map) map2.get(key), (Map) null, "client_verify_dcppayment_fail");
        }
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        for (Object next3 : list2) {
            QOn qOn = (QOn) next3;
            0qQ.A0B(qOn, 0);
            if (qOn.A01 != 2603009) {
                A1C2.add(next3);
            }
        }
        List list5 = this.A01;
        ArrayList A1C3 = AnonymousClass7TE.A1C();
        for (Object next4 : list5) {
            if (!A0x.containsKey(((Purchase) next4).A01())) {
                A1C3.add(next4);
            }
        }
        Iterator it2 = A1C3.iterator();
        while (it2.hasNext()) {
            SPQ spq3 = inAppPurchaseControllerCoro2.A06;
            String A012 = ((Purchase) it2.next()).A01();
            0qQ.A0B(map2, 1);
            spq3.A00.Cgp((Map) map2.get(A012), (Map) null, "client_verify_dcppayment_success");
        }
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        Iterator A0s2 = AnonymousClass7TF.A0s(A0x);
        while (A0s2.hasNext()) {
            Map.Entry A1J2 = AnonymousClass7TE.A1J(A0s2);
            QOn qOn2 = (QOn) A1J2.getValue();
            0qQ.A0B(qOn2, 0);
            if (qOn2.A01 == 2603009) {
                JTR.A1U(A1H, A1J2);
            }
        }
        Set keySet = A1H.keySet();
        ArrayList A1C4 = AnonymousClass7TE.A1C();
        for (Object next5 : list5) {
            if (keySet.contains(((Purchase) next5).A01())) {
                A1C4.add(next5);
            }
        }
        if (A1C3.size() == this.A02.size() || A1C4.size() == list2.size()) {
            0qQ.A0B(map2, 2);
            inAppPurchaseControllerCoro2.A0H((S1E) null, list5, list3, map2);
            inAppPurchaseControllerCoro2.A0J(C8918RFl.SUCCESSFUL, list5, (Map) null);
            return;
        }
        if (DbT.A1b(A1C4)) {
            inAppPurchaseControllerCoro2.A0H((S1E) null, A1C4, list3, map2);
            SHQ shq = inAppPurchaseControllerCoro2.A0D;
            QP6 qp62 = qp6;
            String str2 = qp62.A05;
            AnonymousClass1aS A002 = SHQ.A00(shq, str2);
            String str3 = qp62.A06;
            A002.accept(new QP6(C8918RFl.SERVER_VERIFICATION_FAILED, C8913RFg.COMPLETE_WITH_ERRORS, str2, str3, (List) qp62.A03, (List) qp62.A01, (List) A1C2));
        }
        inAppPurchaseControllerCoro2.A0H((S1E) null, A1C3, list3, map2);
        C8918RFl rFl = C8918RFl.SERVER_VERIFICATION_FAILED;
        LinkedHashMap A1H2 = AnonymousClass7TE.A1H();
        SKS.A01("Server verification returned failed purchases", A1H2);
        LinkedHashMap A032 = 0Yt.A03(A1H2);
        LinkedHashMap A1H3 = AnonymousClass7TE.A1H();
        JSONObject A11 = DbS.A11();
        int i = 0;
        for (Object next6 : list2) {
            int i2 = i + 1;
            if (i < 0) {
                0sr.A1T();
                throw AnonymousClass00P.createAndThrow();
            }
            try {
                A11.put(String.valueOf(i), next6);
            } catch (JSONException e) {
                0KC.A0F("DCP", "Failed writing Purchase Error to JSON", e);
            }
            i = i2;
        }
        A1H3.put("purchase_errors", A11.toString());
        A032.putAll(A1H3);
        inAppPurchaseControllerCoro2.A0J(rFl, list5, A032);
    }
}
