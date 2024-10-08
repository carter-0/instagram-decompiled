package X;

import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.6eg  reason: invalid class name and case insensitive filesystem */
public final class C312556eg {
    public static final 0xF A00(C312556eg r5, JSONObject jSONObject) {
        0xF A01;
        0xF r4 = new 0xF();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if ((obj instanceof String) || (obj instanceof Integer) || (obj instanceof Double) || (obj instanceof Long) || (obj instanceof Boolean)) {
                0xF.A00(r4, obj, next);
            } else {
                if (obj instanceof JSONObject) {
                    A01 = A00(r5, (JSONObject) obj);
                } else if (obj instanceof JSONArray) {
                    A01 = r5.A01((JSONArray) obj);
                }
                0xF.A00(r4, A01, next);
            }
        }
        return r4;
    }

    private final 0xE A01(JSONArray jSONArray) {
        0xF A01;
        0xE r4 = new 0xE();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof String) {
                r4.A04((String) obj);
            } else if (obj instanceof Integer) {
                r4.A01(((Number) obj).intValue());
            } else if (obj instanceof Double) {
                r4.A00(((Number) obj).doubleValue());
            } else if (obj instanceof Long) {
                r4.A02(((Number) obj).longValue());
            } else if (obj instanceof Boolean) {
                r4.A05(((Boolean) obj).booleanValue());
            } else {
                if (obj instanceof JSONObject) {
                    A01 = A00(this, (JSONObject) obj);
                } else if (obj instanceof JSONArray) {
                    A01 = A01((JSONArray) obj);
                }
                r4.A00.add(A01);
            }
        }
        return r4;
    }
}
