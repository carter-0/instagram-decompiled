package X;

import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.A1x  reason: case insensitive filesystem */
public abstract class C39607A1x {
    /* JADX WARNING: type inference failed for: r0v0, types: [X.9Gq, java.lang.Object] */
    public static final C376129Gq A00(String str) {
        Integer num;
        Integer num2;
        if (str != null) {
            try {
                if (str.length() != 0) {
                    JSONObject jSONObject = new JSONObject(str);
                    long currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis - jSONObject.optLong("timestamp", currentTimeMillis) <= TimeUnit.DAYS.toMillis(45)) {
                        JSONObject optJSONObject = jSONObject.optJSONObject("sso_eligibility");
                        if (optJSONObject != null) {
                            num2 = AnonymousClass05K.A0C;
                            String optString = optJSONObject.optString("3", "2");
                            0qQ.A07(optString);
                            num = ABZ.A00(optString);
                        } else {
                            num = AnonymousClass05K.A0C;
                            num2 = num;
                        }
                    } else {
                        num = AnonymousClass05K.A0C;
                        num2 = num;
                    }
                    JSONObject optJSONObject2 = jSONObject.optJSONObject("nta_eligibility");
                    if (optJSONObject2 != null) {
                        String optString2 = optJSONObject2.optString("3", "2");
                        0qQ.A07(optString2);
                        num2 = ABZ.A00(optString2);
                    }
                    String A01 = ABZ.A01(num);
                    String A012 = ABZ.A01(num2);
                    ? obj = new Object();
                    obj.A01 = A01;
                    obj.A00 = A012;
                    return obj;
                }
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        }
        num = AnonymousClass05K.A0C;
        num2 = num;
        String A013 = ABZ.A01(num);
        String A0122 = ABZ.A01(num2);
        ? obj2 = new Object();
        obj2.A01 = A013;
        obj2.A00 = A0122;
        return obj2;
    }
}
