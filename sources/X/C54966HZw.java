package X;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.HZw  reason: case insensitive filesystem */
public abstract class C54966HZw {
    public static void A00(1NY r5, 1FZ r6, ArrayList arrayList) {
        try {
            JSONArray jSONArray = new JSONArray();
            JSONObject A11 = DbS.A11();
            A11.put("nudge_name", "alternative_topic_nudge");
            A11.put("platform", "explore_similar_posts");
            A11.put("last_seen_times", new JSONArray(arrayList));
            jSONArray.put(A11);
            r5.A9m("last_seen_data", jSONArray.toString());
            r6.A9m("last_seen_data", jSONArray.toString());
        } catch (JSONException e) {
            0wb.A06("alt_topic_set_last_seen", C66579MXk.A00(243), e);
        }
    }
}
