package X;

import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.O0d  reason: case insensitive filesystem */
public abstract class C70273O0d {
    public static final C53229Gkd A00(String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, List list2) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        0qQ.A0B(str, 0);
        JSONObject A11 = DbS.A11();
        if (str5 == null) {
            try {
                A11.put("attribution_link", JSONObject.NULL);
            } catch (JSONException unused) {
            }
        } else {
            A11.put("attribution_link", str5);
        }
        if (str6 == null) {
            try {
                A11.put("search_engine", JSONObject.NULL);
            } catch (JSONException unused2) {
            }
        } else {
            A11.put("search_engine", str6);
        }
        if (str4 == null) {
            try {
                A11.put("search_query", JSONObject.NULL);
            } catch (JSONException unused3) {
            }
        } else {
            A11.put("search_query", str4);
        }
        if (list == null) {
            jSONArray2 = JSONObject.NULL;
        } else {
            try {
                JSONArray jSONArray3 = new JSONArray();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    DbT.A1W(it, jSONArray3);
                }
                jSONArray2 = jSONArray3;
            } catch (JSONException unused4) {
            }
        }
        A11.put("search_result_uri", jSONArray2);
        if (list2 == null) {
            jSONArray = JSONObject.NULL;
        } else {
            try {
                JSONArray jSONArray4 = new JSONArray();
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    DbT.A1W(it2, jSONArray4);
                }
                jSONArray = jSONArray4;
            } catch (JSONException unused5) {
            }
        }
        A11.put("references_title", jSONArray);
        C53229Gkd gkd = new C53229Gkd();
        gkd.A00("bot_request_id", str3);
        gkd.A00("bot_response_id", str2);
        gkd.A00("text", str);
        gkd.A00("followup_prompt_text", str7);
        try {
            gkd.A00.put("external_search_params", A11);
        } catch (JSONException unused6) {
        }
        return gkd;
    }
}
