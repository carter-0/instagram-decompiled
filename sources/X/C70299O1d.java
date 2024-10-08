package X;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.O1d  reason: case insensitive filesystem */
public abstract class C70299O1d {
    public static final String A00(Map map) {
        try {
            JSONObject A11 = DbS.A11();
            Iterator A0u = AnonymousClass7TF.A0u(map);
            while (A0u.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                String A13 = DbT.A13(A1J);
                JSONArray jSONArray = new JSONArray();
                Iterator it = ((List) A1J.getValue()).iterator();
                while (it.hasNext()) {
                    DbT.A1W(it, jSONArray);
                }
                A11.put(A13, jSONArray);
            }
            return A11.toString();
        } catch (JSONException e) {
            0KC.A0F("MobileConfigValueLogger", "Unable to create log", e);
            return "{}";
        }
    }
}
