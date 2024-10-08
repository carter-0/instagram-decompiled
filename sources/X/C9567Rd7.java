package X;

import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.Rd7  reason: case insensitive filesystem */
public abstract class C9567Rd7 {
    public static JSONObject A00(Map map) {
        if (map.isEmpty()) {
            return null;
        }
        JSONObject A11 = DbS.A11();
        Iterator A0u = AnonymousClass7TF.A0u(map);
        while (A0u.hasNext()) {
            C66584MXp.A18(A0u, A11);
        }
        return A11;
    }
}
