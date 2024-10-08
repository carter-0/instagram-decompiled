package X;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.Rnb  reason: case insensitive filesystem */
public final class C10160Rnb {
    public final List A00;

    public C10160Rnb(JSONArray jSONArray) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    A1C.add(new C10769Rxn(optJSONObject));
                }
            }
        }
        this.A00 = A1C;
    }
}
