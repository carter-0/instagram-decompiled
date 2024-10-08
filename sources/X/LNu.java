package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class LNu {
    public static LNu A02;
    public C63750L5i A00;
    public C64387Lb4 A01;

    public static final void A00(LNu lNu, String str, JSONObject jSONObject) {
        String str2;
        C63750L5i l5i = lNu.A00;
        if (l5i == null) {
            str2 = "flipperPluginBridge";
        } else if (l5i.A00 == null) {
            str2 = "avatarDebuggerFlipperPlugin";
        } else {
            String str3 = l5i.A01;
            JSONObject A11 = DbS.A11();
            try {
                A11.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str);
                try {
                    A11.put("data", jSONObject);
                    JSONObject A112 = DbS.A11();
                    try {
                        A112.put("instanceId", str3);
                        try {
                            A112.put("timestamp", Long.valueOf(AnonymousClass7TG.A0I()));
                            try {
                                A112.put("event", A11);
                                return;
                            } catch (JSONException e) {
                                throw new RuntimeException(e);
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
            } catch (JSONException e5) {
                throw new RuntimeException(e5);
            }
        }
        0qQ.A0F(str2);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A01(String str, String str2, String str3, Map map) {
        JSONObject A11 = DbS.A11();
        A11.put("requestId", str2);
        A11.put("choices", new JSONObject(map));
        if (str3 != null) {
            A11.put(TraceFieldType.ErrorCode, str3);
        }
        A00(this, str, A11);
    }
}
