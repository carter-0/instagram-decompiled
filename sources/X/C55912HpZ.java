package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.HpZ  reason: case insensitive filesystem */
public abstract class C55912HpZ {
    public final JSONObject A00;

    public final void A00(String str, String str2) {
        if (str2 == null) {
            try {
                this.A00.put(str, JSONObject.NULL);
            } catch (JSONException unused) {
            }
        } else {
            this.A00.put(str, str2);
        }
    }

    public C55912HpZ(JSONObject jSONObject) {
        this.A00 = jSONObject;
    }
}
