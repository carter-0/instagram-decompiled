package X;

import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.5Af  reason: invalid class name and case insensitive filesystem */
public abstract class C281955Af {
    public static JSONObject A00(1R6 r6) {
        JSONArray jSONArray = new JSONArray();
        for (C17978VjG vjG : r6.A00) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("key", vjG.A01);
            jSONObject.put("url", vjG.A02);
            jSONObject.put("cooldown", vjG.A00);
            jSONArray.put(jSONObject);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("pingConfigs", jSONArray);
        return jSONObject2;
    }
}
