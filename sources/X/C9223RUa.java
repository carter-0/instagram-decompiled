package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.RUa  reason: case insensitive filesystem */
public abstract class C9223RUa {
    public static final LinkedHashMap A00(JSONObject jSONObject) {
        Iterator<String> keys = jSONObject.keys();
        0qQ.A07(keys);
        AnonymousClass2U8 A00 = 2YX.A00(keys);
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        Iterator it = A00.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Object obj = jSONObject.get((String) next);
            if (obj instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj;
                2HY A0C = C229632nm.A0C(0, jSONArray.length());
                LinkedHashMap A0x = DbS.A0x(JTT.A08(A0C));
                0sh it2 = A0C.iterator();
                while (it2.hasNext()) {
                    int A002 = it2.A00();
                    A0x.put(String.valueOf(A002), jSONArray.get(A002));
                }
                obj = 00k.A0a(A00(new JSONObject(A0x)).values());
            } else if (obj instanceof JSONObject) {
                obj = A00((JSONObject) obj);
            } else if (0qQ.A0K(obj, JSONObject.NULL)) {
                obj = null;
            }
            A1H.put(next, obj);
        }
        return A1H;
    }
}
