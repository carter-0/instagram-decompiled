package X;

import com.facebook.AccessToken;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.util.ArrayList;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class S88 {
    public static final AccessToken A00(JSONObject jSONObject) {
        if (jSONObject.getInt("version") > 1) {
            return null;
        }
        String string = jSONObject.getString("token");
        Date date = new Date(jSONObject.getLong("expires_at"));
        JSONArray jSONArray = jSONObject.getJSONArray("permissions");
        JSONArray jSONArray2 = jSONObject.getJSONArray("declined_permissions");
        Date date2 = new Date(jSONObject.getLong("last_refresh"));
        Integer A00 = S89.A00(Pxe.A0y("source", jSONObject));
        String string2 = jSONObject.getString("application_id");
        String string3 = jSONObject.getString(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID);
        try {
            0qQ.A0A(jSONArray);
            ArrayList A1C = AnonymousClass7TE.A1C();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                String string4 = jSONArray.getString(i);
                0qQ.A07(string4);
                A1C.add(string4);
            }
            0qQ.A0A(jSONArray2);
            ArrayList A1C2 = AnonymousClass7TE.A1C();
            int length2 = jSONArray2.length();
            for (int i2 = 0; i2 < length2; i2++) {
                String string5 = jSONArray2.getString(i2);
                0qQ.A07(string5);
                A1C2.add(string5);
            }
            return new AccessToken(A00, string, string2, string3, A1C, A1C2, date, date2);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static final JSONObject A01(AccessToken accessToken) {
        JSONObject A11 = DbS.A11();
        A11.put("version", 1);
        A11.put("token", accessToken.A02);
        A11.put("expires_at", accessToken.A04.getTime());
        A11.put("permissions", new JSONArray(accessToken.A07));
        A11.put("declined_permissions", new JSONArray(accessToken.A06));
        A11.put("last_refresh", accessToken.A05.getTime());
        A11.put("source", S89.A01(accessToken.A00));
        A11.put("application_id", accessToken.A01);
        A11.put(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, accessToken.A03);
        return A11;
    }
}
