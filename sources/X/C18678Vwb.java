package X;

import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.Vwb  reason: case insensitive filesystem */
public abstract class C18678Vwb {
    public static final C360678ey A01(BaseFragmentActivity baseFragmentActivity, UserSession userSession, Integer num, String str, String str2, String str3) {
        String str4;
        int i;
        AnonymousClass7TF.A1H(baseFragmentActivity, userSession);
        switch (num.intValue()) {
            case 0:
                str4 = "promote_prevalidation";
                break;
            case 1:
                i = 351;
                break;
            default:
                i = 497;
                break;
        }
        str4 = AnonymousClass000.A00(i);
        LinkedHashMap A02 = A02(str3);
        List A1P = 0sr.A1P(Pxg.A1b(C16586Uxg.DATA_SOURCE, "unknown", AnonymousClass7TF.A0x(C16586Uxg.ACCOUNT_TYPE, 0), new 0eP(C16586Uxg.ACCESS_TOKEN, "")));
        JSONObject jSONObject = new JSONObject();
        Iterator it = A1P.iterator();
        while (it.hasNext()) {
            C13991Tnr.A1U(it, jSONObject);
        }
        ArrayList arrayList = new ArrayList();
        AnonymousClass7TF.A1I(C16586Uxg.ENTRY_POINT, str, arrayList);
        AnonymousClass7TF.A1I(C16586Uxg.FLOW, str4, arrayList);
        AnonymousClass7TF.A1I(C16586Uxg.FLOW_ID, str2, arrayList);
        AnonymousClass7TF.A1I(C16586Uxg.STEPPER_COUNT, 4, arrayList);
        AnonymousClass7TF.A1I(C16586Uxg.BRIDGE_TO_PROMOTE_CALLSITE, "promote_prevalidation_cal_fallback", arrayList);
        AnonymousClass7TF.A1I(C16586Uxg.PROMOTE_PREVALIDATION_EXCEPTION, "promote_unknown_exception", arrayList);
        C16586Uxg uxg = C16586Uxg.EXTRA_DATA;
        JSONObject jSONObject2 = new JSONObject();
        Iterator A0u = Pxf.A0u(A02);
        while (A0u.hasNext()) {
            String A18 = AnonymousClass7TE.A18(A0u);
            jSONObject2.put(A18, A02.get(A18));
        }
        AnonymousClass7TF.A1I(uxg, jSONObject2, arrayList);
        AnonymousClass7TF.A1I(C16586Uxg.AUTH_DATA, jSONObject, arrayList);
        JSONObject jSONObject3 = new JSONObject();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C13991Tnr.A1U(it2, jSONObject3);
        }
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("server_params", jSONObject3);
        C360678ey A05 = C359988do.A05(userSession, "com.bloks.www.ig_promote.linking.async_flow_controller", DbY.A0m("params", DbT.A10(jSONObject4)));
        A05.A00(new C15410UcM(0, baseFragmentActivity, num, userSession));
        return A05;
    }

    public static final C360678ey A00(BaseFragmentActivity baseFragmentActivity, UserSession userSession, Integer num, String str) {
        int i;
        String str2;
        boolean A1X = DbW.A1X(userSession);
        switch (num.intValue()) {
            case 1:
                i = 351;
                break;
            case 2:
                i = 497;
                break;
            case 3:
                str2 = "pro2pro_promote_ad_account_linking";
                break;
            default:
                i = 744;
                break;
        }
        str2 = AnonymousClass000.A00(i);
        LinkedHashMap A02 = A02((String) null);
        ArrayList arrayList = new ArrayList();
        AnonymousClass7TF.A1I(C16586Uxg.ENTRY_POINT, "fulcrum_nexus", arrayList);
        AnonymousClass7TF.A1I(C16586Uxg.FLOW, str2, arrayList);
        AnonymousClass7TF.A1I(C16586Uxg.FLOW_ID, str, arrayList);
        AnonymousClass7TF.A1I(C16586Uxg.STEPPER_COUNT, 4, arrayList);
        C16586Uxg uxg = C16586Uxg.EXTRA_DATA;
        JSONObject jSONObject = new JSONObject();
        Iterator A0u = Pxf.A0u(A02);
        while (A0u.hasNext()) {
            String A18 = AnonymousClass7TE.A18(A0u);
            jSONObject.put(A18, A02.get(A18));
        }
        AnonymousClass7TF.A1I(uxg, jSONObject, arrayList);
        JSONObject jSONObject2 = new JSONObject();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C13991Tnr.A1U(it, jSONObject2);
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("server_params", jSONObject2);
        C360678ey A022 = C359988do.A02((AnonymousClass1O9) null, userSession, "com.bloks.www.ig_promote.linking.async_flow_controller", DbY.A0m("params", DbT.A10(jSONObject3)));
        A022.A00(new C15410UcM(A1X ? 1 : 0, baseFragmentActivity, num, userSession));
        return A022;
    }

    public static final LinkedHashMap A02(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        long j = C15414UcQ.A00.A00;
        if (j != 0) {
            int i = (int) (j >>> 32);
            if (Integer.valueOf(i) != null) {
                linkedHashMap.put("boost_in_app_qpl_instance_id", String.valueOf(i));
            }
        }
        if (str != null) {
            linkedHashMap.put("selected_audio_spec", str);
        }
        return linkedHashMap;
    }
}
