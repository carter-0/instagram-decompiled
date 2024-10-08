package X;

import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: X.RUr  reason: case insensitive filesystem */
public abstract class C9240RUr {
    public static void A00(JSONObject jSONObject, JSONObject jSONObject2) {
        Object obj;
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String A18 = AnonymousClass7TE.A18(keys);
            JSONObject optJSONObject = jSONObject2.optJSONObject(A18);
            JSONObject optJSONObject2 = jSONObject.optJSONObject(A18);
            if (optJSONObject == null || optJSONObject2 == null) {
                obj = jSONObject2.get(A18);
            } else {
                A00(optJSONObject2, optJSONObject);
                obj = optJSONObject2;
            }
            jSONObject.put(A18, obj);
        }
    }
}
