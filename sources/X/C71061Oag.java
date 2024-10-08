package X;

import android.app.ActivityThread;
import android.os.Bundle;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Oag  reason: case insensitive filesystem */
public final class C71061Oag {
    public long A00 = 0;
    public LinkedList A01;
    public JSONObject A02 = null;
    public final /* synthetic */ 18a A03;

    public static JSONObject A00(C71061Oag oag, Object obj, LinkedList linkedList, long j) {
        Object A012;
        Object obj2 = obj;
        JSONObject A11 = DbS.A11();
        C71061Oag oag2 = oag;
        try {
            String A0y = C66581MXm.A0y(obj);
            A11.put("_type", A0y);
            long j2 = j;
            A11.put("_size", j);
            if (obj2 instanceof Bundle) {
                Bundle bundle = (Bundle) obj2;
                LinkedList linkedList2 = linkedList;
                if (!A02(bundle)) {
                    oag2.A01(bundle, linkedList2, A11, j2);
                    return A11;
                } else if (A02(bundle)) {
                    Object obj3 = bundle.get(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE);
                    obj3.getClass();
                    Object A013 = 0HB.A00(ActivityThread.currentActivityThread().getApplication()).A01(obj3, "mClassName");
                    if (A013 == null) {
                        A013 = "FailedToGetFragmentClassName";
                    }
                    linkedList.addFirst(A013);
                    if (!bundle.containsKey("childFragmentManager") && j > oag2.A00) {
                        oag2.A00 = j;
                        oag2.A01 = new LinkedList(linkedList);
                    }
                    oag2.A01(bundle, linkedList2, A11, j2);
                    linkedList.removeFirst();
                    return A11;
                }
            } else if (A0y.equals("androidx.fragment.app.FragmentState") && (A012 = 0HB.A00(ActivityThread.currentActivityThread().getApplication()).A01(obj2, "mClassName")) != null) {
                A11.put("mClassName", A012);
                return A11;
            }
        } catch (JSONException e) {
            oag2.A03.A0C(e);
        }
        return A11;
    }

    public C71061Oag(18a r3) {
        this.A03 = r3;
    }

    private void A01(Bundle bundle, LinkedList linkedList, JSONObject jSONObject, long j) {
        JSONObject jSONObject2;
        Object obj;
        long j2 = j;
        try {
            Bundle bundle2 = new Bundle(bundle);
            JSONArray jSONArray = new JSONArray();
            Iterator<String> it = bundle.keySet().iterator();
            while (true) {
                jSONObject2 = jSONObject;
                if (!it.hasNext()) {
                    break;
                }
                String A18 = AnonymousClass7TE.A18(it);
                Object obj2 = bundle2.get(A18);
                bundle2.remove(A18);
                long A002 = 18a.A00(bundle2);
                long j3 = j2 - A002;
                if (obj2 != null) {
                    if (j3 > 10240 || A02(bundle) || ((obj = bundle.get(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE)) != null && C66581MXm.A0y(obj).equals("androidx.fragment.app.FragmentManagerState"))) {
                        jSONObject2.put(A18, A00(this, obj2, linkedList, j3));
                    } else {
                        jSONArray.put(A18);
                    }
                }
                j2 = A002;
            }
            if (jSONArray.length() > 0) {
                jSONObject2.put("_small", jSONArray);
            }
        } catch (Throwable th) {
            this.A03.A0C(th);
        }
    }

    public static boolean A02(Bundle bundle) {
        Object obj = bundle.get(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE);
        if (obj == null || !C66581MXm.A0y(obj).equals("androidx.fragment.app.FragmentState")) {
            return false;
        }
        return true;
    }
}
