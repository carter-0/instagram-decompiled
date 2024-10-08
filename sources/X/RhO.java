package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class RhO {
    public static final LinkedHashMap A00(JSONObject jSONObject) {
        0qQ.A0B(jSONObject, 0);
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
                ArrayList A0r = AnonymousClass7TG.A0r(A0C);
                0sh it2 = A0C.iterator();
                while (it2.hasNext()) {
                    A0r.add(jSONArray.get(it2.A00()));
                }
                obj = A0r;
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
