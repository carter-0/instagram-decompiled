package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONObject;

/* renamed from: X.VwQ  reason: case insensitive filesystem */
public abstract class C18668VwQ {
    public static final TreeMap A01(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r5));
        for (Object obj : 00l.A0R(str, new String[]{","}, 0).toArray(new String[0])) {
            String str2 = (String) obj;
            int A08 = 00l.A08(str2, ":", 0, false);
            String A12 = DbV.A12(C51967G9n.A0q(str2, 0, A08));
            String A122 = DbV.A12(C51967G9n.A0q(str2, A08 + 1, str2.length()));
            linkedHashMap.put(C51967G9n.A0q(A12, 1, A12.length() - 1), C51967G9n.A0q(A122, 1, A122.length() - 1));
        }
        return new TreeMap(linkedHashMap);
    }

    public static final JSONObject A02(String str) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "avatar_edit_event");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(TraceFieldType.AdhocEventName, "avatar_load_status");
        jSONObject2.put(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, str);
        jSONObject.put("data", jSONObject2);
        return jSONObject;
    }

    public static final LinkedHashMap A00(Map map, boolean z) {
        String str;
        LinkedHashMap A0o = C51975G9x.A0o(map);
        Iterator A0u = AnonymousClass7TF.A0u(map);
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            StringBuilder sb = new StringBuilder();
            String A13 = DbT.A13(A1J);
            if (z) {
                sb.append(A13);
                str = "/parameter";
            } else {
                sb.append(A13);
                str = "/value";
            }
            A0o.put(AnonymousClass7TF.A0l(str, sb), A1J.getValue());
        }
        LinkedHashMap A0o2 = C51975G9x.A0o(A0o);
        Iterator A0s = AnonymousClass7TF.A0s(A0o);
        while (A0s.hasNext()) {
            Map.Entry A1J2 = AnonymousClass7TE.A1J(A0s);
            A0o2.put(A1J2.getKey(), 002.A0N("FLOAT_RANGE:float:", AnonymousClass7TE.A04(A1J2.getValue())));
        }
        return A0o2;
    }
}
