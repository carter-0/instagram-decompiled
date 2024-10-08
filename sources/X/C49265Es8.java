package X;

import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: X.Es8  reason: case insensitive filesystem */
public abstract class C49265Es8 {
    public static F3S A00(String str) {
        JSONObject jSONObject = new JSONObject(str);
        JSONObject A11 = DbS.A11();
        if (jSONObject.has("generic_data")) {
            A11 = jSONObject.getJSONObject("generic_data");
        }
        HashMap A1E = AnonymousClass7TE.A1E();
        Iterator<String> keys = A11.keys();
        while (keys.hasNext()) {
            String A18 = AnonymousClass7TE.A18(keys);
            A1E.put(A18, A11.getString(A18));
        }
        return new F3S(jSONObject.getString(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID), jSONObject.getString("auth_token"), jSONObject.getString("account_type"), A1E, C368108s5.valueOf(jSONObject.getString("app_source")), C368238sI.valueOf(jSONObject.getString("credential_source")));
    }
}
