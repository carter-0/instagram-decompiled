package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.5r7  reason: invalid class name and case insensitive filesystem */
public abstract class C297065r7 {
    public static String A01(UserSession userSession, 1Xj r4) {
        String organicTrackingToken;
        if (r4.CcK()) {
            organicTrackingToken = C231122qu.A0F(userSession, r4);
        } else {
            organicTrackingToken = r4.A0C.getOrganicTrackingToken();
        }
        return A00((C59543JNp) null, organicTrackingToken, r4.CcK());
    }

    public static String A00(C59543JNp jNp, String str, boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("tracking_token", str);
            jSONObject.put("is_sponsored", z);
            if (jNp != null) {
                for (Map.Entry entry : jNp.B3F().entrySet()) {
                    jSONObject.put((String) entry.getKey(), entry.getValue());
                }
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            0wb.A03("AutomatedLogging_LogContext", "Error getting tracking");
            return null;
        }
    }

    public static ArrayList A02(C2813657d r5) {
        ArrayList arrayList = new ArrayList();
        for (C238873Dt r3 : r5.A05) {
            0bb r2 = new 0bb();
            r2.A01((C238863Ds) r3.A01, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
            Integer num = r3.A00;
            if (num != null) {
                r2.A05("index", Long.valueOf((long) num.intValue()));
            }
            String str = r3.A03;
            if (str != null) {
                r2.A06("thumbnail_id", str);
            }
            String str2 = r3.A02;
            if (str2 != null) {
                r2.A06("product_id", str2);
            }
            arrayList.add(r2);
        }
        return arrayList;
    }
}
