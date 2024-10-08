package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Eon  reason: case insensitive filesystem */
public abstract class C49069Eon {
    public static final JSONObject A00(String str) {
        JSONObject A11 = DbS.A11();
        try {
            A11.put("surface", AnonymousClass000.A00(3799));
            A11.put("comment_id", str);
            return A11;
        } catch (JSONException e) {
            0wb.A03("Profile Fragment", AnonymousClass7TF.A0m(AnonymousClass000.A00(2254), e));
            return A11;
        }
    }
}
