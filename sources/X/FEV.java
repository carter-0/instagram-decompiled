package X;

import java.util.AbstractCollection;
import org.json.JSONArray;
import org.json.JSONObject;

public final class FEV {
    public final String A00;
    public final C368108s5 A01;
    public final C368238sI A02;

    public FEV(C368108s5 r2, C368238sI r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = "";
    }

    public static void A00(AbstractCollection abstractCollection, JSONArray jSONArray, int i) {
        JSONObject jSONObject = jSONArray.getJSONObject(i);
        abstractCollection.add(new FEV(jSONObject.getString("target_user_id"), C368108s5.valueOf(jSONObject.getString("app_source")), C368238sI.valueOf(jSONObject.getString("credential_source"))));
    }

    public FEV(String str, C368108s5 r2, C368238sI r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = str;
    }
}
