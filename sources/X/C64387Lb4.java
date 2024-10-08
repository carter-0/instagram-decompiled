package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.flipper.core.FlipperPlugin;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Lb4  reason: case insensitive filesystem */
public final class C64387Lb4 implements FlipperPlugin {
    public static C64387Lb4 A01;
    public HashMap A00 = AnonymousClass7TE.A1E();

    public final void A00(String str, String str2, JSONObject jSONObject) {
        JSONObject A11 = DbS.A11();
        try {
            A11.put("instanceId", str);
            try {
                A11.put("timestamp", Long.valueOf(AnonymousClass7TG.A0I()));
                try {
                    A11.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str2);
                    if (jSONObject != null) {
                        try {
                            A11.put("payload", jSONObject);
                        } catch (JSONException e) {
                            throw new RuntimeException(e);
                        }
                    }
                } catch (JSONException e2) {
                    throw new RuntimeException(e2);
                }
            } catch (JSONException e3) {
                throw new RuntimeException(e3);
            }
        } catch (JSONException e4) {
            throw new RuntimeException(e4);
        }
    }
}
